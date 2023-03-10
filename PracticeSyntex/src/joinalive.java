
public class joinalive {
	public static void main(String[] args)throws Exception {
		
		Thread t1=new Thread(() -> {
			
			for(int i=0; i<=5; i++) {
				System.out.println("Hi");
				try {
					Thread.sleep(1000);
				} catch (Exception e) {
					// TODO Auto-generated catch block
				}
				}
	});
      Thread t2=new Thread(() ->{
			for(int i=0; i<=5; i++) {
				System.out.println("Hello");
				try {
					Thread.sleep(1000);
				} catch (Exception e) {
					// TODO Auto-generated catch block
				}
			}	
		});
   t1.start();
  try { Thread.sleep(10);}catch(Exception e) { }
   t2.start();
   System.out.println(t2.isAlive()); //shows that the thread is alive or dead
   t1.join();
   t2.join(); //join helps you to print bye after t1 and t2 execution
     System.out.println("Bye"); 
	}
}
