import java.util.Scanner;
public class ATM {
    public static void main (String[]args) 
    {
        Scanner kb = new Scanner(System.in);
        // CheckingAccount checking = new CheckingAccount(15);
        // SavingsAccoung savings = new SavingsAccount(100);
        
        boolean run = true;
        
        while (run)
        {
            System.out.println("Greetings and how may I serve you?");
            System.out.println()
            System.out.println()
            System.out.println("Do you want to: (D)eposit, (W)ithdraw, (C)heck ballance, (T)ransfer, (Q)uit?");
            System.out.println("Your checking account has " + CheckingAccount() + " creddits.")
            System.out.println("Your savings account has " + SavingsAccount() + " creddits.")
            
        }
    }
}