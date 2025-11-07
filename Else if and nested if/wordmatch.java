// Question: What is the color of the traffic light?
// - If the answer is "red," print "Stop."
// - If the answer is "yellow," print "Get Ready"
// - If the answer is "green," print "Go."
import java.util.Scanner;
class wordmatch{
    public static void main(String args[]){
        String red = "red";
        String green = "green";
        String yellow = "yellow";
        Scanner scan = new Scanner(System.in);
        String traffic = scan.nextLine();
      
      if(traffic.equals("red")){
        System.out.print("Stop");
      }else if(traffic.equals("green")){
        System.out.print("Go");
      }else if(traffic.equals("yellow")){
        System.out.print("Get ready");
      }

    }

}