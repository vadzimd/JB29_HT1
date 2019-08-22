package by.htp.les02.main;

//27. Дано значение a. Не используя никаких функций и никаких операций, кроме умножения, получить значение а8 за три операции и а10 за четыре операции.

public class Task27 {
	public static void main(String[] args) {

		double a = 2.5;

		double aPower2 = a * a;
		double aPower4 = aPower2 * aPower2;
		double aPower8 = aPower4 * aPower4;
		double aPower10 = aPower8 * aPower2;
		System.out.println("a in power 8 is: " + aPower8 + " , a in power 10 is: " + aPower10);

	}

}