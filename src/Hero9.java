
public class Hero9 {
	String name;
	int hp;
	Sword sword;

	public void attack() {
		System.out.println(this.name + "は攻撃した！");
		System.out.println("敵に5ポイントのダメージをあたえた！");
		System.out.println(this.name + "は、" + sword.name + "で攻撃した");
	}

	public Hero9(String name) {
		this.hp = 100;
		this.name = name;
	}

	public Hero9() {
		this("ダミー");
	}
}
