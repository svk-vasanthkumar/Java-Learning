// Create a class called "School" with main
// function

// Create a function called passorfail which
// should return the string "Pass/Fail"

// Inside Main function get integer input from
// user for total mark.

// Pass that input to the passorfail function and
// let the function decide whether student is
// passorfail

import java.util.Scanner;
class School{
    String passorfail(int mark){
        if(mark >50){
           return "Pass";
        }else{
            return "Fail";
        }

    }
    public static void main(String args []){
     Scanner scan = new Scanner(System.in);
     int mark = scan.nextInt();
     School obj = new School();
    String res = obj.passorfail(mark);
    System.out.println(res);

    }
}