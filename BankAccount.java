public class BankAccount{
	double balance;
	int accountID;
	String password;
	
	public BankAccount(int a, String p){
		balance = 0;
		accountID = a;
		password = p;
		
	}
	public double getBalance(){
		return balance;
	}
	
	public int getAccountID(){
		return accountID;
	}
	public void setPassword(String newPass){
		password = newPass;
	}
	
	public boolean deposit(double amount){
		if(balance>=0){
			balance += amount;
			return true;
		}
		return false;
	}
	
	
	
	
}