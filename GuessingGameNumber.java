import java.util.Scanner;
import java.util.Random;

public class GuessinGame{
  public static void main(String[] arga){
    Scanner input = new Scanner(System.in);
    Random random = new Random();

    System.out.println("===Number Guessing Game===\n");
    System.out.println("I'm thinking of a number between 1 and 100.");
    System.out.println("Try to guess it! \n");
    
    int secretNumber= 11;
    int guess = o;
    int attempts = 0;

    while (guess != secretNumber){
      System.out.print("Enter your guess: ");
      guess = input.nextInt();
      attempts++;

      if (guess <SecretNumber){
        System.out.println("Too low! Try again.\n");
      } else if(guess > secretNumber){
        System.out.println("Too high! Try again.\n");
      }else{
        System.out.println("\n Congratulation");
        System.out.println(" You guessed it in "+ attempts + "attempts!");
      }

      if (attempts <= 5){
        System.out.println("Rating: Exellent! You're a mind reader");
      }else if(attempts <=10){
        System.out.println("Rating: Good job!");
      } else{
        System.out.println("You got it eventually!");
    }
  }
}
