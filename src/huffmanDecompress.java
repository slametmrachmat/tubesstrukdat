import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class huffmanDecompress {
	
	//public static HashMap<Character, String> charToCode;
//    public static HashMap<String, Character> codeToChar;
 
	
	public void bacaFile() throws FileNotFoundException{
		// Read all the contents of the file
		Scanner s=new Scanner(System.in);
		System.out.println("Type the full path where you located your compression file");
		String t4file=s.next();
        String text = new Scanner(new File(t4file)).useDelimiter("\\A").next(); // nextLine(); // change it if you only want to read a single line without the new line character.
 // Count the frequency of all the characters
        
       // System.out.println(text);
        
        String parts[] = text.split("->");
        char bin[] =new char[parts[parts.length-1].length()];
       // int jk=0;
        //for(int i=1;i<7;i=i+2){ 
            
        	//huruf[jk]=parts[i];
        	//jk=jk+1;}
        
        //for(int i=0;i<angka.length;i=i+2){ 
          //  angka[i=i-1]=parts[i];}
        
      //for(int i=0;i<7;i=i++){ 
        // System.out.println(huruf[i]);}
        
        
        
      for(int i=0;i<parts[parts.length-1].length();i++){ 
       bin[i]=parts[parts.length-1].charAt(i);}
       
       
      // System.out.println("daftarbin");
       //for(int i=0;i<bin.length;i++){
       //System.out.print(bin[i]);}
       
      // System.out.println("");
       
       //System.out.println("daftar parts");
       //for(int i=0;i<parts.length;i++){
       //System.out.print(parts[i]+" "); }
       
       //System.out.println("");
       
      //System.out.println("hasil akhir");
       String jumlahbin="";
       String hasilakhir="";
       
     //for(int i=0;i<bin.length;i++){
    	// jumlahbin=jumlahbin+bin[i];
    	// System.out.println(jumlahbin);
      // }
     
     for(int i=0;i<bin.length;i++){
    	 jumlahbin=jumlahbin+bin[i];
       for(int j=0;j<parts.length-1;j=j+2){
        	if(jumlahbin.equals(parts[j])){
        		//System.out.print(parts[j+1]);
        		hasilakhir=hasilakhir+parts[j+1];
        		jumlahbin="";
        		break;}
        	}}
     
 	System.out.println("Type the full path where will you save your file, Save is as .bin");
 	String SaveTo=s.next();
     PrintWriter oFile = new PrintWriter(SaveTo);
     oFile.print(hasilakhir);
     oFile.close();
        
	}
	
	
	public static void main(String[] args) throws FileNotFoundException {
		huffmanDecompress tet=new huffmanDecompress();
		tet.bacaFile();
	}

}