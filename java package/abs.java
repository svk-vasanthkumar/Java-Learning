package svk;
abstract class Animal{
	String name;
	
	Animal(String name){
		this.name=name;
		
		
	}
	abstract void makeSoung();
}
	class Dog extends Animal{
		Dog(String name){
			super(name);
		}
		
		void makeSoung() {
			System.out.println("bow bow");
		}
		
	}
	class cat extends Animal{
		 cat(String name){
			 super(name);
		 }
	  void makeSoung() {
		  System.out.println("meow meow");
	  }
	}

public class abs {

	public static void main(String[] args) {
	
		Dog D = new Dog("doogyy");
		System.out.println(D.name);
		D.makeSoung();
		cat C = new cat("coatty");
		System.out.println(C.name); 
		C.makeSoung();
		

	}

}
