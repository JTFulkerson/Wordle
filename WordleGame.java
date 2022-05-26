import java.util.*;
import java.io.*;

public class WordleGame {
   public static void main(String[] args) throws FileNotFoundException {
      Scanner input = new Scanner(System.in);
      Wordle game = new Wordle();
      String userInput = "";
      int trys = 1;
      int gamesPlayed = 0;
      int gamesWon = 0;

      Scanner allWordsScanner = new Scanner(new File("FiveLetterWords.txt"));
      ArrayList<String> allWords = new ArrayList<>();
      while(allWordsScanner.hasNext()) {
         allWords.add(allWordsScanner.next());
      }

      game.printIntro(); // Prints Intro
      userInput = input.next().toUpperCase();// Stores user input
      while (!userInput.equalsIgnoreCase("DONE") || game.getNumberOfWordsLeft() >= 0) {
         if(trys > 1) {
            userInput = input.next().toUpperCase();// Stores user input
         }
         if (userInput.length() != 5 && !userInput.equals("DONE")) {
            System.out.println("THE WORD NEEDS TO BE 5 LETTERS, TRY AGAIN");
         } else {
            boolean flag1 = false;
            int allWordsTick = 0;
            while (allWordsTick < allWords.size() && flag1 == false) { // Checks to see if word exists
               if (allWords.get(allWordsTick).equalsIgnoreCase(userInput)) {
                  flag1 = true;
               }
               allWordsTick++;
            }
            if (flag1 == false) {
               System.out.println("NOT A REAL WORD, PLEASE TRY AGAIN");
            } else if (userInput.equals(game.getWord())) {// Checks to see if user guessed correct word
               System.out.println("YOU GUESED THE WORD FROM " + game.printDate());
               gamesPlayed++;
               gamesWon++;
               if (game.getNumberOfWordsLeft() > 1) {// Checks to see if we are out of words
                  System.out.println("TRY THIS NEW WORD");
                  game.removeCurrentWord();// Removes word from possible options
                  game.newWord();// Chooses a new word
                  trys = 0;
               } else {
                  userInput = "DONE";// Ends game
               }
            } else if (trys == 6) {
               System.out.print("THE WORD WAS " + game.getWord() + " FROM " + game.printDate());
               gamesPlayed++;
               if (game.getNumberOfWordsLeft() > 1) {// Checks to see if we are out of words
                  System.out.println(" , TRY THIS NEW WORD");
                  game.removeCurrentWord();// Removes word from possible options
                  game.newWord();// Chooses a new word
                  trys = 0;
               } else {
                  userInput = "DONE";// Ends game
               }
            } else if (!userInput.equals("DONE") && flag1 == true) {
               for (int i = 0; i < 5; i++) {
                  boolean flag = false;
                  if (game.getWord().substring(i, i + 1).equals(userInput.substring(i, i + 1))) {
                     System.out.print(game.getWord().substring(i, i + 1));
                     flag = true;
                     game.setLetters(game.getLetters().substring(0, i) + " " + game.getLetters().substring(i + 1));
                  } else {
                     for (int j = 0; j < game.getLetters().length(); j++) {
                        if (userInput.substring(i, i + 1).equals(game.getLetters().substring(j, j + 1))) {
                           System.out.print("*");
                           flag = true;
                           j = 5;
                        }
                     }
                  }
                  if (flag == false && flag1 == true) {
                     System.out.print("_");
                  }
               }
               System.out.println();
            }
         }
         trys++;
      }
      input.close();
      System.out.println("STATISTICS");
      System.out.println("PLAYED - " + gamesPlayed);
      System.out.println("Win % - " + ((double) gamesWon / (gamesPlayed * 1)) * 100);
   }
}