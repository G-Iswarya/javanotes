package kvaluentTest2;
import java.util.*;
public class Q2_alienlang {

	public static void main(String[] args) {
		int flag = 0;
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		System.out.println("Enter n");
		int n = sc.nextInt();
		System.out.println("Enter k");
		int k = sc.nextInt();
		ArrayList<String> dict = new ArrayList<String>();
		
		for(int i=0;i<n;i++)
		{
			String ip = sc.next();
			dict.add(ip);
			sb.append(ip.charAt(0));
		}
		int currindex = 0;
		String order = sc.next();
		for(int i=0;i<n;i++)
		{
			int index = order.indexOf(sb.charAt(i));
			if(index<currindex)
			{
				flag = 1;
				break;
			}
			currindex = index;
		}
		if(flag == 0)
		{
			System.out.println(1);
		}
		else
		{
			System.out.println(0);
		}
	}

}
