package enumclass;

public class Volatile_example extends Thread {

	private volatile boolean running=true;
	
	public void run() {
		System.out.println("Thread Is Running !");
		int i=0;
		while(running) {
			
			System.out.println("Server is Running: "+ i++);
		}
	}
	
	public void stopThread() {
		// change and display visibility to other thread
		
		System.out.println("Server Stop by thread");
		running=false;
	}
	
	public static void main(String[] args) throws InterruptedException {
		
		Volatile_example t= new Volatile_example();
		
		// one thread start workin
		t.start();
		
		// stop main thread
		Thread.sleep(2000);
		
		//stop worker thread
		t.stopThread();
		

	}

}
