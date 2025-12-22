class Vehicle{
    String brand;
    int year;
    void startEngine(){
        
    }
}
class Car extends Vehicle
{
 String fuelType;
 void startEngine(){
    System.out.println("Car engine starts");

 }
 void drive(){
    System.out.println("Car is driving");

 }
}
class Truck extends Vehicle {
int loadCapacity;
void startEngine(){
    System.out.println("Truck engine starts");
}
void haul(){
    System.out.println("Truck is hauling"); 
}
}

public class Zoo{
    public static void main(String args[]){
        

    }
}