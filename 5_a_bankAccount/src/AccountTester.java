
public class AccountTester {
	public static void main(String[] args) {
		BankAccount myAccount = new BankAccount(100);
		BankAccount yourAccount = new BankAccount(200);
		
		myAccount.transfer(yourAccount, 25);
		System.out.println(myAccount.getBalance());
		System.out.println(yourAccount.getBalance());
		
	}

}
