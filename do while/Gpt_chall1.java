import java.util.Scanner;
class Gpt_chall1{
    public static void main(String []args){
        Scanner scan = new Scanner(System.in);
        int atmpin = 1122;
        int userpin;
        do{
             System.out.println("Enter our pin");
             userpin= scan.nextInt();
             if(userpin == atmpin){
                System.out.println("correct pin");
             }else{
                System.out.println("wrong pin");
             }
           
        }while(atmpin != userpin);
    }
}