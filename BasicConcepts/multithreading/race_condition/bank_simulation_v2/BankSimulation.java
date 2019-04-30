import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class BankSimulation {

    public static void main(String[] args) {

        Account account = new Account(1000);
        System.out.println("Before: " + account.getBalance());

        ExecutorService pool = Executors.newCachedThreadPool();

        pool.execute(new AccountWithdrawer(account, 50));
        pool.execute(new AccountWithdrawer(account, 100));

        pool.shutdown();
        while (!pool.isTerminated()) ;

        System.out.println("After: " + account.getBalance());

    }

}
