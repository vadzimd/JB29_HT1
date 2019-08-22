package by.htp.les02.main;

//26. Найти площадь треугольника, две стороны которого равны а и b, а угол между этими сторонами у.

public class Task26 {
	public static void main(String[] args) {

		double a = 15.5;
		double b = 6.5;
		double alpha = 0.58;

		double triangleSquare = a * b * Math.asin(alpha) / 2;
		System.out.println("The square of the triangle is: " + triangleSquare);

	}

}