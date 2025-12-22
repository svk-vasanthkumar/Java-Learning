package svk;
class DivisionEx{
	void divideNum() {
		int numerator = 10 ;
		int denominator = 0;
		try {
			double result = numerator / denominator;
			System.out.println(result);
		}catch(ArithmeticException e) {
			
			if(denominator == 0) {
				System.out.println("Cannot divide by 0");
			}
		}
	}
}
public class excep6 {
public static void main(String []args) {
	DivisionEx d1 = new DivisionEx();
	d1.divideNum();
	
	
	
}


}
