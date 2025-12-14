// Create a class called "Find" with main function

// Create a function called evenorodd with
// integer parameter called int num

// Inside Main function get integer input from
// user.

// Pass that input to the evenorodd function and
// let the function decide whether the number is
// even or odd

import java.util.Scanner;
class Find{
    void even(int num){
        if(num%2 == 0){
            System.out.println("num is even");
        }

    }
    void odd(int num){
        if(num%2 != 0){
            System.out.println("num is odd");
        }

    }
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        Find obj = new Find();
        obj.even(number);
        obj.odd(number);


    }
}