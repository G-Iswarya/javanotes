package problems;

public class functions {
	public static void demo(Integer a)
	{
		System.out.println("This is method overloading with an integer parameter");
	}
	public static void demo(int a, int b)
	{
		System.out.println("This is overloading with 2 parameters");
	}
	public static void demo(double d)
	{
		System.out.println("This is overloading with different datatype");
	}
	public static void demo()
	{ 
		System.out.println("This is static method without arguments");
	}
	public static int demo(Integer a, Double d)
	{
		System.out.println("This is static method with different datatype arguments");
		return 1;
	}
	public void fun11(String n2)
	{
		System.out.println("Fun11(String)");
	}
	public void fun11(Integer n2)
	{
		System.out.println("Fun11(Integer)");
	}
	public void demo1(int a, int ...a1)
	{
		for(int i:a1)
		System.out.println(i+" ");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		functions f = new functions();
		//f.demo();
		functions.demo(); //using className
		demo(); //without using any instance/className
		demo(10);
		demo(10,20);
		demo(2.5);
		Integer x = demo(2,5.2);
		System.out.println("x is: "+x);
		Integer a1 = null;
		String a2 = null;
		//f.fun11(null); -->error:ambiguous datatype 
		f.fun11(a2);
		f.fun11(a1);
		f.demo1(9,10,11,12,13); //1st arg is a, rest are a1
	}

}
