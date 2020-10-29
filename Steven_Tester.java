public class Steven_Tester {
    public static void main (String[] args) {
        BankAccount testAcct = new BankAccount(95, "somepassword");
        // to test each case just replace * with /
        
         //tests for getBalance() and getAccountID()
        System.out.println(testAcct.getBalance());      // should return 0.0
        System.out.println(testAcct.getAccountID());    // should return 95
        testAcct.setPassword("somenewpassword");        // "somepassword" changed to "somenewpassword"
        

        // tests for deposit()
        System.out.println(testAcct.deposit(-5.23));    // false because can't deposit negative amount
        System.out.println(testAcct.getBalance());      // return 0.0 since no deposit was made because of what said above
        System.out.println(testAcct.deposit(5));        // return true since you can deposit 5
        System.out.println(testAcct.getBalance());      // return 5.0 
        System.out.println(testAcct.deposit(0));        // true since you can deposit 0 (0 is non-negative)
        System.out.println(testAcct.getBalance());      // return 5.0
        

        // tests for withdraw()
        System.out.println(testAcct.withdraw(-5));      // false because can't withdraw negative amount
        System.out.println(testAcct.withdraw(0));       // true since you can deposit 0
        System.out.println(testAcct.withdraw(4));       // false since current balance is 0, can't withdraw more than balance
        System.out.println(testAcct.deposit(45.5));     // true
        System.out.println(testAcct.withdraw(42));      // true
        

        // tests for toString()
        System.out.println(testAcct.deposit(3.5));      // true
        System.out.println(testAcct.getBalance());      // return 3.5
        System.out.println(testAcct.toString());        // return 95    3.5 (the space is a tab)
        
    }
}
