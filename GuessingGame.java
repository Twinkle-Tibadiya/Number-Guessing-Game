import java.lang.Math;
import java.util.Scanner;
class GuessingGame{
     public static void main(String[] args) {
        int ans=(int)(Math.random()*100)+1;
        //This is no. of attempts
        int k=10;
        boolean correct=false;
        Scanner sc=new Scanner(System.in);
        System. out.println("I'm thinking of a number between 1 and 100.\nYou have  only 5 tries to guess the number.");

        while(k>0)
        {
            System.out.println("Enter your guess:");
            int guess=sc.nextInt();
            if(guess==ans)
            {
                System.out.println("You guess the number!\n You win!");
                correct=true;
                break;
            }
            else {
                if(guess>ans)
                {
                    System.out.println("Your guess is too high!.\n You have " + (k-1) + " tries left.");
                }
                else
                {
                    System.out.println("your guess is too low.!\n You have " + (k-1) + " tries left.");
                }
                
            }
            k--;
        }
        if(correct==false){
            System.out.println("You ran out of tries.\n You lose!");    
        }
        int score=100-(5*(10-(k)));
        System.out.println("Your score is:" + score);
    }
}
