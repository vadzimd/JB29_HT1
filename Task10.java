package by.htp.les02.main;

//10. Вычислить значение выражения по формуле (все переменные принимают действительные значения): 𝑠𝑖𝑛𝑥+𝑐𝑜𝑠𝑦𝑐𝑜𝑠𝑥−𝑠𝑖𝑛𝑦*𝑡𝑔 𝑥𝑦

public class Task10 {
	public static void main(String[] args) {
		double x = 3.6;
		double y = 0.5;
		double z;

		z = ((Math.sin(x) + Math.cos(y)) / (Math.cos(x) - Math.sin(y))) * Math.tan(x * y);

		System.out.println("z = " + z);
	}

}
