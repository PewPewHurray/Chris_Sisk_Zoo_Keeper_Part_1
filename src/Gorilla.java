
public class Gorilla extends Mammel{
	public void throwSomething() {
		System.out.println("The gorilla has thrown something.");
		this.adjustEnergyLevel(-5);
	}
	
	public void eatBananas() {
		System.out.println("The gorilla happly eats a banana.");
		this.adjustEnergyLevel(10);
	}
	
	public void climb() {
		System.out.println("The gorilla has climbed a tree");
		this.adjustEnergyLevel(-10);
	}
}
