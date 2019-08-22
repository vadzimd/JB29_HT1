package by.htp.les02.main;

//28. Составить программу перевода радианной меры угла в градусы, минуты и секунды.

public class Task28 {
	public static void main(String[] args) {

		double alpha = 0.26;

		double Grad = alpha * 180 / Math.PI;

		int G = (int) Grad;
		double M = ((Grad - G) * 60);
		int S = (int) ((M - (int) M) * 60);

		System.out.println("G: " + G + " , M: " + (int) M + " , S: " + S);

	}

}