# A-Study-on-Data-Compression

Undergraduate thesis project at AIUB. This thesis is entitled as "A Study on Data Compression: Construction new approach for data
compression understanding, implementing, updating, & comparing with the standard techniques" in final submission of the thesis project report.

For reference this website is followed to study/understand algorithms: https://sites.google.com/site/datacompressionguide/Home

| Versions | Sub Versions | Version Name | Implementation |
| --- | --- | --- | --- |
| v0.1 |   | Shannon Fano with Bugs | BitIO.c |
|   |   |   | BitIO.h |
|   |   |   | ShannonFano.c |
|   |   |   | ShannonFano.h |
|   |   |   | ShannonFanoCompressor.c |
|   |   |   | ShannonFanoDeCompressor.c |
|   |   |   | uTypes.h |
|   |   |   | \*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\* |
|   | v0.1.1 | Shannon Fano Final | Same BitIO as v0.1 |
|   |   |   | Bugs Removed |

| v0.2 |   | Huffman | Same BitIO as v0.1 |
| --- | --- | --- | --- |
|   |   |   | Huffman.c |
|   |   |   | Huffman.h |
|   |   |   | Coder/Decoder |
|   |   |   | HuffmanCompressor.c |
|   |   |   | HuffmanDeCompressor.c |

| v0.3 |   | Lempel Ziv | Updated BitIo |
| --- | --- | --- | --- |
|   |   |   | Coder/Decoder |
|   |   |   | Lempel Ziv Implementaions |

| Versions | Sub Versions | Version Name | Implementation |
| --- | --- | --- | --- |
| v0.4 |   | Update to All Previous Version | All Old Versions are Updated with Time Constrains |
|   |   | Also new Updates are added Later | Newly created Versions are also Added here with |
|   |   |   | fewer printing options with Time Constraints |
| v0.5 |   | Testing Materials | New Java programs are added for Testing Purpose |
|   |   |   | Basic (Implemented Coder/Decoder) are taken to test |
|   |   |   | Our own versions of Testing Materials are added |
|   |   |   | Test data is Collected (Which was used for Google&#39;s |
|   |   |   | Snappy and Brotli) |
|   |   |   | Standard Tools (Gzip) is taken |
|   |   |   | Our own versions of java program is used to test |
|   |   |   | data with Gzip |
|   |   |   | Ratios are measured and taken |
|   |   |   | \*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\* |
|   | v0.5.1 | Update (Testing Materials Final) | All from v0.5 |
|   |   |   | Updated and Final Test Data is added |
|   |   |   | Unit Testing Files are added |

| v0.6 |   | **Adaptive Huffman-FGK** | Base BitIO from v0.4 |
| --- | --- | --- | --- |
|   |   |   | AdaptiveHuffman.c |
|   |   |   | FGK.c(Basic Adaptive Huffman is Followed) |
|   |   |   | FGK coder/Decoder |

| Versions | Sub Versions | Version Name | Implementation |
| --- | --- | --- | --- |
| v0.7 |   | Adaptive Huffman-Vitter (Basic) | Base BitIO from v0.4 |
|   |   |   | AdaptiveHuffman.c |
|   |   |   | Vitter(Basic Adaptive Huffman Vitter&#39;s Algorithm |
|   |   |   | is followed) |
|   |   |   | Vitter&#39;s Coder/Decoder |
|   |   |   | \*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\* |
|   | v0.7.1 | **Modified Vitter** | Modification is Made within Vitter&#39;s |
|   |   |   | Tree Structure is changed |
|   |   |   | \*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\* |
|   | v0.7.2 | **New Vitter** | Updated Encoder/Decoder |
|   |   |   | Old Encoder |
|   |   |   | New Decoder |

| v0.8 |   | **LZ\_ADHUF\_FGK** | Base BitIO from v0.4 |
| --- | --- | --- | --- |
|   |   |   | v0.6&#39;s ADHUF-FGK is used |
|   |   |   | Linked List is used for Lempel Ziv |
|   |   |   | Final Coder/Decoder |

| v0.9 |   | **LZ\_ADHUF\_Vitter (Basic)** | Basic BitIo Same as v0.8 |
| --- | --- | --- | --- |
|   |   |   | For ADHUF-Vitter&#39;s Algorithm is used |
|   |   |   | Encoder/Decoder |
|   |   |   | \*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\* |
|   | v0.9.1 | **LZ\_ADHUF\_Vitter (Modified)** | v0.7.1&#39;s Modification is followed in ADHUF sectionOthers-Same as V0.9 |
|   |   |   |
|   |   |   | \*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\* |
|   | v0.9.2 | **LZ\_ADHUF\_Vitter(New)** | As LZ is used dictionary search is not quite possibleto identify the correct word from encoder to decoderThus this new method doesn&#39;t suit as we thought.It&#39;s Limitations |
|   |   |   |
|   |   |   |
|   |   |   |

| Versions | Sub Versions | Version Name | Implementation |
| --- | --- | --- | --- |
| v1.0 |   | V0.8 with Hashing Technique | Changed the LZ77 initialization. Instead of linked listHash Techniques were used, new Hash Table (Simple)is usedEncoder/Decoder is designed based on our HashTechniques |
|   |   |   |
|   |   |   |
|   |   |   |
|   |   |   |

| v.1.1 |   | v0.9 with Hashing Technique | Samper as v1.0Vitter is used |
| --- | --- | --- | --- |
|   |   |   |
|   |   |   | \*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\* |
|   | v1.2 | v0.9.1 with Hasing Technique | Same as v1.1Modified Vitter is used |
|   |   |   |
|   |   |   | \*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\* |
|   |   |   | version 1.3 is not done as we have discussed theLimitation above in v0.9.2. So it&#39;s not possible for nowLater maybe some modification or diagnosis can beapplied |
|   |   |   |
|   |   |   |
|   |   |   |

                                Table: Version Map of The work of entire Code Base
| v2.0 |   | All Exes | All Runnable Exes from previous version is addedThrough cmd exe&#39;s are runnable to compress data andTo decompress data with checking ratios |
| --- | --- | --- | --- |
|   |   |   |
|   |   |   **Final Version** |
