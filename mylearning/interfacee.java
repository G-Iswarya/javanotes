interface inter
{
	int a = 10;
	void demo1();
	void disp();
}
class dell implements inter
{

	@Override
	public void demo1() {
		// TODO Auto-generated method stub
		System.out.println("demo1 method in interface");
		
	}

	@Override
	public void disp() {
		// TODO Auto-generated method stub
		System.out.println("disp method in interface");
		
	}
	
}
class dell1 implements inter
{

	@Override
	public void demo1() {
		// TODO Auto-generated method stub
		System.out.println("demo1 method in interface");
		
	}

	@Override
	public void disp() {
		// TODO Auto-generated method stub
		System.out.println("disp method in interface");
		
	}
	
}

//----------------------------strictfp--------------------

strictfp class sfp  //gives strict float precision in all compilers
{
	public strictfp double sum()
	{
		int a=10,b=20;
		int s1 = a+b;
		return s1;
	}
}

//--------------------------nested interface----------------------------------

interface inter11
{
	void msg();
	interface inter12
	{
		void msg1();
	}
	interface inter13
	{
		void msg1();
	}
}
class nestedinter implements inter11.inter12
{

	@Override
	public void msg1() {
		// TODO Auto-generated method stub
		
	}
	
}
class nestedinter1 implements inter11.inter13
{

	@Override
	public void msg1() {
		// TODO Auto-generated method stub
		
	}
	
}
class nestedinter2 implements inter11
{
	@Override
	public void msg() {
		// TODO Auto-generated method stub
		
	}
	
}

//----------------------------------class inside interface-------------------------

interface inter14
{
	void msg();
	class class1
	{
		void msg1()
		{
			System.out.println("Method inside class which is inside interface");
		}
	}
}

class interclass1 extends inter14.class1 //to access class use extends
{
	
}

class interclass2 implements inter14  //to access interface use implements
{

	@Override
	public void msg() {
		System.out.println("Method inside interface");
		
	}
	
}
//---------------------interface inside class-----------------------------------

class class2
{
	void msg1()
	{
		System.out.println("Method inside class");
	}
	interface inter15
	{
		void msg();
	}
}

class classinter1 extends class2 //to access class use extends
{
	
}
class classinter2 implements class2.inter15 //to access interface use implements
{

	@Override
	public void msg() {
		// TODO Auto-generated method stub
		System.out.println("method inside interface which is inside class");
		
	}
	
}

//-------------------------------------------------------------------------------

public class interfacee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		dell d = new dell(); //dell class creates its own memory space
		d.demo1();
		d.disp();
		inter d1 = new dell1(); //interface shares memory to dell1 class
		d1.demo1();
		d1.disp();
		sfp s = new sfp();
		System.out.println(s.sum());
		interclass1 ic1 = new interclass1();
		ic1.msg1();
		interclass2 ic = new interclass2();
		ic.msg();
		classinter2 ci = new classinter2();
		ci.msg();
		classinter1 ci1 = new classinter1();
		ci1.msg1();
		
		
	}

}
