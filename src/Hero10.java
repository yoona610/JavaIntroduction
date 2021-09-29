
public class Hero10 extends Character {
	String name = "ミナト";
	int hp = 100;

	public void attack(Monster m) {
		System.out.println(this.name + "の攻撃！");
		m.hp -= 5;
		System.out.println("5ポイントのダメージをあたえた！");
	}

	public void run() {
		System.out.println(this.name + "は逃げ出した！");
	}
}