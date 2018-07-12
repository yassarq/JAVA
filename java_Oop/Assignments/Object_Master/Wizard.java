public class Wizard extends Human {
    private Wizard() {
        this.setHealth(50);
        this.setIntelligence(8);
    }
    public void heal(Human h) {
        System.out.println("i got the magic stick ");
        h.setHealth(h.getHealth(Human) + this.getIntelligence());
    }
    public void fireball(Human h) {
        System.out.println("you can gettt aaouuuutt!");
        h.setHealth(h.getHealth(Human) - this.getIntelligence() * 3);
    }
}