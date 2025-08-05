package Unit2;/*
Author: Azarya Silaen
 */

import java.util.Scanner;

public class RockPaperScissors {

    static double youPoints = 0; //store the number of your wins
    static double computerPoints = 0; //store the number of computer wins

    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);


        //ROUND 1: Input
        System.out.println("Round 1");
        System.out.println("1-Rock, 2-Paper, 3-Scissor?");
        int you = kb.nextInt();
        String youS = numberToText(you);
        System.out.println("You throw " + youS + "!");

        //Generate Computer throw (2 marks)
        String computer = numberToText(randomizer(1, 3)); //1 mark for random and 1 mark for converting to string
        System.out.println("The computer throws " + computer);

        //determine, print and save winner (4 marks)
        if (determineWinner(youS, computer) == 1) { //1 mark for method and 2 marks for if statement
            youPoints++;
            System.out.println("You win!");
        }
        if (determineWinner(youS, computer) == 2) {
            computerPoints++;   //1 mark changing points
            System.out.println("Computer wins!");
        }
        if (determineWinner(youS, computer) == 0) {
            youPoints+=0.5;
            computerPoints+=0.5;
            System.out.println("It's a DRAW");
        }

        //ROUND 2: Input
        System.out.println(" ");
        System.out.println("Round 2");
        System.out.println("1-Rock, 2-Paper, 3-Scissor?");
        you = kb.nextInt();
        youS = numberToText(you);
        System.out.println("You throw " + youS + "!") ;

        //Generate Computer throw
        computer = numberToText(randomizer(1, 3));
        System.out.println("The computer throws " + computer);

        //determine, print and save winner
        if (determineWinner(youS, computer) == 1) {
            youPoints++;
            System.out.println("You win!");
        }
        if (determineWinner(youS, computer) == 2) {
            computerPoints++;
            System.out.println("Computer wins!");
        }
        if (determineWinner(youS, computer) == 0) {
            youPoints+=0.5;
            computerPoints+=0.5;
            System.out.println("It's a DRAW");
        }

        //verification (3 marks)
        if (youPoints == 2) { //2 points for verification and attempt
            System.out.println(" ");
            System.out.println("Round 3 \n" + "Skipped\n");
            System.out.println("Final winner: You Win!");
            return; //1 point for conditional
        }
        if (computerPoints == 2) {
            System.out.println(" ");
            System.out.println("Round 3 \n" + "Skipped\n");
            System.out.println("Final winner: Computer Wins!");
            return;
        }

        //ROUND 3: Input
        System.out.println(" ");
        System.out.println("Round 3");
        System.out.println("1-Rock, 2-Paper, 3-Scissor?");
        you = kb.nextInt();
        youS = numberToText(you);
        System.out.println("You throw " + youS);

        //Generate Computer throw
        computer = numberToText(randomizer(1, 3));
        System.out.println("The computer throws " + computer);

        //determine, print and save winner
        if (determineWinner(youS, computer) == 1) {
            youPoints++;
            System.out.println("You win!");
        }
        if (determineWinner(youS, computer) == 2) {
            computerPoints++;
            System.out.println("Computer wins!");
        }
        if (determineWinner(youS, computer) == 0) {
            youPoints+=0.5;
            computerPoints+=0.5;
            System.out.println("It's a DRAW");
        }

        //Determine final winner or draw //3 marks
        if (youPoints >= 2) {
            System.out.println("\nFinal winner: You Win!");
        } else if (computerPoints >= 2) {
            System.out.println("\nFinal winner: Computer Wins!");
        } else {
            System.out.println("\nFinal winner: DRAW!");
        }
    }


        /*
         * @return 1 if @param you wins
         * @return 2 if @param computer wins
         * @return 0 if is a draw
         */
        public static int determineWinner (String youS, String computer){

            //determine, print and save winner
            if (youS.equals("Rock")) { //1 mark for using equal
                if (computer.equals("Rock")) {
                    return 0; //1 mark for determining a draw
                }
                if (computer.equals("Paper")) {
                    return 2; //1 mark for determining returning 2
                } else {
                    return 1; //1 mark for determining returning 1
                }
            }
            else if (youS.equals("Paper")) {
                if (computer.equals("Rock")) {
                    return 1;
                }
                if (computer.equals("Paper")) {
                    return 0;
                } else {
                    return 2;
                }
            }
            else if (youS.equals("Scissor")){
                if (computer.equals("Rock")) {
                    return 2;
                }
                if (computer.equals("Paper")) {
                    return 1;
                } else {
                    return 0;
                }
            }
            return 2;
        }

            /* @return Rock, Paper or Scissors depending
             * on the value of * @param number or empty
             * string if number is not 1, 2 or 3
             */
            public static int randomizer ( int min, int max){
                int random = (int) (Math.random() * (max - min + 1) + min);
                return random;
            }

            public static String numberToText ( int number){ //2 out of 3 marks
                if (number == 1) return "Rock"; //1 mark for comparing against 1,2,3 and 1 mark for return rock, paper, and scissor
                else if (number == 2) return "Paper";
                else if (number == 3) return "Scissor";
                else return " ";
            }

    }




