package kvaluentTest;

import java.util.Scanner;

public class Q5_sortSurname {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String[] names = new String[n];
		for(int i=0;i<n;i++)
		{
		names[i] = sc.nextLine();
		}
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if((names[i].compareTo(names[j]))>0)
				{
					String temp = names[i];
					names[i] = names[j];
					names[j] = temp;
				}
			}
		}
		for(int i=0;i<n;i++)
		{
		System.out.println(names[i]);
		}

	}

}
