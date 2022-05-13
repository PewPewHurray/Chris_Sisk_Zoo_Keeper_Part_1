
public class Mammel {
	private int energyLevel = 100;
	
	public int displayEnergy() {
		System.out.println("Energy level: " + energyLevel);
		return energyLevel;
	}
	public void adjustEnergyLevel(int energyAmount) {
		this.energyLevel += energyAmount;
	}
}
