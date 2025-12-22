package svk;
class as implements Runnable {
	public void run() {
		System.out.println("kj");
	}
	
}
public class thread3 {

	public static void main(String[] args) {

    Runnable obj = new as();
    Thread th = new Thread(obj);
    th.start();
 
	}

}
