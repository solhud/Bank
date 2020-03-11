
public class BankApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccount ba1 = new BankAccount(100);
		
		System.out.print("Sebelum Tranksaksi ");
		ba1.display();
		
		ba1.deposit(50.0);
		ba1.witdraw(10);
		
		System.out.print("Setelah Tranksaksi ");
		ba1.display();
		
	}

}
