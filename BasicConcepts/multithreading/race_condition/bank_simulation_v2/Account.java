public class Account {

    private double balance;

    public Account(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void withdraw(double amount) {
        double curBalance = getBalance();
        possibleDelay();
        balance = curBalance - amount;

    }

    public void deposit(double amount) {
        //System.out.println(Thread.currentThread().getId() + " | " + getBalance() + ": " + amount);
        double curBalance = getBalance();
        possibleDelay();
        balance = curBalance + amount;
    }


    private void possibleDelay() {
        try {
            Thread.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


}
