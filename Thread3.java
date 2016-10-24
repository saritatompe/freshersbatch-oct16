package thread;

public class Thread3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 new Thread()
		    {
		        public void run() {
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
		    }.start();
		    new Thread()
		    {
		        public void run() {
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
		    }.start();
	}

}
