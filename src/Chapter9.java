
public class Chapter9 {
	public static void main(String[] args) {
		Hero9 h1 = new Hero9("池崎");
		h1.hp = 100;
		Hero9 h2 = new Hero9();
		h2.hp = 200;
		Wizard w = new Wizard();
		w.name = "マーク";
		w.hp = 50;
//		w.heal(h1);
//		w.heal(h2);
		System.out.println(h1.hp);
		System.out.println(h2.hp);
		System.out.println(h1.name);
		System.out.println(h2.name);
	}
}
