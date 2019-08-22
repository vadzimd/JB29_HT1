package by.htp.les02.main;

//34. Дана величина А, выражающая объем информации в байтах. Перевести А в более крупные единицы измерения информации.

public class Task34 {
	public static void main(String[] args) {

		int A = 45789;

		System.out.println("Kilobytes: " + (A / Math.pow(2, 10)));
		System.out.println("Megabytes: " + (A / Math.pow(2, 20)));
		System.out.println("Gigabytes: " + (A / Math.pow(2, 30)));

	}

}