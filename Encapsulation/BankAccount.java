
public class BankAccount {
	private int accountNumber;
	private int accountBalance;
	
	public BankAccount(int account_number, int account_balance) {
		this.accountNumber = account_number;
		this.accountBalance = account_balance;
		System.out.println("You created account " + this.accountNumber + ".");
	}
	
	public void deposit(int addMoney) {
		if(addMoney < 0) {
			System.out.println("You cannot deposit a negative amount");
		}
		else {
			this.accountBalance += addMoney;
			System.out.println("$" + addMoney + " deposited into account " + this.accountNumber + ".");
		}
	}
	
	public void withdraw(int removeMoney) {
		if(removeMoney > this.accountBalance) {
			System.out.println("You cannot remove more than what is in your account");
		}
		else {
			this.accountBalance -= removeMoney;
			System.out.println("$" + removeMoney + " has been withdrawn from account " + this.accountNumber);
		}
	}
}

