package by.htp.les02.main;

//8. Вычислить значение выражения по формуле (все переменные принимают действительные значения): 𝑏+√𝑏2+4𝑎𝑐2𝑎−𝑎3𝑐+𝑏−2

public class Task09 {
	public static void main(String[] args) {
		double a = 3.6;
		double b = 0.5;
		double c = 23.8;
		double z;

		z = (b + Math.sqrt((b * b + 4 * a * c))) / (2 * a) - (Math.pow(a, 3) * c) + Math.pow(b, -2);

		System.out.println("z = " + z);
	}

}
