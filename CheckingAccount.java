
public class CheckingAccount extends BankAccount{  
      // Constructs a checking account with a given balance.

   public CheckingAccount(double initialBalance)
   {  
      // Construct superclass
      super(initialBalance);
   }

   public boolean deposit(double amount) 
   {  
      // Now add amount to balance 
       boolean res = false;
      super.deposit(amount);
      return res;
   }
   
   public boolean withdraw(double amount) 
    {  
      // Now subtract amount from balance 
       boolean res = false;
      super.withdraw(amount);
      return res;
 
   }
 }