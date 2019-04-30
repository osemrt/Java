import java.util.Random;

public class SoccerFan implements Runnable {

    private static final int STEPS = 10;
    private static final int DELAY = 1000;
    private String teamName;
    private String shoutPhrase;

    public SoccerFan(String teamName, String shoutPhrase) {
        this.teamName = teamName;
        this.shoutPhrase = shoutPhrase;
    }


    @Override
    public void run() {

        try {
            Random random = new Random();
            for (int i = 0; i < 10; i++) {
                System.out.println(teamName + " " + shoutPhrase);
                Thread.sleep(random.nextInt(DELAY));
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
