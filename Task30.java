package by.htp.les02.main;

//30. Три сопротивления R1 R2, и R3 соединены параллельно. Найдите сопротивление соединения.

public class Task30 {
	public static void main(String[] args) {

		double R1 = 2.01;
		double R2 = 3.2;
		double R3 = 4.04;

		double R = 1 / ((1 / R1) + (1 / R2) + (1 / R3));

		System.out.println("R: " + R);

	}

}