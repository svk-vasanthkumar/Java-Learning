import java.util.Scanner;
class q2{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();
        int age = scan.nextInt();
        scan.nextLine();
        String address = scan.nextLine();
        System.out.println("name "+name);
        System.out.println("age "+age);
        System.out.println("address "+address);
    }
}