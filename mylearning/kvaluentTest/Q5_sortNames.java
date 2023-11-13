package kvaluentTest;
import java.util.*;
public class Q5_sortNames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String[] names = new String[n];
		for(int i=0;i<n;i++)
		{
		names[i] = sc.next();
		}
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n-1;j++)
			{
				if((names[j].compareTo(names[j+1]))>0)
				{
					String temp = names[j];
					names[j] = names[j+1];
					names[j+1] = temp;
				}
			}
		}
		for(int i=0;i<n;i++)
		{
		System.out.println(names[i]);
		}
	}

}
