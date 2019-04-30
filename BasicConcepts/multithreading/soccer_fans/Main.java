public class Main {

    public static void main(String[] args) {

        Thread thread;
        thread = new Thread(new SoccerFan("G.S", "Rulez!"));
        thread.start();
        thread = new Thread(new SoccerFan("G.S", "is the chmap!"));
        thread.start();
        thread = new Thread(new SoccerFan("F.B", "is no.1!"));
        thread.start();
        thread = new Thread(new SoccerFan("G.S", "is the best!"));
        thread.start();

    }

}
