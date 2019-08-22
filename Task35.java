package by.htp.les02.main;

//35. Даны натуральные числа М и N. Вывести старшую цифру дробной части и младшую цифру целой части числа M/N.

public class Task35 {
	public static void main(String[] args) {

		int M = 1010;
		int N = 40;

		int digitPart = (int) M / N;

		int decimalPart = (int) (((double) M / N - digitPart) * 100 % 10);

		while (digitPart/10 != 0) {
			digitPart = digitPart / 10;
		}

		System.out.println("digitPart = " + digitPart + " , decimalPart = " + decimalPart);

	}

}