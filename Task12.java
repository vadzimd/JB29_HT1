package by.htp.les02.main;

//12. Вычислить расстояние между двумя точками с данными координатами (х1, у1)и (x2, у2).

public class Task12 {
	public static void main(String[] args) {
		double x1 = 3.6;
		double x2 = 1.6;
		double y1 = 57.5;
		double y2 = 3.863;

		double distance;

		distance = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));

		System.out.println("The distance is " + distance);
	}

}
