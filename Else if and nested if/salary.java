// Get input for salary and age. If salary greater than or equal to 20000 or age less than or equal to 25,
// get input for required loan amount. If not print you are not eligible for loan.
// If required loan amount is less than or equal to 50,000 print You are
// eligible for loan. If it is greater than 50,000 print maximum loan amount is 50000.


import java.util.Scanner;
class salary{
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        int salary = scan.nextInt();
        int age = scan.nextInt();


        if (salary >= 20000 || age<=25 ){
            System.out.println("eligible for loan");
            int lone = scan.nextInt();
            if(lone <= 50000){
            System.out.print("You eligible for loan amount "+lone);
        }else if (lone >50000){
            System.out.println("maximum lone is 50000");
        }

        }else {
            System.out.print("No loan");
        }
        
        

    }
}