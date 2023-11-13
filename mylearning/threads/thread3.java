package threads;
import java.io.*;
public class thread3 implements Runnable {
	
	@Override
	public void run() {
		try
		{
			Thread.sleep(1000);
		}
		catch(InterruptedException e)
		{
			System.out.println(e);
		}
		System.out.println(Main.t1.getState());
//		try
//		{
////			m1.join();
//		}
//		catch(InterruptedException e)
//		{
//			System.out.println(e);
//		}
		System.out.println(Main.t1.getState());
		
	}
	

}
