package svk;

interface Printable{
	void display();
}
interface Showable{
	
	void display();
}

class Docments implements Printable,Showable{
	
	public void display() {
		System.out.println("sssvvvkkkk");
	}
	
	
}

public class interface3 {
	public static void main(String args[]) {
		
		Docments doc = new Docments();
		 doc.display();
		
	}

}
