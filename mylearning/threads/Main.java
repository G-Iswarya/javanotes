package threads;

public class Main implements Runnable{
	public static Thread t1;
	public static Main m1;

	public static void main(String[] args) {
//		for(int i=0;i<=8;i++)
//		{
//			thread t1 = new thread();
//			t1.start();
//			System.out.println("-----------------");
//			Thread t2 = new Thread(new thread2());
//			t2.start();
//			System.out.println("-----------------");
//		}
		m1 = new Main();
		t1 = new Thread(m1);
		System.out.println(t1.getState());
		t1.start();
		
		

	}

	@Override
	public void run() {
		thread3 t3 = new thread3();
		Thread t31 = new Thread(t3);
		System.out.println(t31.getState());
		t31.start();
		
	}

}
