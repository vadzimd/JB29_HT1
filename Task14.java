package by.htp.les02.main;

//14. Вычислить длину окружности и площадь круга одного и того же заданного радиуса R.

public class Task14 {
	public static void main(String[] args) {
		double r = 10.0;
		double perimeterCircle;
		double squareCircle;

		perimeterCircle = 2 * Math.PI * r;

		squareCircle = Math.PI * r * r;

		System.out.println("The perimeter of the circle is: " + perimeterCircle + " , the square of the circle is: "
				+ squareCircle);
	}

}
