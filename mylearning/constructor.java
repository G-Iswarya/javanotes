class stud{
	int n,a; String name; double d1;
	public stud()
	{
		System.out.println("Non parameterized Constructor");
	}
	public stud(int...a1) //constructor overloading
	{
		System.out.println("Constructor with array parameters");
	}
	public stud(int a) //constructor overloading
	{ 
		System.out.println("Constructor with parameter");
	}
	public stud(int a, int b) //constructor overloading
	{
		System.out.println(a+b);
		System.out.println("Constructor with 2 parameters of different types");
	}
	
	//-------------------------COPY CONSTRUCTOR-------------------------------------
	
	stud(String name, int n)
	{
		this.name = name;
		this.n = n;
	}
	stud(stud other) //passing obj as argument (copy constructor)
	{
		this.n = other.n;
		this.name = other.name;
	}
	
	//-------------------------------------------------------------------------------
	
	public stud(int a1, double d) //getting in different var names
	{
		this.a = a1; //hence assign those var to declared var
		this.d1 = d;
		System.out.printf("Constructor with different parameters names : ");
		System.out.println(a+d1);
	}
}
public class constructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		stud s1 = new stud();
		stud s2 = new stud(10); //if constructor with 1 int parameter is absent, it will go for array parameterised constructor
		stud s3 = new stud(12, 3);  //if constructor with 2 int parameters is absent, it will go for array parameterised constructor
		stud s4 = new stud(12, 13, 14);
		stud s5 = new stud("Ishu", 17);
		System.out.println(s5.name + s5.n);
		stud s6 = new stud(s5);  //s5 is copied to s6 (copy constructor)
		System.out.print("Copy constructor: ");
		s5.name = "Ice";
		System.out.println(s6.name + s6.n); 
		stud s7 = s5; 
		System.out.print("Shallow copy: ");
		System.out.println(s7.name + s7.n); //shallow copy (sharing same memory space)
		stud s8 = new stud(1,2.3);
		System.out.println(s8.d1 + s8.a); 
		
	}

}
