package Svk.Constractor;

import com.sun.tools.classfile.StackMapTable_attribute.chop_frame;

class Animal{
	String name;
	int age;
	void MakeSound() {
		System.out.println("Animal make a sound");
	}
}

 class Dog extends Animal{
	 String breed;
	 void MakeSound() {
		 System.out.println("Dog barks");
	 }
 
      void fetch() {
    	  System.out.println("dog is fetch");
 
      }
 }
 
  class Cat extends Animal{
	  String color;
	  
	  void MakeSound() {
		  System.out.println("cat meowww");
	  }
	  
	  void climb() {
		  System.out.println("cat is climb");
	  }
  }
   public class Zoo {
	public static void main (String[]args) {
		Dog d = new Dog();
		d.name="tom";
		d.age = 5;
		d.breed = "golden";
		d.MakeSound();
		d.fetch();
		
		Cat c = new Cat();
		c.name = "jerry";
		c.age = 2;
		c.color = "blue";
		c.MakeSound();
		c.climb();
		
		
		
	}

}
