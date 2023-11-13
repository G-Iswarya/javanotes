package kvaluentTest;
import java.util.*;
public class Q3_treasure {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		ArrayList<Integer> treasure = new ArrayList<Integer>(50);
//		ArrayList<Integer> sortedTreasure = new ArrayList<Integer>();
		Scanner sc = new Scanner(System.in);
		int i=0,j,sum,sum1,p = 0;
		int len = sc.nextInt();
		int[] treasure = new int[len];
		while(i<len)
		{
			treasure[i] = sc.nextInt();
			i++;
		}
		Arrays.sort(treasure);
		for(int k=0;k<treasure.length;k++) {
			sum=0; sum1 = 0;
		for(i=0;i<=k;i++)
		{
				sum+=treasure[i];
		}
		for(j=k+1;j<treasure.length;j++)
		{
			sum1+=treasure[j];
		}
		if(sum == sum1)
		{
			p = 1;
			break;
		}
		}
		if(p==0)
		{
			System.out.println("False");
		}
		else
		{
			System.out.println("True");
		}
		

	}

}
