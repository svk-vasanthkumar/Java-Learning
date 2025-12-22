package svk;
import java.io.FileWriter;
import java.io.BufferedWriter;

public class file1 {
public static void main(String... args) {
	
	try {
	FileWriter fw = new FileWriter("f1.txt");
	BufferedWriter bw = new BufferedWriter(fw);
	bw.write("svk");
	bw.newLine();
	bw.write("kjk");
	bw.close();
	System.out.println("success"); 
	}catch(Exception e) {
		System.out.println("error"); 
	}
	
}
}
