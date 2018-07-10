
public class Mammal {
    public int energyLevel;
    public int extraEnergyLevel;
	public Mammal (){
        this.energyLevel = 100;
        this.extraEnergyLevel = 300;
	}
	public int displayEnergy() {
		System.out.println(this.energyLevel);
		return this.energyLevel;
    }
    public int display ExtraEnergy() {
        System.out.println(this.extraEnergLevel);
        return this.extraEnergLevel;
    }
}
