package by.htp.les02.main;

//39*. Дано действительное число х. Не пользуясь никакими другими арифметическими операциями, кроме умножения, сложения и вычитания, вычислите за минимальное число операций:
//2x4 - 3х3 + 4х2 - 5х + 6.

public class Task40 {
	public static void main(String[] args) {

		int x = 4;
		int result;
		int x2 = x * x;

		result = x2 * (2 * x2 - 3 * x) + x * (4 * x - 5) + 6;

		System.out.println("The result is: " + result);

	}

}