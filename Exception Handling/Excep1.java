package svk;
import java.util.Scanner;

public class Excep1 {
	public static void main(String []args) {
		Scanner scan = new Scanner(System.in);
		
		try {
			int a = scan.nextInt();
			int b = scan.nextInt();
			int c= a/b;
			System.out.println(c);
			 
			
		}finally {
			System.out.println("fkdj");
		}
	}

}
