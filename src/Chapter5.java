
public class Chapter5 {

	public static double calcTriangleArea(double bottom, double height) {
		return bottom * height / 2;
	}

	public static double calcCircleArea(double radious) {
		return radious * radious * 3.14;
	}

	public static void main(String[] args) {
		double triangleArea = calcTriangleArea(10.0, 5.0);
		double circleArea = calcCircleArea(5.0);
		System.out.println("三角形の面積は" + triangleArea + "平方cm");
		System.out.println("円の面積は" + circleArea + "平方cm");
	}
}