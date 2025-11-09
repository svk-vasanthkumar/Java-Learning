import java.util.Scanner;
class smallBignum{
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        String big = num1>num2?"num1 is greater":"num2 is greater";
        System.out.print(big);
    }
}