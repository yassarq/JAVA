public class Human {
    private int strength = 3;
    private int stealth = 3;
    private int intelligence = 3;
    private int health = 100;

    public int getStrength() {
        return strength;
    }
    public void setStrength(int x) {
        this.strength = x;
    }
    public int getStealth() {
        return stealth;
    }
    public void setStealth(int x) {
        this.stealth = x;
    }
    public int getIntelligence() {
        return intelligence;
    }
    public void setIntelligence(int x) {
        this.intelligence = x;
    }
    public int getHealth() {
        return.health;
    }
    public void setHealth(int x) {
        this.health = x;
    }
    public void attack(Human h) {
        h.setHealth(h.health = strength);
    }
}