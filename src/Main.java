import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void  main (String[] args){

        String[] choices= {"rock","paper","scissors"};
        Scanner scanner= new Scanner(System.in);
        Random random = new Random();
        String playerChoice;
        String computerChoice;
        String playAgain="yes";

       do{
           System.out.println("Enter your move; (Rock, Paper, Scissors) ");
           playerChoice=scanner.nextLine().toLowerCase();

           if(!playerChoice.equals("rock") && !playerChoice.equals("paper") && !playerChoice.equals("scissors")) {
               System.out.println("INVALID INPUT");
               continue;
           }

           computerChoice = choices[random.nextInt(3)];
           System.out.println("Computer choice is : "+ computerChoice);

           if( playerChoice.equals(computerChoice)){
               System.out.println("It's a tie");
           }
           else if( playerChoice.equals("rock") && computerChoice.equals("scissors")
                   || playerChoice.equals("paper") && computerChoice.equals("rock")
                   || playerChoice.equals("scissors") && computerChoice.equals("paper")){
               System.out.println("It's a win");
           }
           else{
               System.out.println("You lose!");
           }

           System.out.println("Do you want to play again (Yes / No) ?");
           playAgain= scanner.nextLine().toLowerCase();
       } while(playAgain.equals("yes"));

        System.out.println("Thank you for playing!");





        scanner.close();
    }
}
