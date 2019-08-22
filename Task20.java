package by.htp.les02.main;

//20. Известна длина окружности. Найти площадь круга, ограниченного этой окружностью.

public class Task20 {
	public static void main(String[] args) {

		double circleLength = 5.78;

		double circleSquare;

		circleSquare = circleLength * circleLength / (4 * Math.PI);

		System.out.println("The square of the circle is " + circleSquare);
	}

}