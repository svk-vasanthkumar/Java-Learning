package svk;
 class a {
	 void s() {
		System.out.println("kj");
	}}
	class b extends a{
		void s() {
			System.out.println("jdfk");
		} 
	}
public class finalKey {
	

	public static void main (String[]args) {
		final int a = 10;
		
		System.out.println(a);
		a f = new a();
		b ff= new b();
		f.s();
		ff.s();
	}
	
	
}
