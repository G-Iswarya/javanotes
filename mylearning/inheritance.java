class father
{
	int num=1;
	String name="Father";
	void display()
	{
		System.out.println("Father class");
	}
}
class Child extends father
{
	int num=2;
	String name="Child";
	void display() //method override
	{
		System.out.println("Child class");
	}
}

//-------------------------------Chaining constructor in multilevel inheritance-------------------------


class A
{
	A(){
		System.out.println("A class");
	}
}
class B extends A
{
	B(int a)         //no super(a) since A constructor doesn't have parameters
	{
		System.out.println("B class");
	}
	void disp()
	{
		System.out.println("Normal method of B");
	}
}
class C extends B
{
	C(int a)
	{
		super(a); //goto B class constructor with argument a
		System.out.println("C class");
	}
//	void disp()
//	{
//		System.out.println("Normal method of B");
//	}
}


public class inheritance {

	public static void main(String[] args) {
		father f = new father();
		f.display();
		Child c = new Child();
		c.display();
		father fc = new Child();
		System.out.println(fc.name); //var not overriden
		fc.display(); //overriden
//		B b1 = new B(10);
//		b1.disp();
		C c1 = new C(12);

	}

}
