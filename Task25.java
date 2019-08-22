package by.htp.les02.main;

//25. Вычислить корни квадратного уравнения ах2+ bх + с = 0 с заданными коэффициентами a, b и с (предполагается, что а≠0 и что дискриминант уравнения неотрицателен).

public class Task25 {
	public static void main(String[] args) {

		int a = 2;
		int b = 6;
		int c = 2;

		double root1, root2;

		double D = b * b - 4 * a * c;

		if (D > 0) {

			root1 = (-b + Math.sqrt(D)) / (2 * a);
			root2 = (-b - Math.sqrt(D)) / (2 * a);
			System.out.println("Root 1 is: " + (int) root1 + ", root 2 is: " + (int) root2);

		} else if (D == 0) {

			root1 = (-b + Math.sqrt(D)) / (2 * a);
			System.out.println("Root is: " + (int) root1);
		}

		else if (D < 0) {
			System.out.println("D is < 0, there is no any root");
		}

	}

}