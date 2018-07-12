public class BatTest {
    public static void main(String[] args) {
        Bat b = new Bat();

        b.attackTown();
        b.attackTown();
        b.attackTown();

        b.eatsHuman();
        b.eatsHuman();

        b.fly();
        b.fly();
        b.displayEnergy();
    }
}