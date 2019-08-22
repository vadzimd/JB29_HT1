package by.htp.les02.main;

//Для данных областей составить линейную программу, которая печатает true, если точка с координатами (х, у) принадлежит закрашенной области, и false — в противном случае:

public class Task38 {
	public static void main(String[] args) {

//		a)	

		System.out.println("a)");

		double x = -1, y = 2.5;

		if ((x <= 0 && x >= -4 && y <= x + 4) || (x >= 0 && x <= 4 && y <= 4 - x)) {

			System.out.println("true");

		} else {
			System.out.println("false");
		}

//		b)	

		System.out.println("b)");

		double x1 = -1, y1 = 2.5;

		if ((x1 >= -2 && x1 <= 2 && y1 >= 0 && y1 <= 4) || (x1 >= -4 && x1 <= 4 && y1 >= -3 && y1 <= 0)) {

			System.out.println("true");

		} else {
			System.out.println("false");
		}

//		b)	

		System.out.println("c)");

		double x2 = 3, y2 = -4;

		if (x2 >= 0 && x2 <= 4 && y2 >= 0 && y2 <= Math.sqrt(16 - x2 * x2)
				|| x2 >= 0 && x2 <= 5 && y2 <= 0 && Math.abs(y2) <= Math.sqrt(25 - x2 * x2)) {

			System.out.println("true");

		} else {
			System.out.println("false");
		}

	}

}