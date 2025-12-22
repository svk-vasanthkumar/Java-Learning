
abstract class parent{
	abstract void svk();
	
}
class child extends parent{
	// void svk(){
	// 	System.out.println("svk");
	// }
	void svkk(){
		System.out.println("vvvv");
	}
	
	}


public class Superkey {
	public static void main(String args[]) {
        
		child c = new child();
		// c.svk();
		c.svkk();
	}

}
