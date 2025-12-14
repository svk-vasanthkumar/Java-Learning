import java.util.Random;
class random{
    public static void main(String args[]){
        Random rand = new Random();
        int a = rand.nextInt(100);
        System.out.println(a);
    }
}