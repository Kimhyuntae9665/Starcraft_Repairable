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
			//TerranUnit	tr= (TerranUnit) repairableUnit; //if �� �ȿ��� ���� �����ϸ� local variable�� ���� => if�� ����� variable tr �������� ���� 
		}												 //TerranUnit tr ���� if �� �ۿ��� �����ؾ� 
		
		
		while(tr.hitPoint!=tr.MAX_HP) {//tr cannot be resolved to a variable// tr ���� ���� ���� 
			tr.hitPoint++;
		}
		
		System.out.println(tr.toString()+"�� ������ �Ϸ�Ǿ����ϴ�.");
	}
}

class Marine extends GroundUnit{
	public Marine() {
		super(50);
		hitPoint = MAX_HP;
	}
}
