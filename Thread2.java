package thread;

public class Thread2 extends Thread{

	Thread2(String name,Boolean b) {
		setName(name);
		if(b==false)
		{
		start();
		}
		else
			{
			setDaemon(true);
			start();
			}
	}
	
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
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread2 t1=new Thread2("PING",false);
		Thread2 t2=new Thread2("PONG",false);
		Thread2 t3=new Thread2("TONG",true);
	
	}

}
