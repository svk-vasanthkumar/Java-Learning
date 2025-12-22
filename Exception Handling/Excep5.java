package svk;
import java.util.Scanner;

class NOentry extends Exception{
	
	NOentry(String msg){
		super(msg);
		
	}
	
}

public class Excep5 {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		try {
			int age = scan.nextInt();
			if(age <  18) {
			throw new NOentry("svk msg not allow 18- Podaaaa");
			}
	
		}catch(Exception e) {
			System.out.println(e);
			
		}
		
	}

}
