import java.util.Scanner;
class DivbyNum{
    public static void main(String[]args){
        
        Scanner scan = new Scanner(System.in);
       
        int num = scan.nextInt();
         
        if(num % 5 == 0){
            System.out.print("Yes");

        }else{
            System.out.print("no");
        }
    }
}