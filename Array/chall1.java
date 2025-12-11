// Get input for 5 Numbers using Array
// and for loop



// import java.util.Scanner;
// class chall1{
//     public static void main(String[]args){
//     int[] num = new int[4];
//     Scanner scan = new Scanner(System.in);
//     num[0] = scan.nextInt();
//     num[1] = scan.nextInt();
//     num[2] = scan.nextInt();
//     num[3] = scan.nextInt();
//     num[4] = scan.nextInt();
//     for(int i=0;)
//     }
// }

// using for

import java.util.Scanner;
class chall1{
    public static void main(String[]args){
   
    Scanner scan = new Scanner(System.in);
     int[] mark = new int[5];

    for(int i=0; i<=4;i++) 
    {
        mark[i] = scan.nextInt();
       
    }

    for(int i=0;i<=4;i++)
    {
         System.out.println(mark[i]);
        
    }
    }
}