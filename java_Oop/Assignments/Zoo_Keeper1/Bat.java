public class Bat extends Mammal {
    public Bat(){

    }
    public void fly() {
        System.out.println("Bat flys and losses 50 energy points");
        this.extraEnergyLevel -= 50;
    }
    public void eatHumans() {
        System.out.println("Bat eats human and gains 25 evergy points")
        this.extraEnergyLevel += 25;
    }
    public void attackTown() {
        System.out.println("Bat hears the sound of a town and decreses it's energy by 100")
        this.extraEnergyLevel -= 100;
    }
    
}