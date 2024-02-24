# Bank-Acoount
I created a bank account application using JAVA (OOP).

DATA STRUCTURES

(1) Modify the BankAccount class given in the textbook as follows:
(a) Add account number of the account, and name, Republic of Turkey ID number, phone number
and address of the client as fields to the class.
(b) Modify the constructor of the class by adding the account number of the account, and name
and Republic of Turkey ID number of the client as parameters. The constructor should set the phone
number to 0 and address to the empty string.
(c) Add methods getBalance(), getAccountNumber(), getName(), getIDnumber(), getPhoneNumber() and getAddress() that return these values.
(d) Add methods setName(), setPhoneNumber() and setAddress() that change these values and
print a message indicating which property (name, phoneNumber or address) of which account number
is changed to which value.
(e) Modify the method deposit() so that if the parameter amount is negative or 0, it prints an
error message indicating that the amount deposited should be positive and hence the deposit operation
is not performed. Otherwise, deposit operation should be performed and a message should be printed
indicating what amount is deposited to which account number together with the new balance.
(f) Modify the method withdraw() so that if the parameter amount is negative or 0, it prints an
error message like the deposit() method. Also, if the amount to be withdrawn is larger than the current
balance, the method should not perform the withdraw operation but print an error message indicating
that the current balance is not sufficient. Otherwise, withdraw operation should be performed and a
message should be printed indicating what amount is withdrawn from which account number together
with the new balance.
(g) Modify the display() method so that it is called toString() instead, and it returns the name
and account number as well as the current balance.
(h) Add a method called transfer() that gets two parameters, one BankAccount object and
one amount, and transfers the amount from the BankAccount object the method is called for to the
BankAccount object in the parameters. As in the withdraw() method, the transfer operation should not
be performed and error messages should be printed if the amount is not positive or is greater than the
current balance. Otherwise, transfer operation should be performed and a message should be printed
indicating what amount is transfered from which account number to which account number together
with the new balances of these accounts. In the body of this method, make use of the withdraw() and
deposit() methods.
(2) Write a class called Main so that it performs the following operations in its main method in
the given order:
(a) Create two bankAccount objects, first with openining balance 1000 TLs, and the second with
opening balance 2000 TLs. You should determine the account numbers of these accounts, and names
and Republic of Turkey ID numbers of the owners of these accounts yourself.
(b) Print the first account (name, account number and balance should be automatically printed
by the toString() method).
(c) Print the Republic of Turkey ID number, phone number (which should be 0), and address
(which should be an empty string) of the first account by calling the corresponding getX() methods.
(d) Add the address and phone number information to the first account by calling the setPhoneNumber() and setAddress() methods.
(e) Change the name of the first account by calling its setName() method.
(f) Call the deposit() method for depositing -100 TLs to the first account (which should print an
error message).
(g) Deposit 200 TLs to the first account.
(h) Call the withdraw() method for withdrawing -500 TLs from the first account (which should
print an error message).
(i) Call the withdraw() method for withdrawing 2000 TLs from the first account (which should
also print an error message).
(j) Withdraw 500 TLs from the first account.
(k) Call the transfer() method for transfering -300 TLs from the first account to the second
account (which should print an error message).
(l) Call the transfer() method for transfering 900 TLs from the first account to the second account
(which should also print an error message).
(m) Transfer 400 TLs from the first account to the second account
