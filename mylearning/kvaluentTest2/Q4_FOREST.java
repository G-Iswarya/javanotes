package kvaluentTest2;
import java.util.*;
interface digital_tree
{
	int absorbSunlight(int hrs);
	void gettreeDetails();
}
class Binarytree implements digital_tree
{
    int time;
	@Override
	public int absorbSunlight(int hrs) {
		
		time = 2*hrs;
		return time;
	}

	@Override
	public void gettreeDetails() {
		String name = "Binary tree";
		System.out.println(name+time);
	}
	
}
class Quantumtree implements digital_tree
{ int time;

	@Override
	public int absorbSunlight(int hrs) {
		
		time = 3*(hrs*hrs);
		return time;
	}

	@Override
	public void gettreeDetails() {
		
		String name = "Quantum tree";
		System.out.println(name+time);
	}
	
}
class Neutraltree implements digital_tree
{
 int time;
	@Override
	public int absorbSunlight(int hrs) {
		time = hrs*hrs*hrs;
		return time;
	}

	@Override
	public void gettreeDetails() {
		
		String name = "Neutral tree";
		System.out.println(name+" "+time);
	}
	
}
class ForestManager {
	int produceEnergy(int a, int b, int c)
	{
		return a+b+c;
	}
}
 

public class Q4_FOREST {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		digital_tree bt = new Binarytree();
		digital_tree qt = new Quantumtree();
		digital_tree nt = new Neutraltree();
		int hrs = sc.nextInt();
		ForestManager fm = new ForestManager();
		int totenergy = fm.produceEnergy(bt.absorbSunlight(hrs),qt.absorbSunlight(hrs),nt.absorbSunlight(hrs));
		System.out.println("Total energy "+totenergy);
		int sum1=0;
		for(int i=0;i<3;i++)
		{ int sum=0;
			String tree = sc.next();
			if(tree.charAt(0) == 'B')
			{
				int val = bt.absorbSunlight(hrs);
				sum+=val;
				bt.gettreeDetails();
			}
			else if(tree.charAt(0) == 'N')
			{
				int val = nt.absorbSunlight(hrs);
				sum+=val;
				nt.gettreeDetails();
			}
			else
			{
				int val = qt.absorbSunlight(hrs);
				sum+=val;
				qt.gettreeDetails();
			}
			sum1+=sum;
			
		}
		System.out.println("Total energy: "+sum1);
		
		
	}

}
