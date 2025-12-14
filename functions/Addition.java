// Create a class called Addition

// this class should have 2 variables
// a=10
// b=20

// Create a function called sum which should add a & b and print the total output

// call the sum function from main method


class Addition{
    
        int a = 10;
        int b = 20;
    void sum(){
        System.out.print(a+b);
    }
    public static void main(String[]args){
        Addition obj = new Addition();
        obj.sum();

    }
}