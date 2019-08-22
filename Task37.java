package by.htp.les02.main;

//37. Составить линейную программу, печатающую значение true, если указанное высказывание является истинным, и false — в противном случае:

public class Task37 {
	public static void main(String[] args) {

//		Целое число N является четным двузначным числом.	

		System.out.println("1.");

		int N = 96;

		if (N % 2 == 0 && N / 10 > 0 && N / 100 == 0) {

			System.out.println("true");

		} else {
			System.out.println("false");
		}

//		Сумма двух первых цифр заданного четырехзначного числа равна сумме двух его последних цифр.

		System.out.println("2.");

		int M = 9669;

		if (M / 1000 + (M / 100) % 10 == (M / 10) % 10 + M % 10) {

			System.out.println("true");

		} else {
			System.out.println("false");
		}

//		Сумма цифр данного трехзначного числа N является четным числом.

		System.out.println("3.");

		int P = 972;

		if ((P / 100 + (P / 10) % 10 + P % 10) % 2 == 0) {

			System.out.println("true");

		} else {
			System.out.println("false");
		}

//		Точка с координатами (х, у) принадлежит части плоскости, лежащей между прямыми х= m, х= n (m<n).

		System.out.println("4.");

		int x = 2;
		
		int m = -1, n = 5;

		if (x >= m && x <= n) {

			System.out.println("true");

		} else {
			System.out.println("false");
		}

//		Квадрат заданного трехзначного числа равен кубу суммы цифр этого числа.

		System.out.println("5.");

		int K = 157;

		if (K * K == Math.pow((K / 100 + (K / 10) % 10 + K % 10), 3)) {

			System.out.println("true");

		} else {
			System.out.println("false");
		}

//		Треугольник со сторонами а,b,с является равнобедренным.

		System.out.println("6.");

		int a = 2;
		int b = 4;
		int c = 2;

		if (a == b || b == c || a == c) {

			System.out.println("true");

		} else {
			System.out.println("false");
		}

//		Сумма каких-либо двух цифр заданного трехзначного натурального числа N равна третьей цифре.

		System.out.println("7.");

		int T = 279;

		int d1 = T / 100;
		int d2 = (T / 10) % 10;
		int d3 = T % 10;

		int a12 = d1 + d2;
		int a13 = d1 + d3;
		int a23 = d2 + d3;

		if (a12 == d3 || a13 == d2 || a23 == d1) {

			System.out.println("true");

		} else {
			System.out.println("false");
		}

//		Заданное число N является степенью числа а (показатель степени может находиться в диапазоне от 0 до 4).

		System.out.println("8.");

		int a1 = 2;
		int N1 = 16;

		if (Math.pow(a1, 0) == N1 || Math.pow(a1, 1) == N1 || Math.pow(a1, 2) == N1 || Math.pow(a1, 3) == N1
				|| Math.pow(a1, 4) == N1) {

			System.out.println("true");

		} else {
			System.out.println("false");
		}

//		График функции у = ах2 + bх+ с проходит через заданную точку с координатами (m, п).

		System.out.println("9.");

		int m1 = 2;
		int n1 = 24;

		int a2 = 2, b2 = 4, c2 = 8;

		if (a2 * m1 * m1 + b2 * m1 + c2 == n1) {

			System.out.println("true");

		} else {
			System.out.println("false");
		}
	}

}