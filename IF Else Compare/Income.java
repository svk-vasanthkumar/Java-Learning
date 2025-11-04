import java.util.Scanner;
class Income{
    public static void main(String[]args){
        int a = 7000;
        Scanner scan = new Scanner(System.in);
        int income = scan.nextInt();
        System.out.println("My income is:"+income);

        if(income > 7000){
            System.out.println("not available ");

        }else{
            System.out.println("avilable");
        }
    }
}