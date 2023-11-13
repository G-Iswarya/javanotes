package threads;

public class thread2 implements Runnable {

	@Override
	public void run() {
		try
		{
			System.out.println(Thread.currentThread().getPriority());
			System.out.println(Thread.currentThread().getName());
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
	}
	

}
