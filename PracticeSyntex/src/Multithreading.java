class hi extends Thread{
	public void run() {
		for(int i=0; i<=5; i++) {
			System.out.println("Hi");
			try {
				Thread.sleep(500);
			} catch (Exception e) {
				// TODO Auto-generated catch block
			}
			}
			
	}
}
class hello extends Thread{
	public void run() {
		for(int i=0; i<=5; i++) {
			System.out.println("Hello");
			try {
				Thread.sleep(500);
			} catch (Exception e) {
				// TODO Auto-generated catch block
			}
			}
	}
}
public class Multithreading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      hi obj1=new hi();
      hello obj2=new hello();
      obj1.start();
     try{ Thread.sleep(10);}catch(Exception e) {}
      obj2.start();
     // Thread t1=new Thread(obj1);
      //Thread t2=new Thread(obj2);

     
      
	}

}
