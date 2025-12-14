// Get input for variable a. input should be
// greater than 10;

// if input is not greater than 10 gsk the
// user to re enter until he types the right
// input


import java.util.Scanner;
class doWhile{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
       int count = 0;
        do{
            System.out.println("Enter num greater 10 bro");
            count = scan.nextInt();

        }while(count>10);
    }
}