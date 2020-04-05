public class CheckingAccount
{
    private int balance;
    
    
    public int CheckingAccount()
    {
        return balance = 0;
    }
    
    public int deposit(int x)
    {
        return balance += x;
    }
    
    public int withdraw(int x)
    {
        if (balance - x < 0)
        {
            System.out.println("You don't have enough creddits.");
        }
        else
        {
            return balance - x;
        }
    }
}