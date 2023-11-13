package threads;

public class thread extends Thread {

	public void run() //run is already available method in java thread
	{
		try
		{
			System.out.println("Thread1 "+ Thread.currentThread().getId());
			System.out.println("Thread1 "+Thread.currentThread().getName());
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

}
