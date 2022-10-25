public class Account {
    // start balance: 1000
    // balance:int
    // addValue(int value)
    // getBalance() :int
    // balanceCheck() : boolean

    int balance;

    public Account() {
        balance = 1000;
    }

    /**
     * Adds an integer to the balance
     * @param Int added to the current balance
     */
    public void addValue(int Int) {
        //Sets balance to the highest value of 0 and balance + Int
        //so that balance is never negative
        balance = Math.max(balance + Int, 0);
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
