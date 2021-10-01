
public class Chapter13 {
	public static void main(String[] args) {
		Hero13 h = new Hero13();
		h.setName("ジェヒョン");
		Wizard13 w = new Wizard13();
		w.heal(h);
		King k = new King();
		k.talk(h);
	}
}
