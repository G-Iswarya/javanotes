package kvaluentTest2;
import java.util.*;
interface AdvancedArithmetic
{
	int divisior_sum(int n);
}
class MyCalculator implements AdvancedArithmetic
{
	int sum = 0;
	@Override
	public int divisior_sum(int n) {
		for(int i=1;i<=n;i++)
		{
			if(n%i == 0)
			{
				sum+=i;
			}
		}
		return sum;
	}
	
}
public class Q1_interface {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = sc.nextInt();
		AdvancedArithmetic aa = new MyCalculator();
		int divsum = aa.divisior_sum(n);
		System.out.println("The sum of divisors is: "+divsum);

	}

}
