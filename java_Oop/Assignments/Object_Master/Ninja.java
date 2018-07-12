public class Ninja extends Human {
    private Ninja() {
        this.setStealth(10);

    }
    public void steal(Human h) {
        System.out.println("give me your stuff!");
        h.setStealth(h.getHealth(Human) - this.getHealth());
    }
    public void runAway(Human h) {
        System.out.println("ahhh run!");
        h.setHealth(h.getHealth(Human) - this.getHealth());
    }
}