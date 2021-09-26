
public class Item10 {
	String name;
	int price;

	public Item10(String name) {
		this.name = name;
		this.price = 0;
		System.out.println(name+"はアイテムを持っています！");
	}

	public Item10(String name, int price) {
		this.name = name;
		this.price = price;
	}
}