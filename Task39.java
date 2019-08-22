package by.htp.les02.main;

//39*40*. Дано значение х. Получить значения -2х + 3х2 - 4х3 и 1 + 2х + 3х2 + 4х3 . Позаботьтесь об экономии операций.

public class Task39 {
	public static void main(String[] args) {

		int x = 5;
		int result1;
		int result2;

		result1 = x * (-2 + x * (3 - 4 * x));
		result2 = x * (2 + x * (3 + 4 * x)) + 1;

		System.out.println("The result 1 is: " + result1 + " , the result 2 is: " + result2);

	}

}