
public class namePriority {
public static void main(String[] args)throws Exception {
		
		Thread t1=new Thread(() -> {
			
			for(int i=0; i<=5; i++) {
				System.out.println("Hi" + Thread.currentThread().getPriority());
				try {
					Thread.sleep(1000);
				} catch (Exception e) {
					// TODO Auto-generated catch block
				}
				}
	},"Hi Thread");
      Thread t2=new Thread(() ->{
			for(int i=0; i<=5; i++) {
				System.out.println("Hello" + Thread.currentThread().getPriority());//method 2 for priority
				try {
					Thread.sleep(1000);
				} catch (Exception e) {
					// TODO Auto-generated catch block
				}
			}	
		},"Hello Thread");//method 2 for setname
      
      //method1 for get and set priority
      t1.setPriority(Thread.MIN_PRIORITY);
      t2.setPriority(Thread.MAX_PRIORITY);
      System.out.println(t1.getPriority());
      System.out.println(t2.getPriority());


      //method 1  to set and get name 
    //  t1.setName("Hi Thread");  
      //t2.setName("Hello Thread");
      System.out.println(t1.getName());
      System.out.println(t2.getName());

   t1.start();
  try { Thread.sleep(10);}catch(Exception e) { }
   t2.start();
  
   t1.join();
   t2.join(); //join helps you to print bye after t1 and t2 execution
     System.out.println("Bye"); 
	}
}
