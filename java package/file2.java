package svk;
import java.io.FileReader;
import java.io.BufferedReader;


public class file2 {
	public static void main(String... args) {
		try {
			FileReader fr = new FileReader("f1.txt");
			BufferedReader br = new BufferedReader(fr);
			
			String l = br.readLine();
			while(l != null) {
			System.out.println(l);
			 l = br.readLine();
			}
			br.close();
			   
			
			
			
		}catch(Exception e) {
			System.out.println(e);
			
		}
	}

}
