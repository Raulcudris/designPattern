package singleton;

public class TestSingleton {
    public static void main(String[] args) {
        Thread threadRaulongo = new Thread( new RunRaulongo());
        Thread threadJoshongo = new Thread( new RunJoshongo());

        threadRaulongo.start();
        threadJoshongo.start();
    }

    static class RunRaulongo implements Runnable{
        @Override
        public void run() {
            Player player = Player.getPlayer("Raulongo");
            System.out.println("Running Raulongo "+player);
        }
    }

    static class RunJoshongo implements Runnable{
        @Override
        public void run() {
            Player player = Player.getPlayer("Joshongo");
            System.out.println("Running Joshongo "+player);
        }
    }

}
