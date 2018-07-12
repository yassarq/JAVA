public class Samurai extends Human {
    private static int totalSamurai = 0;

    private Samurai() {
        this.setHealth(200);
    }
    public void deathBlows(Human h) {
        System.out.println("i kill you!");
        h.setHealth(h.getHealth(Human) - this.getHealth()/2);
    }
    public void mediatate(Human h) {
        System.out.println("i was healed!");
    }
    public void howMany(Human h) {
        System.out.println("How many samurai are there?");
    }
}