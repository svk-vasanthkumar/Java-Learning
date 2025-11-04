import java.util.Scanner;
class CompareQ2{
    public static void main(String[]args)
    {
        boolean dead = true;
        boolean alive = false;
        Scanner scan = new Scanner(System.in);
        String q = scan.nextLine();
        if(q.equals("dead")){
            System.out.print("surya meet ramya");

        }
        else{
            System.out.print("Surya weds megana");
        }
    }
}