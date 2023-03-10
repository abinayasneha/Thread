
public class Runnablelambda {
	public static void main(String[] args) {
	
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
     
      
	}
}
