import.java.util.*;

public class BankAccount implements Account
{
         
public static void main(String args[])
   {
      String type=null;
      int balance=0, tmp=0;
      int withd=0, cb=0;
      Scanner in=new Scanner(System.in);
      Scanner strng=new Scanner(System.in);
      int userChoice;
      int accChoice;
      boolean quit=false;
      
      do
      {
         System.out.println("1. Create Account");
         System.out.println("2. Deposit money");
         System.out.println("3. Withdraw money");
         System.out.println("4. Check balance");
         System.out.println("5. Display Account Details");
         System.out.println("0. to quit: \n");
         System.out.print("Input Your Choice : ");
         userChoice = in.nextInt();
         
         switch (userChoice)
         {
            case 1:
               System.out.println("What type of Account: ");
               
               do
               {
                  System.out.println("1. Checking ");
                  System.out.println("2. Savings ");
                  accChoice = in.nextInt();
                  
                  /*(
                  if (accChoice)
                  {
                     accChoice=1
                     create_account()                  
                  }//end if(accChoice)
                  else
                  */
               }//end do
               break;);
            
            case 2: //deposit  
               System.out.println("Enter Deposit Amount: ");
               balance=in.nextInt();
               user.Acc_Balance=balance;
               System.out.println("\t Deposit Complete.");
               System.out.println("Your updated balance is: " + Acc_Balance );
               break;
               
            case 3:// withdraw
               if (user.Acc_Balance==0)
               {
                  System.out.println("Your Account Balance is 0. Withdraw disabled");
               }
               else 
               {
                  System.out.println("Enter an amount: ");
                  withd=in.nextInt();
                  
                  if (withd>user.Acc_Balance)
                  {
                     System.out.println("Insufficient Funds.");
                  }
                  else
                  cb=user.withdraw(withd);
                  System.out.println("Your current balance: " + cb);
               }
               break;
               
            case 4:
               System.out.println("\n Your Current Balance: " + user.Acc_Balance);
               break;
               
            case 5:
               System.out.println(acc_type + ":    -- " + Acc_Balance":    -- ");
               break;
               
            case 0:
               quit = true;
               break;
               
            default:
               System.out.println("Wrong Choice!");
               break;   
         }//end switch (userChoice)
         System.out.println("\n");
         
      }//end do
      while (!quit);
      System.out.println("ThankYou for using this!");
      
      
   }//end Main
}//end BankAccound