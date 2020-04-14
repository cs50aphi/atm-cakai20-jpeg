import java.util.Scanner;
public class ATM {
    public static void main (String[]args) 
    {
        Scanner kb = new Scanner(System.in);
        CheckingAccount checking = new CheckingAccount(15);
        SavingsAccount savings = new SavingsAccount(100);
        
        boolean run = true;
        
        while (run)
        {
            System.out.println("Greetings and how may I serve you?");
            System.out.println();
            System.out.println();
            System.out.println("Do you want to: (D)eposit, (W)ithdraw, (C)heck ballance, (T)ransfer, (Q)uit?");
            System.out.println("Your checking account has " + Checking + " creddits.");
            System.out.println("Your savings account has " + Savings + " creddits.");
            
            action = A;
            
            switch(action)
            {
                case D:
                    System.out.println("How much would you like to deposit today?");
                    int depositAmmount = kb.nextInt();
                    System.out.println("Deposit to: (1) checking or (2) savings?");
                    int location = kb.nextInt();
                break;
                
                case W:
                    System.out.println("How much would you like to withdraw today?");
                    int depositAmmount = kb.nextInt();
                    System.out.println("Deposit to: (1) checking or (2) savings?");
                    int location = kb.nextInt();
                break;
                
                case C:
                    System.out.println("Your checking account has " + Checking + " creddits.");
                    System.out.println("Your savings account has " + Savings + " creddits.");
                break;
                
                case Q;
                    run = false;
                break;
            }
        }
    }
}