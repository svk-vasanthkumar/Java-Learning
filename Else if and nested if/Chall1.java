// Question: What is the score in a game?
// - If the score is less than 50, print "You need
// to improve."
// - If the score is between 50 and 70
// (inclusive), print "Good job!"
// - If the score is greater than 70, print
// "Excellent performance!"

class Chall1{
    public static void main(String [] args )
    {
     int score = 80;
     if(score < 50){
     System.out.print("You need to improve");
     }
    else if (score >= 50 && score < 70){
        System.out.print("Good job!");
    }
    else if (score > 70){
        System.out.print("Excellent performance!");
        }
    } }
