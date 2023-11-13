class user extends Exception
{
	public user(String str)
	{
		super(str);
	}
}
public class throww {

	public static void main(String[] args) {
		try
		{
			throw new user("created exception");
		}
		catch(user u)
		{
			u.printStackTrace();
			System.out.println(u);
		}

	}

}
