package svk;
import java.util.Scanner;
class invalidAgeException extends Exception{
	invalidAgeException(String msg){
		super(msg);
		
		
	}
	
} 
class AgeValidator {
	
	void checkAge(int age ) {
		
		try {
			
			if (age <= 0 || age> 150) {
				throw new invalidAgeException("age is invalid fill correctly daaaaiii");
				
			}
			
			
		}catch( Exception e) {
			System.out.println(e);
			
		}
	}
}
public class ExcepCustom {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		int agee = scan.nextInt();
		AgeValidator a1 = new AgeValidator();
		a1.checkAge(agee);
		
		
		
		
		
		
		
		
		
		
	}

}
