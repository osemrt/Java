import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class BankSimulation {

    public static void main(String[] args) {

        Account account = new Account(0);
        System.out.println("Before: " + account.getBalance());

        ExecutorService pool = Executors.newCachedThreadPool();

        for (int i = 0; i < 100; i++) {
            pool.execute(new AccountDepositer(account, 1));
        }

        for (int i = 0; i < 50; i++) {
            pool.execute(new AccountWithdrawer(account, 1));
        }

        pool.shutdown();
        while (!pool.isTerminated()) ;

        System.out.println("After: " + account.getBalance());


    }

}
