import java.util.Scanner;
class q3{
    public static void main(String [] args)
    {
        Scanner scan = new Scanner(System.in);
       String name = scan.nextLine();
       float score = scan.nextFloat();
       scan.nextLine();
       String dept = scan.nextLine();
       System.out.println("my name is "+name);
       System.out.println("my score is "+score/10 +" /10");
       System.out.print("my dept is "+dept);

    }
}