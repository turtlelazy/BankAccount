public class BankAccount{
	private double balance;
	private int accountID;
	private String password;
	
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
		return "#" + String.valueOf(accountID) + "\t$" + String.valueOf(balance);
	}
	
	private boolean authenticate(String password){
		return password.equals(this.password);
	}
	
	public boolean transferTo(BankAccount other,double amount, String password){
		if(authenticate(password)&&withdraw(amount)){
			other.deposit(amount);
			return true;
		}
		else{
			System.out.println("ERROR: password authenticate was " + String.valueOf(authenticate(password)) +" and amount withdrawn was "+String.valueOf(amount));
			return false;
		}
	}
	
	
}