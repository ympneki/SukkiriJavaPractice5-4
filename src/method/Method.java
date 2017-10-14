package method;

public class Method {

	public static void main(String[] args) {
		double bottom = 11.0;
		double height = 5.0;

		double radius = 5.0;

		System.out.println(calcTriangleArea(bottom, height));
		System.out.println(calcCircleArea(radius));
	}

	public static double calcTriangleArea(double bottom,double height) {
		return bottom * height / 2;
	}

	public static double calcCircleArea(double radius) {
		return Math.pow(radius, 2) * Math.PI;
	}
}
