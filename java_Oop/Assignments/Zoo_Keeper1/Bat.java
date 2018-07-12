public class Bat extends Mammal {
    public Bat(){
        this.energyLevel = 300;
    }
    public void fly() {
        System.out.println("Bat flys and losses 50 energy points");
        this.energyLevel -= 50;

    }
    public void eatsHuman() {
        System.out.println("Bat eats human and gains 25 evergy points");
        this.energyLevel += 25;

    }
    public void attackTown() {
        System.out.println("Bat hears the sound of a town and decreses it's energy by 100");
        this.energyLevel -= 100;
    }
    
}