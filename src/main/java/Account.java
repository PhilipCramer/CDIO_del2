public class Account {
    // start balance: 0
    // balance:int
    // addValue(int value)
    // getBalance() :int
    // balanceCheck() : boolean

    int balance;

    public Account() {
        balance = 0;
    }

    /**
     * Adds an integer to the balance
     * @param Int added to the current balance
     */
    public void addValue(int Int) {
        balance += Int;
    }

    /**
     * Set the balance to an integer
     * @param _balance sets balance to _balance
     */
    public void setBalance(int _balance) {
        balance = _balance;
    }

    /**
     * Get balance value
     * @return current balance
     */
    public int getBalance() {
        return balance;
    }

    /**
     * Checks if the balance is 3000 or more
     * @return Boolean - True if balance is equal to or grater than 3000.
     */
    public boolean balanceCheck() {
        return balance >= 3000;
    }
}
