import java.util.*;
public class wrapperr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		byte b=10;  
		short s=20;  
		int i=30;  
		long l=40;  
		float f=50.0F;  
		double d=60.0D;  
		char c='a';  
		boolean b2=true;  
		  
		//Autoboxing: Converting primitives into objects  
		Byte byteobj=b;  
		Short shortobj=s;  
		Integer intobj=i;  
		Long longobj=l;  
		Float floatobj=f;  
		Double doubleobj=d;  
		Character charobj=c;  
		Boolean boolobj=b2;  
		  
		//Printing objects  
		System.out.println("---Printing object values---");  
		System.out.println("Byte object: "+byteobj);  
		System.out.println("Short object: "+shortobj);  
		System.out.println("Integer object: "+intobj);  
		System.out.println("Long object: "+longobj);  
		System.out.println("Float object: "+floatobj);  
		System.out.println("Double object: "+doubleobj);  
		System.out.println("Character object: "+charobj);  
		System.out.println("Boolean object: "+boolobj);
		
		int a=20;  
		Integer k=Integer.valueOf(a);//converting int into Integer explicitly  
		Integer j=a;//autoboxing, now compiler will write Integer.valueOf(a) internally  
		  
		System.out.println(a+" "+k+" "+j); 

	}

}
