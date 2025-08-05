package Unit1;/*
Author: Azarya Silaen
 */

import java.util.Scanner;

public class AzaryaPersonalAccount {

    public static double[] FinalDepositMonthly(int intMonth, double initialDeposit, double monthlyDeposit, double monthlyRate) {
        double[] sumInitial = new double[intMonth];
        double startDeposit = initialDeposit;
        double sumDeposit;
        for (int i = 0; i < intMonth; i++) {
            // i=0 500
            sumDeposit = startDeposit*(1+monthlyRate)+monthlyDeposit;
            sumInitial[i] = sumDeposit; // 610 720 840
            startDeposit = sumDeposit;
        }
        return sumInitial;
    }

    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);

        System.out.println("Welcome to the CSA Bank!");

        //input information
        System.out.print("\nEnter first name: ");
        String fName = kb.nextLine();
        System.out.print("Enter last name: ");
        String lName = kb.nextLine();
        System.out.print("Enter gender: ");
        String gender = kb.nextLine();
        System.out.print("Enter five-digit account number: ");
        int account = kb.nextInt();

        if (account > 99999 || account < 11111) {
            System.out.print("ERROR 404: invalid account number");
        }
        else {
            System.out.print("Enter initial deposit: ");
            double deposit = kb.nextDouble();

            //output information
            System.out.println("\nAccount information");
            System.out.println("Full name: " + fName + " " + lName);
            System.out.println("Initial Balance: " + deposit);
            System.out.println("Gender: " + gender);
            System.out.println("Account number: " + account);

            //input system
            System.out.print("Enter monthly deposit: ");
            double monthlyDeposit = kb.nextDouble();
            System.out.print("Enter interest rate per month: ");
            double monthlyInterest = kb.nextDouble();
            System.out.print("Enter number of month: ");
            int numMonth = kb.nextInt();

            //Calculate the deposit
            double[] accumDeposit = FinalDepositMonthly(numMonth, deposit, monthlyDeposit, monthlyInterest);

            //output system
            System.out.print("End of " + numMonth + " month balance: " + accumDeposit[numMonth - 1]);

        }
    }
}
