package kvaluentTest2;
import java.util.*;
import java.io.*;
interface MenuItem
{
	String orderfood();
}
class Sandwich implements MenuItem
{ 
int price; 
ArrayList<String> foodname = new ArrayList<String>();
ArrayList<Integer> foodcost = new ArrayList<Integer>();
{
foodcost.add(123);
foodcost.add(112);
foodcost.add(98);
foodname.add("Cheese Burger");
foodname.add("Veg Sandwich");
foodname.add("Club sandwich");
}
	@Override
	public String orderfood() {
		
		return null;
	}
	public int index(int name)
	{
		
		return foodcost.get(name-1);
	}
	
}
class Salad implements MenuItem
{ 
int price; 
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
	public String orderfood() {
		
		return null;
	}
	public int index(int name)
	{
		
		return foodcost.get(name-1);
	}
	
}
class Drink implements MenuItem
{ 
int price; 
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
	public String orderfood() {
		
		return null;
	}
	public int index(int name)
	{
		return foodcost.get(name-1);
	}
	
}
class trio implements MenuItem
{ int sandcost, saladcost, drinkcost;
	int sandname, saladname, drinkname;
	

	public trio(int sandname, int saladname, int drinkname) {
		super();
		this.sandname = sandname;
		this.drinkname = drinkname;
		this.saladname = saladname;
	}
	

	@Override
	public String orderfood() {
		
		return null;
	}
	public void calctrio(int a, int b, int c)
	{
		int price[] = new int[3];
		price[0] = a;
		price[1] = b;
		price[2] = c;
		Arrays.sort(price);
		System.out.println(price[1]+price[2]);
	}
	
}
	
public class Q3_foodmenu {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter sandwich name: ");
		int sandname = sc.nextInt();
		System.out.println("Enter salad name: ");
		int saladname = sc.nextInt();
		System.out.println("Enter drink name: ");
		int drinkname = sc.nextInt();
		trio tri = new trio(sandname, saladname, drinkname);
		Sandwich sw = new Sandwich();
		int sandcost = sw.index(sandname);
		Salad sl = new Salad();
		int saladcost = sl.index(saladname);
		Drink dr = new Drink();
		int drinkcost = dr.index(saladname);
		tri.calctrio(sandcost,saladcost,drinkcost);
		System.out.print(sw.foodname.get(sandname-1)+"/"+sl.foodname.get(saladname-1)+"/"+dr.foodname.get(drinkname-1)+" ");

	}

}
