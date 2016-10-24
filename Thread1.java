package thread;

public class Thread1 implements Runnable {
	Thread t1,t2,t3;
	
	Thread1() {
		t1=new Thread(this);
		t2=new Thread(this);
		t3=new Thread(this);
		t1.setName("PING");
		t2.setName("PONG");
		t3.setName("TONG");
		t3.setDaemon(true);
		t1.start();
		t2.start();
		t3.start();
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		Thread CurrentThread=Thread.currentThread();
		if(CurrentThread.getName().equals("PING"))
		{
			for(int i=0;i<10;i++)
			{
				System.out.println("PING");
			}
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		else if(CurrentThread.getName().equals("PONG"))
		{
			for(int i=0;i<10;i++)
			{
				System.out.println("\t PONG");
			}
			try {
				Thread.sleep(700);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		else if(CurrentThread.getName().equals("TONG"))
		{
			for(; ;)
			{
				System.out.println("\t\t\tTONG");
			}
		}
	}
	public static void main(String args[])
	{
		Thread1 t=new Thread1();
	}

}
