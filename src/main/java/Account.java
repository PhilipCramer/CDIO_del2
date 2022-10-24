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

    public void addValue(int Int) {
        balance += Int;
    }

    public void setBalance(int _balance) {
        balance = _balance;
    }

    public int getBalance() {
        return balance;
    }

    public boolean balanceCheck() {
        return true;
    }
}
