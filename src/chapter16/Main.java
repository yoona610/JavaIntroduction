package chapter16;

import java.util.HashMap;
import java.util.Map;

public class Main {
	public static void main(String[] args) {
		/*ArrayList<Integer> points = new ArrayList<Integer>();
		points.add(10);
		points.add(80);
		points.add(75);
		for (int i : points) {
			System.out.println(i);
		}*/

		/*ArrayList<String> names = new ArrayList<String>();
		for (String s : names) {
			System.out.println(s);
		}*/

		/*ArrayList<String> names = new ArrayList<String>();
		names.add("ジェヒョン");
		names.add("テヨン");
		names.add("ドヨン");
		Iterator<String> it = names.iterator();
		while (it.hasNext()) {
			String e = it.next();
			System.out.println(e);
		}*/

		/*Set<String> colors = new HashSet<String>();
		colors.add("赤");
		colors.add("黄");
		colors.add("青");
		System.out.println("色は" + colors.size() + "種類");
		for (String s : colors) {
			System.out.print(s + "→");
		}*/

		/*Set<String> words = new TreeSet<String>();
		words.add("dog");
		words.add("cat");
		words.add("wolf");
		words.add("panda");
		for (String s : words) {
			System.out.print(s + "→");
		}*/

		/*Map<String, Integer> prefs = new HashMap<String, Integer>();
		prefs.put("京都府", 255);
		prefs.put("東京都", 1261);
		prefs.put("熊本県", 181);
		int tokyo = prefs.get("東京都");
		System.out.println("東京都の人口は" + tokyo);
		prefs.remove("京都府");
		prefs.put("熊本県", 182);
		int kumamoto = prefs.get("熊本県");
		System.out.println("熊本県の人口は" + kumamoto);

		for (String key : prefs.keySet()) {
			int value = prefs.get(key);
			System.out.println(key + "の人口は" + value);
		}*/

		/*Hero h = new Hero();
		h.name = "ジェヒョン";
		List<Hero> list = new ArrayList<Hero>();
		list.add(h);
		h.name = "テヨン";
		System.out.println(list.get(0).name);*/

		Hero h1 = new Hero("ジェヒョン");
		Hero h2 = new Hero("ドヨン");
		/*List<Hero> heroes = new ArrayList<Hero>();
		heroes.add(h1);
		heroes.add(h2);
		for(Hero h: heroes) {
			System.out.println(h.getName());
		}*/
		Map<Hero, Integer> heroes = new HashMap<Hero, Integer>();
		heroes.put(h1, 3);
		heroes.put(h2, 7);
		for (Hero key : heroes.keySet()) {
			int value = heroes.get(key);
			System.out.println(key.getName() + "が倒した敵＝" + value);
		}
	}
}
