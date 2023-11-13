package kvaluentTest2;
import java.util.*;
interface MenuItem1
{
	public int item(int n);
}
class Sandwich1 implements MenuItem1
{
	ArrayList<String> foodname = new ArrayList<String>();
	{
	foodname.add("Burger");
	foodname.add("Paneer Sandwich");
	foodname.add("Chicken Sandwich");
	}
	ArrayList<Integer> foodprice = new ArrayList<Integer>();
	{
		foodprice.add(100);
		foodprice.add(120);
		foodprice.add(130);
	}

	@Override
	public int item(int sand) {
		return foodprice.get(sand-1);
		
	}
	public String itemname(int sand)
	{
		return foodname.get(sand-1);
	}
	
}
class Salad1 implements MenuItem1
{
	ArrayList<String> foodname = new ArrayList<String>();
	ArrayList<Integer> foodcost = new ArrayList<Integer>();
	{
	foodcost.add(85);
	foodcost.add(75);
	foodcost.add(90);
	foodname.add("Vegetable salad");
	foodname.add("Spinach salad");
	foodname.add("Fruit salad");
	}

	@Override
	public int item(int salad) {
		return foodcost.get(salad-1);
	}
	public String itemname(int salad)
	{
		return foodname.get(salad-1);
	}
	
}
class Drink1 implements MenuItem1
{

	ArrayList<String> foodname = new ArrayList<String>();
	ArrayList<Integer> foodcost = new ArrayList<Integer>();
	{
	foodcost.add(80);
	foodcost.add(100);
	foodcost.add(78);
	foodname.add("Cappuccino");
	foodname.add("Fresh juice");
	foodname.add("Soda");
	}
	@Override
	public int item(int drink) {
		return foodcost.get(drink-1);
	}
	public String itemname(int drink)
	{
		return foodname.get(drink-1);
	}
}
class trio1
{
	public void price(int a, int b, int c)
	{
		int[] cost = new int[3];
		cost[0] = a;
		cost[1] = b;
		cost[2] = c;
		Arrays.sort(cost);
		System.out.println(cost[1]+cost[2]);
	}
	
}
public class lunchmenu {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//--to access interface method-----------------
		MenuItem1 sw = new Sandwich1();
		MenuItem1 sl = new Salad1();
		MenuItem1 dr = new Drink1();
		//-----------finding cost of selected items----------
		int sandind = sc.nextInt();
		int sandcost = sw.item(sandind);
		int saladind = sc.nextInt();
		int saladcost = sl.item(saladind);
		int drinkind = sc.nextInt();
		int drinkcost = dr.item(drinkind);
		//------finding names of selected items---------------
		Salad1 sl1 = new Salad1();
		String saladname = sl1.itemname(saladind);
		Sandwich1 sw1 = new Sandwich1();
		String sandname = sw1.itemname(sandind);
		Drink1 dr1 = new Drink1();
		String drinkname = sw1.itemname(sandind);
		//--------------print op-----------------------
		System.out.print(sandname+"/"+saladname+"/"+drinkname+" ");
		trio1 tri = new trio1();
		tri.price(sandcost, saladcost, drinkcost);
	}

}
