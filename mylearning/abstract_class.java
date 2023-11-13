

 abstract class abs
{
	int a;
	abs() //abstract class can have constructor
	{
		System.out.println("abstract class constructor");
	}
	abstract void display(); //we should not define abstract methods inside abstract class
	void msg() //we should define normal methods inside abstract class
	{
		System.out.println("concrete method inside abstract class");
	}
	final void finall()
	{
		System.out.println("final method inside abstract");
	}
	static void staticc()
	{
		System.out.println("static method inside abstract");
	}
}

class concrete extends abs
{

	@Override
	void display() //define abstract method by inheriting
	{   
		System.out.println("abstract methods defined in another class");
	}
	
}


//------------------------abstract outer and inner class-----------------------------

abstract class absOuter
{
	abstract void out();
	abstract static class absInner  //since we cannot create obj for abstract class, no memory is allocated for absInner class, so we cannot call it. so declaring it as static will automatically invoke constructor
	{
		abstract void in();
	}
}
//-------------------------inner 

class outt extends absOuter
{

	@Override
	void out() {
		System.out.println("Extending only Outer abstract class");
		
	}

	
}
class outinn extends absOuter.absInner
{

	@Override
	void in() {
		System.out.println("abstract method inside absInner class");
	}
	
}
class classOuter extends absOuter
{
	class classInner extends absInner
	{
		@Override
		void in() {
			System.out.println("Abstract method of inner abstract class");
		}
	}

	@Override
	void out() {
		System.out.println("Abstract method of outer abstract class");
	}
}


//---------------------------------------------------------------------------------


public class abstract_class {

	public static void main(String[] args) {
		concrete con = new concrete();
		con.display();
		con.msg();
		System.out.println("a "+con.a);
		con.finall();
		//con.staticc();
		abs.staticc();
		
		
		outt ou = new outt();
		ou.out();
		classOuter o = new classOuter();
		o.out();
		classOuter.classInner i = o.new classInner();
		i.in();
	}

}
