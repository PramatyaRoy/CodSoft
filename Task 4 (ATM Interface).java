import java.util.InputMismatchException;
import java.util.Scanner;
class user_bank_acc
{
    static double bal = 1000.00;
    void deposit(double amt)
    {
        bal += amt;
        System.out.println("\nProcessing please wait...\nAmount successfully deposited.");
    }
    void withdraw(double amt)
    {
        if (bal > amt) 
        {
            bal -= amt;
            System.out.println("\nProcessing please wait...\nPlease collect your cash.");
        } else
            System.out.println("\nInsufficient Balance!");
    }
    double balance()
    {
        return bal;
    }
}

public class atm
{
    static String cn = "1549484430209318", pn = "2410";
    static user_bank_acc obj = new user_bank_acc();
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        System.out.println("\nAutomated Teller Machine\n------------------------\nWelcome to ABX-ATM Service\n");
        while (flag)
        {
            System.out.print("Please enter your Card Number: ");
            String card = sc.nextLine();
            System.out.print("Please enter your 4-digit PIN: ");
            String pin = sc.nextLine();
            if (card.equals(cn) && pin.equals(pn))
            {
                flag = false;
                do
                {
                    try
                    {
                        System.out.println("\n1 - Deposit Money\n2 - Withdraw Money\n3 - Balance Inquiry\n0 - Exit\n");
                        System.out.print("Please choose an option to proceed : ");
                        int opt = sc.nextInt();
                        switch (opt)
                        {
                            case 0:
                                System.out.println("\nThank you for using ABX-ATM service.\nHave a good day!\n");
                                System.exit(0);
                            case 1:
                                System.out.print("\nEnter the amount to be deposited : Rs. ");
                                double depo = sc.nextDouble();
                                obj.deposit(depo);
                                break;
                            case 2:
                                System.out.print("\nHow much money would you like to withdraw? : Rs. ");
                                double with = sc.nextDouble();
                                obj.withdraw(with);
                                break;
                            case 3:
                                System.out.println("\nYour current balance is : Rs. " + obj.balance());
                                break;
                            default:
                                System.out.println("\nInvalid Choice! Please choose from 0-3");
                        }
                    }
                    catch (InputMismatchException e)
                    {
                        System.out.println("\nInvalid Choice! Please choose from 0-3");
                        sc.nextLine();
                    }
                }
                while (true);
            }
            else
                System.out.println("\nInvalid credentials! Try again.\n");
        }
        sc.close();
    }
}