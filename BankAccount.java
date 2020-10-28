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
		if(amount>=0){
			balance += amount;
			return true;
		}
		return false;
	}
	
	public boolean withdraw(double amount){
		if(amount >= 0 && balance >= amount){
			balance -= amount;
			return true;
		}
		return false;
	}
	
	public String toString(){
		return String.valueOf(accountID) + "\t" + String.valueOf(balance);
	}
	
	
}