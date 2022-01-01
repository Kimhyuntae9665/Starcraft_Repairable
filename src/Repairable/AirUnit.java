package Repairable;

public class AirUnit extends TerranUnit{
	public AirUnit(int hp) {
		super(hp);
	}

}

class Dropship extends AirUnit implements Repairable{
	public Dropship() {
		super(125);
		hitPoint = MAX_HP;
	}
	
	public String toString() {
		return "Dropship";
	}
	
}
