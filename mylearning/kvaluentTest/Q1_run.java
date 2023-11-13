package kvaluentTest;
import java.util.*;
public class Q1_run {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int dist,dist1;
		Scanner sc = new Scanner(System.in);
		while(true)
		{
		System.out.println("Enter a starting distance (between 5km to 8km)");
		dist = sc.nextInt();
		dist1 = dist;
		if(dist>=5 && dist<=8)
		{
			break;
		}
		System.out.println("Sorry, Choose between 5km to 8km");
		}
		while(dist>=1)
		{
			System.out.print("Distance to run: ");
			System.out.println(dist);
			if(dist == dist1-1)
			{
				System.out.println("Good Start, keep it up!");
			}
			if(dist<=2)
			{
				System.out.println("Almost there!");
			}
			dist--;
		}
		System.out.println("Done for the day!");
	}

}
