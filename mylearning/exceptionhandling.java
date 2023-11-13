
public class exceptionhandling {

	public static void main(String[] args) {
		int a = 5, b = 0;
		try
		{
			System.out.println(a/b);
		}
		catch(Exception e)
		{
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		finally
		{
			System.out.println("Print irrespective of exception");
		}
		
		//---------nested try-----------------
		
		try
		{
			System.out.println(1/0);
			try
			{
				System.out.println(23/0);
			}
			catch(ArithmeticException e)
			{
				System.out.println(23/2);
			}
			try
			{
				System.out.println(10/0);
			}
			catch(ArithmeticException e)
			{
				System.out.println(10/2);
			}
		}
		catch(Exception e)
		{
			System.out.println("Exception in outer try block");
			System.out.println("In catch block");
		}
		
		//------------------return throw using methods-------------------
		try
		{
			demo();
		}
		catch(NullPointerException e)
		{
			System.out.println("Inside main catch");
		}
		

	}
	
	static void demo()
	{
		try
		{
			throw new NullPointerException("no space to null");
		}
		catch(Exception e)
		{
			System.out.println("inside demo catch");
			throw e;
		}
	}

}
