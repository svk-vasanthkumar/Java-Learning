import java.util.Scanner;
class markFailorPass {
    public static void main(String[]args){
        
        Scanner scan = new Scanner(System.in);
        int mark = scan.nextInt();
        if(mark>35){
            System.out.print("pass");
        
    
        }else{
            System.out.print("fail");
        }

    }
}