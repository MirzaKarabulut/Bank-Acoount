// bank.java
// demonstrates basic OOP syntax
// to run this program: C>java BankApp
////////////////////////////////////////////////////////////////
class BankAccount {
   private double balance; // account balance
   private int accountNumber;
   private String name;
   private long IDNumber;
   private String phoneNumber;
   private String adress;

   public BankAccount(double openingBalance, int accNumber, String newName, long id) // constructor
   {
      balance = openingBalance;
      accountNumber = accNumber;
      name = newName;
      IDNumber = id;
      phoneNumber = "0";
      adress = "";
   }

   public int getAccountNumber()
   {
      System.out.println(accountNumber);
      return accountNumber;
   }

   public String getName()
   {
      System.out.println(name);
      return name;
   }

   public long getIdNumber()
   {
      System.out.println(IDNumber);
      return IDNumber;
   }

   public String getPhoneNumber()
   {
      System.out.println(phoneNumber);
      return phoneNumber;
   }

   public String getAdress()
   {
      System.out.println(adress);
      return adress;
   }

   public double getBalance()
   {
      System.out.println(balance);
      return balance;
   }

   public void setName(String newName)
   {
      name = newName;
      System.out.println("Property 'name' of account number " + accountNumber + " changed to " + newName);
   }

   public void setPhoneNumber(String newPhoneNumber)
   {
      phoneNumber = newPhoneNumber;
      System.out.println("Property 'phone number' of account number " + accountNumber + " changed to " + newPhoneNumber);
   }

   public void setAdress(String newAdress)
   {
      adress = newAdress;
      System.out.println("Property 'adress' of account number " + accountNumber + " changed to " + newAdress);
   }

   public void deposit(double amount) // makes deposit
   {
      if (amount <= 0)
      {
         System.out.println("Amount should be positive!!");
         return;
      }
      else
      {
         balance = balance + amount;
         System.out.println("Deposit of " + amount + " TL to account number " + accountNumber + " is successful.");
         System.out.println("New balance: " + balance + " TL");
      }
   }

   public void withdraw(double amount) // makes withdrawal
   {
      if (amount <= 0)
      {
         System.out.println("Error:Amount should be positive!!");
         return;
      }
      else if (amount > balance)
      {
         System.out.println("Error:Current balance is not sufficient.");
         return;
      }
      else
      {
         balance = balance - amount;
         System.out.println("Withdrawn of " + amount + " TL to account number " + accountNumber + " is successful.");
         System.out.println("New balance: " + balance + " TL");
      }
   }

   public String toString() // writing function
   {
      System.out.println("name = " + name);
      System.out.println("account number = " + accountNumber);
      System.out.println("balance = " + balance);
      return "";
   }

   public void transfer(BankAccount bankAccount, double amount)
   {
      if (amount <= 0)
      {
         System.out.println("Error:Amount should be positive!!");
         return;
      }
      else if (amount > balance)
      {
         System.out.println("Error:Current balance is not sufficient.");
         return;
      }
      else
      {
         withdraw(amount);
         bankAccount.deposit(amount);
         System.out.println("Transfer is successful.");  
      }
   }
}
// end class BankAccount
////////////////////////////////////////////////////////////////
class BankApp {
   public static void main(String[] args) {
      BankAccount firstAcc = new BankAccount(1000, 123123, "Hüseyin", 123123123); // create acct
      BankAccount secondAcc = new BankAccount(2000, 789789, "Mirza", 987654321); // create acct

      firstAcc.toString();
      firstAcc.getPhoneNumber();
      firstAcc.getIdNumber();
      firstAcc.getAdress();
      firstAcc.setAdress("Adana/Türkiye, Çukurova");
      firstAcc.setPhoneNumber("05556667788");
      firstAcc.setName("Ahsen");
      firstAcc.deposit(-100);
      firstAcc.deposit(200);
      firstAcc.withdraw(-500); 
      firstAcc.withdraw(2000);
      firstAcc.withdraw(500);
      firstAcc.transfer(secondAcc, -300);
      firstAcc.transfer(secondAcc, 900);
      firstAcc.transfer(secondAcc, 400);
   } // end main()
}
// end class BankApp