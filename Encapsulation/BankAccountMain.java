/*
Author: Craig Lawlor
C00184465
Description: An inheritance program. The Cat and Dog classes must use the play method from the Pet interface  
*/
public class BankAccountMain {

	public static void main(String[] args) {
		BankAccount myBankAccount = new BankAccount(4141, 100);
		
		//System.out.println(myBankAccount.bankAccount);
		
		myBankAccount.deposit(-60);
		myBankAccount.withdraw(150);
		
		myBankAccount.deposit(100);
		myBankAccount.withdraw(200);
	}

}
