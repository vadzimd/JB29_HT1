package by.htp.les02.main;

//23. Найти площадь кольца, внутренний радиус которого равен r, а внешний — R (R> r).

public class Task23 {
	public static void main(String[] args) {

		double r = 5.23;
		double R = 6.18;

		double ringSquare = Math.PI * (R * R - r * r);

		System.out.println("The square of the ring is: " + ringSquare);
	}

}