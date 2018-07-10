public class Gorilla extends Mammal {
    public Gorilla(){

    }
	public void throwSomething() {
		System.out.println("gorilla has thrown somthing and lost energy level by 5 points");
		this.energyLevel -= 5;

	}
	public void eatBananas() {
		System.out.println("gorilla eat banana and gained 10 energy points");
		this.energyLevel += 10;

	}
	public void climb() {
		System.out.println("gorilla has climbed a tree and decrease its energy by 10");
		this.energyLevel -= 10; 
	}

}
