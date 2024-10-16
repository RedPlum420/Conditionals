import java.util.Scanner;


public class Main {
   public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);


       int NumberToGuess = 5;


       Game myGame = new Game();


       System.out.println("You will need to guess a number as your task today. \nYou have three attempts to guess a number between 1 and 10.");


       System.out.println("Now guess your number: ");
       int GuessedNumber = scanner.nextInt();
       myGame.StartGame(NumberToGuess, GuessedNumber);


       System.out.println("Now guess your number: ");
       GuessedNumber = scanner.nextInt();
       myGame.StartGame(NumberToGuess, GuessedNumber);


       System.out.println("Now guess your number, last chance!!! ");
       GuessedNumber = scanner.nextInt();
       myGame.StartGame(NumberToGuess, GuessedNumber);


       System.out.println("Sorry, but you failed the game. Good luck next time!!!");
   }
}


class Game {
   public void StartGame(int NumberToGuess, int GuessedNumber) {


       if(GuessedNumber == NumberToGuess) {
           System.out.println("You have guessed correctly good job!!!");
           System.exit(0);
       }else if( GuessedNumber > NumberToGuess) {
           System.out.println("You need to choose a lower number!");
       }else if( GuessedNumber < NumberToGuess) {
           System.out.println("You need to choose a higher number!");
       }
      
   }
}
