//interface father
//{
//	void disp();
//}
//interface Mother
//{
//	void disp();
//}
//class Cchild implements father, Mother
//{
//
//	@Override
//	public void disp() {
//		// TODO Auto-generated method stub
//		System.out.println("Father and mother methods");
//		
//	}
//	
//}

//-----------------------------------------------------------------------------

interface inter1
{
	void disp1();
}
interface inter2
{
	void disp2();
}
interface inter3 extends inter1, inter2
{
	void disp3();
}
class interclass implements inter3
{

	@Override
	public void disp1() {
		// TODO Auto-generated method stub
		System.out.println("interface1");
	}

	@Override
	public void disp2() {
		// TODO Auto-generated method stub
		System.out.println("interface2");
		
	}

	@Override
	public void disp3() {
		// TODO Auto-generated method stub
		System.out.println("interface3");
		
	}
	
}
//-------------------------------------------------------------

interface mull
{
	static int a = 2;
	default void display()
	{
		System.out.println("default method can be defined inside interface");
	}
}
class mullclass implements mull
		{
			
		}

//------------------------------------------------------

interface stat
{
	static int a = 3;
	static void display()
	{
		System.out.println("static method can be accessed without implementing class as it doesn't need object to call");
	}
}

//-----------------------------------------------------------------


public class multiple_inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		inter1 i1 = new interclass();
		inter2 i2 = new interclass();
		inter3 i3 = new interclass();
//		father f = new Cchild();
//		f.disp();
		i1.disp1();
		//i1.disp2(); --> cannot access i2 and i3
		i2.disp2();
		//i2.disp3(); --> cannot acesss i1 amd i3
		i3.disp1();
		i3.disp2();
		i3.disp3(); //--> 
		mull m = new mullclass();
		m.display();
		stat.display();
		System.out.println(stat.a);
	}

}
