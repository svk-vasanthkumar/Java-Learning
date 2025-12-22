package svk;
interface Sjvk{
	void sound();
	int x = 10;
	
}
class A implements Sjvk{

	@Override
   public void sound() {
		System.out.println("dkjk");
	}

}
public class interfaceJava {
	public static void main (String args[]) {
		A a = new A();
		a.sound();
		System.out.println(a.x);
		
		
	}

}
