public class MatchV2 {

    public static void main(String[] args) {

        Thread aThread = new Thread(new SoccerFan("G.S.", "Rulez!"));
        aThread.start();

        Thread bThread = new Thread(new SoccerFan("G.S.", "is the champ!"));
        bThread.start();

        Thread cThread = new Thread(new SoccerFan("F.B.", "is no.1!"));
        cThread.start();

        Thread dThread = new Thread(new SoccerFan("F.B.", "is the best!"));
        dThread.start();

        Thread eThread = new Thread(new Refree("calm down!"));
        eThread.start();


    }

}
