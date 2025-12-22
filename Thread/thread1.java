package svk;

 class Am extends Thread {
	 public void run() {
		 for(int i = 0;i < 10;i++) {
		 System.out.println("Svk");
		 
		 try {
			Thread.sleep(9);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		 }
	 }
 }
  
 class bm extends Thread{
	 public void run() {
		 for(int i = 0;i<10;i++) {
		 System.out.println("vasanth");
		 try {
			 Thread.sleep(9);
		 }catch(Exception e) {
			 System.out.println(e);
		 }
		 }
	 }
 } 

public class thread1 {
	public static void main(String... args) {
		
		Am a  = new Am(); 
		bm b = new bm();
		a.setPriority(1); 
		b.setPriority(7); 
		a.start(); 
		b.start();
	
		
	}

}
