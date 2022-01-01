package Repairable;


public class GroundUnit extends TerranUnit{
	public GroundUnit(int hp) {
		super(hp);
	}

}

class Tank extends GroundUnit implements Repairable{
	public Tank() {
		super(100);
		hitPoint = MAX_HP;
	}
	
	public String toString() {
		return "Tank";
	}
}

class SCV extends GroundUnit implements Repairable{
	public SCV() {
		super(50);
		hitPoint = MAX_HP;
	}
	
	TerranUnit tr;
	
	public void repair(Repairable repairableUnit) {
		if(repairableUnit instanceof TerranUnit) {
			tr = (TerranUnit) repairableUnit;
			//TerranUnit	tr= (TerranUnit) repairableUnit; //if 문 안에서 변수 선언하면 local variable로 간주 => if문 종료시 variable tr 지역변수 제거 
		}												 //TerranUnit tr 변수 if 문 밖에서 선언해야 
		
		
		while(tr.hitPoint!=tr.MAX_HP) {//tr cannot be resolved to a variable// tr 변수 선언 문제 
			tr.hitPoint++;
		}
		
		System.out.println(tr.toString()+"의 수리가 완료되었습니다.");
	}
}

class Marine extends GroundUnit{
	public Marine() {
		super(50);
		hitPoint = MAX_HP;
	}
}
