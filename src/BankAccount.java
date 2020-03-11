
public class BankAccount {
	private double balance; // variable account balance
	
//	constructor
	public BankAccount(double openingBalance) {
		balance = openingBalance;
	}
	
//	method deposit
	public void deposit(double amount) {
		balance = balance+amount; 
	}
//	method withdraw
	public void witdraw(double amount) {
		balance = balance-amount;
	}
//	display balance
	public void display() {
		System.out.print("balance = "+balance);
	}

//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//
//	}

}
