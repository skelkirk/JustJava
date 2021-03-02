import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class GuessNumber {

    static Scanner scanner = new Scanner(System.in);
    final static int ATTEMPTS = 3;
    static int yourNumber = 0;

    public static void main(String[] args) {

        System.out.println("Let's play the game.\nChoose a number from 1 to 10" +
                "\nYou have "+ ATTEMPTS + " attempts");
        game();
    }

        public static void game () {
            int gamesNumber = (int)(Math.random()*10)+1;

            for (int i = 0; i < ATTEMPTS ; i++) {
                chooseNumber();
                compareNumber(yourNumber, gamesNumber);
            }
            System.out.println("You lost");
            continueOrExit();


        }
        public static void chooseNumber() {
            yourNumber = scanner.nextInt();
        }

        public static void compareNumber(int yourNumber, int gamesNumber) {
            if (yourNumber == gamesNumber) {
                System.out.println("You guessed right!");
                continueOrExit();
            } else if (yourNumber < gamesNumber) {
                System.out.println("Enter bigger number");
            } else {
                System.out.println("Enter smaller number");
            }
        }
        public static void continueOrExit(){
            System.out.println("Do you want another try? \n 1 - yes, 2 - no");
            int answer = scanner.nextInt();
            switch (answer){
                case 1 -> {
                        System.out.println("Choose a number from 1 to 10");
                        game();
                }
                case 2 -> {
                    System.out.println("Thank you for playing!");
                        System.exit(0);
                }
            }

        }


}

