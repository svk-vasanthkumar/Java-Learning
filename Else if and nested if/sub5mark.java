
// get input for five subjects marks. Add all of it,
// And find average. If
// average mark is less than 35. Print "Additional
// class is required" else
// Print "you are good to go"


import java.util.Scanner;
class sub5mark{
    public static void main (String args []){
        Scanner scan = new Scanner(System.in);

        int m1 = scan.nextInt();
        int m2 = scan.nextInt();
        int m3 = scan.nextInt();
        int m4 = scan.nextInt();
        int m5 = scan.nextInt();

        int add = m1+m2+m3+m4+m5;
        int avg = add/5;
        
        if(avg < 35){
        System.out.print("Additional class is required");
        }
        else{
            System.out.print("You are good to go");
        }
    }
}