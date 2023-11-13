package kvaluentTest;
import java.util.*;
public class Q2_maxProfit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int len = sc.nextInt();
		int max = 0,x=1;
		int[] sales = new int[len];
		for(int i=0;i<len;i++)
		{
			sales[i] = sc.nextInt();
		}
		for(int i=0;i<len;i++)
		{
			int sum=0;
			for(int j=i;j<len;j++)
			{
				sum+=sales[j];
				if(sum>max)
				{
					max = sum;
				}
			}
		}
		System.out.println(max);
	}

}
