package by.htp.les02.main;

//29. Найти (в радианах в градусах) все углы треугольника со сторонами а, b, с.

public class Task29 {
	public static void main(String[] args) {

		double a = 2.01;
		double b = 3.2;
		double c = 4.04;

		double alpha = Math.acos((b * b + c * c - a * a) / (2 * b * c));
		double beta = Math.acos((a * a + c * c - b * b) / (2 * a * c));
		double gamma = Math.PI - alpha - beta;
		
		System.out.println("alpha: " + alpha + " ( " + alpha * 180 / Math.PI + " grad)" + " , beta: " + beta + " ( "
				+ beta * 180 / Math.PI + " grad)" + " , gamma: " + gamma + " ( " + gamma * 180 / Math.PI + " grad)");

	}

}