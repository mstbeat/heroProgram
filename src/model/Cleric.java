package model;

public class Cleric {
	String name;
	int hp = 50;
	final int MAX_HP = 50;
	int mp = 10;
	final int MAX_MP = 10;

	public void selfAid() {
		System.out.println(this.name + "はセルフエイドを唱えた！");
		this.mp -= 5;
		this.hp = this.MAX_HP;
		System.out.println("HPが最大まで回復した！(HP: " + this.hp + " MP: " + this.mp + ")");
	}
	public int pray(int sec) {
		System.out.println(this.name + "は" + sec + "秒間天に祈った！");
		int recover = new java.util.Random().nextInt(3) + sec;
		int recoverActual = Math.min(recover, this.MAX_MP - this.mp);
		this.mp += recoverActual;
		System.out.println("MPが" + recoverActual + "回復した！(HP: " + this.hp + " MP: " + this.mp + ")");
		return recoverActual;
	}
}
