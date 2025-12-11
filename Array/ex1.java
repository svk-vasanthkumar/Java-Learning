import java.util.Scanner;
class ex1{
    public static void main (String[]args){
         int[] std = new int[5];
        Scanner scan = new Scanner(System.in);
       
        std[0]= scan.nextInt();
        std[1]= scan.nextInt();
        std[3]= scan.nextInt();
       
        System.out.println(std[0]+std[1]+std[3]);
    }
}