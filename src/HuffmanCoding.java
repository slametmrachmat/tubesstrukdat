import java.io.FileNotFoundException;
import java.util.*;

public class HuffmanCoding {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner input=new Scanner(System.in);
		huffmanDecompress d=new huffmanDecompress();
		Huffman c=new Huffman();
		
	System.out.println("Compression and Decompression text file using huffman code ");
	int x=0;
	while(x==0){
	System.out.println("Type C if you want to Compress File");
	System.out.println("Type D if you want to Compress File");
	
	String pilihan=input.next();
	if(pilihan.equals("C")){
		c.main(args);
		System.out.println("Compression Finished");
		x=1;
	}
	else if(pilihan.equals("D")){
		d.bacaFile();
		System.out.println("Decompression Finished");
		x=1;
	}
	else{
		System.out.println("Try Agin, your typing is incoorrect");
		
	}}
	
	
	}

}