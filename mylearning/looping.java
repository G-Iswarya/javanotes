import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
public class looping {

	public static void main(String args[]) throws IOException
	{
		int a[] = {1,2,3,4,5};
		for(int i:a)
		{
			System.out.println(i);
		}
		
		
		
		FileReader fr = new FileReader("C:\\Users\\iswarya.g\\eclipse-workspace\\DEMOPROJ\\src\\dummy1.txt");
		FileWriter fw = new FileWriter("C:\\Users\\iswarya.g\\eclipse-workspace\\DEMOPROJ\\src\\dummy1.txt");
		BufferedReader br  = new BufferedReader(fr);
		BufferedWriter bw = new BufferedWriter(fw);
		fw.write("hello all"); // or bw.write()
		fw.close();			// or bw.close()
		String j;
		while((j=br.readLine())!= null)
        {  
        System.out.print(j); 
        }
		br.close();
	}
}
