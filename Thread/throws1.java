package svk;


class ja {
	void si() throws Exception {
		
		int a = 11/0;
		
		
	}
}

public class throws1 {
	public static void main(String... args) {
		
		 
		ja aa = new ja();
		try {
		aa.si();
		}
		catch(Exception e ) {
			System.out.println(e);
		}
		
		
	}

}
