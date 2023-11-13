import java.io.FileNotFoundException;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.*;
import java.io.IOException;
import java.io.InputStreamReader;

public class bufferreader {
	 public static void main(String args[]) throws IOException
	 { 
		 //___________________filereader________________________
		 
		 FileReader f = new FileReader("C:\\Users\\iswarya.g\\eclipse-workspace\\DEMOPROJ\\src\\dummy1.txt");
		 BufferedReader buf = new BufferedReader(f);
		 String i;    
		 System.out.println("FileReader input");
         while((i=buf.readLine())!=null)
         {  
         System.out.print(i);  
         }  
         System.out.println();
         buf.close();    
         f.close();
         
         //____________filewriter________________________
         
         FileWriter writer = new FileWriter("C:\\Users\\iswarya.g\\eclipse-workspace\\DEMOPROJ\\src\\dummy1.txt");  
		    BufferedWriter buffer = new BufferedWriter(writer);  
		    buffer.write("Welcome to javaTpoint.");  
		    buffer.close();  
		    System.out.println("Success");  
         
         
         //_________________buffered reader_______________________
         
         BufferedReader buf1 = new BufferedReader(new InputStreamReader(System.in));
         System.out.println("InputStreamReader input...");
		 String st = buf1.readLine();
		 System.out.println(st);
		 
		

		 System.out.println(buf.markSupported());
		 
//		 String s1 = System.console().readLine();
//		 System.out.println("Console input"+ s1);
		 
		 int x = 90; float y = 2.45f;
		 System.out.printf("x=%d\n",x); //printf holds args of String,object
		 System.out.printf("y=%.2f\n",y);
	 }

}
