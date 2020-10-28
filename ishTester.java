public class ishTester{
	public static void main(String[] args){
		BankAccount Josh = new BankAccount(1010,"Josh123"); // just creates object
		System.out.println(Josh.getBalance()); //0.0
		System.out.println(Josh.getAccountID()); //1010
		System.out.println(Josh.deposit(1500)); //true
		System.out.println(Josh.deposit(-1000)); //false
		System.out.println(Josh.getBalance()); // 1500
		System.out.println(Josh.withdraw(-500)); // false
		System.out.println(Josh.withdraw(1700)); // false
		System.out.println(Josh.withdraw(1400)); // true
		System.out.println(Josh.getBalance()); // 100.0
		Josh.setPassword("16@1a55aSu4Kn@"); //safe password practices
		System.out.println(Josh.toString()); //1010		100.0

	}


}