import java.util.Scanner;
class SwitchCase {
    public static void main(String... args){
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();



        switch (s){
           case "saa":
            System.out.println("a");
            break;
            case "vasanth":
                System.out.println("b");
                break;
                default:
                    System.out.println("c");

        }
        
    }
}