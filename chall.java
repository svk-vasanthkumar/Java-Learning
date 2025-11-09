// Get inuput for variable a and b
// and print the number from a to b
// input
// 5
// 10
// output
// 5
// 6
// 7
// 8
// 9
// 10
import java.util.Scanner;
class chall{
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        for (int i=a;i<=b;i++){
            System.out.println(i);
        }
    }
}