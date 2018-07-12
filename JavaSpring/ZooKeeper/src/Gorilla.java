
public class Gorilla extends Mammal {
	public int throwSomething() {
		System.out.println("gorilla has thrown somthing and lost energy level by 5 points");
		this.energyLevel -= 5;
		return this.energyLevel;
	}
	public int eatBananas() {
		System.out.println("gorilla eat banana and gained 10 energy points");
		this.energyLevel += 10;
		return this.eatBananas();
	}
	public int climb() {
		System.out.println("gorilla has climbed a tree and decrease its energy by 10");
		this.energyLevel -= 10; 
		return this.climb();
	}


}
