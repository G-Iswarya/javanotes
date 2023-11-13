//class demo
//{
//	int a = 10;
//	final float f = 12.4f;
//	void display()
//	{
//		System.out.println(a+f);
//	}
//}

//-------------------------------------------------------------------

class sample
{
	int a1 = 2;
	double db = 3.2;
	 static int x = 3;
	void display()
	{
		System.out.print("Outer class : ");
		System.out.println(a1+x);
	}
	static class sample1
	{
		int a1  =20;
		double db1 = 3.2;
		static int y = 2;
		void display()
		{
			System.out.print("Static Inner class "); //static class can access only static var of outer class
			System.out.println(a1+x);
		}
	}
}

//------------------------------------------------------------------------

class sample2
{
	int a1 = 2;
	double db2 = 3.2;
	 int x = 3;
	 static int m = 9;
	void display()
	{
		System.out.printf("Outer class \n",+a1+db2);
	}
	class sample3
	{
		sample3()       //constructor
		{
			System.out.println("This is Constructor of sample3"); 
		}
		int a1  =20;
		double db = 3.2;
		int y = 2;
		void display()
		{
			System.out.println("Non static Inner class \n"+ a1+x+db2+m); //non static class can access all var of outer class
		}
	}
}

//------------------------------------------------------


public class oop {
	void disp()
	{
		System.out.printf("Non static method called inside static method");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		demo d = new demo();
//		d.display();
//		d.a = 20;
//		System.out.println(d.a+d.f);
		sample.sample1 sp1 = new sample.sample1(); //object for inner static class. we can create obj for inner static class without creating obj for outer class
		sample sp = new sample();
		sp.display();
		sp.x = 5;
		sp1.y = 9;
		sp1.display();
		
		//sample2.sample3 sp3 = new sample2.sample3(); --> we cannot directly create obj for non static inner class without creating for outer class
		sample2 sp2 = new sample2();
		sample2.sample3 sp3 = sp2.new sample3(); //object for inner class
		System.out.println(sp2.a1);
		sp3.display();
		sp2.x = 8;
		System.out.println(sp2.x);
		
		oop oo = new oop();
		oo.disp();
	}

}
