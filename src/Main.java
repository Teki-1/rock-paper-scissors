import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void  main (String[] args){

        String[] choices= {"Rock","Paper","Scissors"};
        Scanner scanner= new Scanner(System.in);
        Random random = new Random();
        String playerChoice;
        String computerChoice;
        String playAgain="YES";

        System.out.println("Enter your move; (Rock, Paper, Scissors) ");
        playerChoice=scanner.nextLine().substring(0,1).toUpperCase();




        scanner.close();
    }
}
