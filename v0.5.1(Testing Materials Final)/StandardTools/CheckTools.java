import java.io.*;
import java.io.File;
import java.lang.*;
import java.util.Scanner;
import java.util.*;
import java.text.*;

public class CheckTools
{
	static Map<String,Long>map = new HashMap<String,Long>();
	
	public static void main(String []args)
	{
		
		int choice=1,val;
		int swap;
		while (choice==1)
		{
				System.out.println("\nIf Files Are in Dust Then Press 0");
				System.out.println("If Files Are in JavaDeCompressor Then Press 1");
				System.out.println("Press Any Numbers Except 0 or 1 To Exit");
				Scanner scan=new Scanner(System.in);
				val=scan.nextInt();
				switch (val)
				{
					case 0:
						final File firstFolder = new File("C://Users/Anim/Desktop/v0.5/StandardTools/ToCompress");
						swap=0;
						listFilesForFolder(firstFolder,swap);
						choice=1;
						break;
					case 1:
						final File secondFolder = new File("C://Users/Anim/Desktop/v0.5/StandardToolS/ToCompress");
						swap=1;
						listFilesForFolder(secondFolder,swap);
						choice=1;
						break;
					default:
					choice=4;
					break;
				}
		}			
		
	}
	
	public static void listFilesForFolder(final File folder,int swap)
	{
		Process p;
		String line;
		String fileName;
		String [] parameters = new String[2];
		
		if (swap==0)
		{
			//Change Exe files here
			parameters[0]="C://Users/Anim/Desktop/v0.5/StandardTools/gzip.exe";
			parameters[1]="C://Users/Anim/Desktop/v0.5/CompresedFiles";
			
			for(final File fileEntry : folder.listFiles())
			{
				try
				{
					fileName=fileEntry.getName();
				
					parameters[0]="C://Users/Anim/Desktop/v0.5/StandardTools/gzip.exe";
					parameters[1]="C://Users/Anim/Desktop/v0.5/StandardTools/ToCompress";
					
					p=new ProcessBuilder(parameters[0],parameters[1]+"/"+fileName).start();
					
					BufferedReader input = new BufferedReader(new InputStreamReader(p.getInputStream()));
								
					//System.out.println("\n"+fileName);
					
					System.out.println("\n"+fileName);
					System.out.println(fileEntry.length());
					map.put(fileName,fileEntry.length());
					
					input.close();
					
				}
				catch(IOException f)
				{
					System.out.println("Process Not Read"+f);
				}
			}
		}
		else if(swap==1)
		{
			for(final File fileEntry : folder.listFiles())
				{
					fileName=fileEntry.getName();
					
					//gz for gzip.exe and bz2 for bzip2.exe and 
					
					String remove=".gz";
					String finalFileName=fileName.replace(remove,"");
					Long value = map.get(finalFileName);
					long l = value.longValue();
								
					System.out.println("\n"+finalFileName);
					System.out.println(fileEntry.length()+" bytes");
					System.out.println("\nCompression Ratio :");
					double ratio =((((double)l-(double)fileEntry.length())/(double)l)*(float)100);
					DecimalFormat df = new DecimalFormat("#.####");
					System.out.println(df.format(ratio)+" %");
						
				}
			
		}
	}	
}