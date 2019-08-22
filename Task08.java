package by.htp.les02.main;

//9. Вычислить значение выражения по формуле (все переменные принимают действительные значения): 𝑎𝑐∗𝑏𝑑−𝑎𝑏−𝑐𝑐𝑑

public class Task08 {
	public static void main(String[] args) {
		double a = 3.6;
		double b = 0.5;
		double c = 23.8;
		double d = 65.334567;
		double z;

		z = (a / c) * (b / d) - ((a * b - c) / (c * d));

		System.out.println("z = " + z);
	}

}
