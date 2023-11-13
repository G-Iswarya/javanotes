public class DEMOPROG {
	static int a = 11;
	int x = 5;
	DEMOPROG()
	{
		System.out.println("This is a constructor");
	}

	public static void main(String[] args) {
		int a = 1234567891;
		System.out.println(a);
		DEMOPROG d = new DEMOPROG(); //object instantiating for class DEMOPROG
		System.out.println(a); //static var need not be accessed using object
		System.out.println(d.x);
		boolean b = false; //cannot initialize 0 or 1 in java
		System.out.println(b);
		byte b1=127;
		System.out.println(b1);
		short sh = 12345;
		System.out.println(sh);
		long l = 1234567891234567890L;
		System.out.println(l);
		char ch = 'a';
		float f = 122345678901234567890123445666657488392.9f;
		double db = 122345678901234567890123445666.9;
		System.out.println(~5);
		System.out.println(5>>2);
		System.out.println(5<<2); //note
	}

}
