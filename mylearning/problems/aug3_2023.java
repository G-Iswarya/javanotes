package problems;
import java.util.*;

//----------------------------1. add,mul,sum of squares using inheritance---------------------------

class cls1
{
	void add(int p, int q)
	{
		System.out.println(p+q);
	}
}
class cls2 extends cls1
{
	void mul(int p, int q)
	{
		System.out.println(p*q);
	}
	void task(int p, int q)
	{
		System.out.println((int)(Math.pow(p, 2))+(int)(Math.pow(q, 2)));
	}
}




//-------------------------------main method-------------------------------------------

public class aug3_2023 {

	public static void main(String[] args) {

		cls2 c2 = new cls2();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i=0;i<n;i++)
		{
			int p = sc.nextInt();
			int q = sc.nextInt();
			c2.add(p, q);
			c2.mul(p, q);
			c2.task(p, q);
		}
		
//----------------------2. array query------------------------------------
		
		int n1 = sc.nextInt();
		for(int i=0;i<n1;i++)
		{ ArrayList<Integer> al = new ArrayList<Integer>();
			int noOfOperations = sc.nextInt();
			for(int j=0;j< noOfOperations;j++)
			{
				
				int a = sc.nextInt();
				int b = sc.nextInt();
				if(a == 1)
				{
					al.add(b);
				}
				else
				{
					for(int k=0;k<al.size();k++)
					{
						al.set(k, al.get(k)^b);
					}
				}
			}
			System.out.println(al);
			
		}
	}

}
