package by.htp.les02.main;

//24. Найти площадь равнобедренной трапеции с основаниями а и b и углом α при большем основании а.

public class Task24 {
	public static void main(String[] args) {

		double a = 15.23;
		double b = 6.18;
		double alpha = 0.52;

		double trapezeSquare = (a * a - b * b) * Math.tan(alpha) / 2;

		System.out.println("The square of the trapeze is: " + trapezeSquare);
	}

}