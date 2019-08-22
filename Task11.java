package by.htp.les02.main;

//11. Вычислить периметр и площадь прямоугольного треугольника по длинам а и b двух катетов.

public class Task11 {
	public static void main(String[] args) {
		double a = 3.6;
		double b = 0.5;
		double squareTriangle;
		double perimeterTriangle;

		perimeterTriangle = Math.sqrt(a * a + b * b) + a + b;

		squareTriangle = (a * b) / 2;

		System.out.println("The perimeter of the triangle is " + perimeterTriangle + " , the sqaure of the triangle is "
				+ squareTriangle);
	}

}
