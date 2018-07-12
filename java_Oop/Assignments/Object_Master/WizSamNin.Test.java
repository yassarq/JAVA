public class WizNinSamTest {

	public static void main(String[] args) {
		
		Human me = new Human();
		Samurai won = new Samurai();
		Samurai michael = new Samurai();
		Samurai kenny = new Samurai();
		won.deathBlow(me);
		won.meditate();
		System.out.println(me.getHealth());
		System.out.println(won.getHealth());
		System.out.println("There are this many samurai: " + Samurai.howMany());
	}

}