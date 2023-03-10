class counter{
	int count;
	public synchronized void increment() { //synchronized method used to execute thread one after another
		count++;
	}
}
public class Synchronized {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		counter c=new counter();
		
		Thread t1=new Thread(new Runnable() 
		{
			public void run() {
			for(int i=1;i<=1000;i++) {
				c.increment();
			}
			}
		});
		
		Thread t2=new Thread(new Runnable() 
		{
			public void run() {
			for(int i=1;i<=1000;i++) {
				c.increment();
			}
			}
		});
		t1.start();
		t2.start();
		t1.join();
		t2.join();
		System.out.println("Count" + c.count);

	}

}
