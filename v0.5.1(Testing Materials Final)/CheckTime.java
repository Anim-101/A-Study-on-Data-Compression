import java.io.*;
import java.lang.*;
import java.util.Scanner;

public class CheckTime
{
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
					final File firstFolder = new File("C://Users/Anim/Desktop/v0.5/Dust/DeCompressorDust");
					swap=0;
					listFilesForFolder(firstFolder,swap);
					choice=1;
					break;
				case 1:
					final File secondFolder = new File("C://Users/Anim/Desktop/v0.5/JavaDecompressor");
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
		String [] parameters = new String[3];
		if(swap==0)
		{			
			parameters[0]="C://Users/Anim/Desktop/v0.5/Vitter_Basic_Modified_DeCompressor.exe";
			parameters[2]="C://Users/Anim/Desktop/v0.5/Dust/CompressorDust";
		
			for(final File fileEntry : folder.listFiles())
			{
				try
				{
					fileName=fileEntry.getName();
				
					parameters[1]="C://Users/Anim/Desktop/v0.5/Dust/DeCompressorDust";
					parameters[2]="C://Users/Anim/Desktop/v0.5/Dust/CompressorDust";
					
					String remove="Compressed";
					String finalFileName=fileName.replace(remove,"");
					p=new ProcessBuilder(parameters[0],parameters[1]+"/"+fileName,parameters[2]+"/DeCompressed"+finalFileName).start();
				
					BufferedReader input = new BufferedReader(new InputStreamReader(p.getInputStream()));
				
					BufferedReader error = new BufferedReader(new InputStreamReader(p.getErrorStream()));
				
					System.out.println("\n"+fileName);
					
					while((line=input.readLine())!=null)
					{
						System.out.println(line);
					}
					while((line=error.readLine())!=null)
					{
						System.out.println(line);
					}
					input.close();
					error.close();
				}
				catch(IOException f)
				{
					System.out.println("Process Not Read"+f);
				}
			}
		}		
					
		else if (swap==1)
		{			
			parameters[0]="C://Users/Anim/Desktop/v0.5/Vitter_Basic_Modified_DeCompressor.exe";
			parameters[2]="C://Users/Anim/Desktop/v0.5/Dust/CompressorDust";
		
			for(final File fileEntry : folder.listFiles())
			{
				try
				{
					fileName=fileEntry.getName();
				
					parameters[1]="C://Users/Anim/Desktop/v0.5/JavaDecompressor";
					parameters[2]="C://Users/Anim/Desktop/v0.5/Dust/CompressorDust";
					
					String remove="Compressed";
					String finalFileName=fileName.replace(remove,"");
				
					p=new ProcessBuilder(parameters[0],parameters[1]+"/"+fileName,parameters[2]+"/DeCompressed"+finalFileName).start();
				
					BufferedReader input = new BufferedReader(new InputStreamReader(p.getInputStream()));
				
					BufferedReader error = new BufferedReader(new InputStreamReader(p.getErrorStream()));
					
					System.out.println("\n"+fileName);
					
					while((line=input.readLine())!=null)
					{
						System.out.println(line);
					}
					while((line=error.readLine())!=null)
					{
						System.out.println(line);
					}
					input.close();
					error.close();
				}
				catch(IOException f)
				{
					System.out.println("Process Not Read"+f);
				}
			}
		}
		
	}	
}