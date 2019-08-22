package by.htp.les02.main;

//36. Найти частное произведений четных и нечетных цифр четырехзначного числа.

public class Task36 {
	public static void main(String[] args) {

		int M = 53244855;
		int multipleEven = 1;
		int multipleOdd = 1;

		while (M != 0) {

			if (M % 2 == 0) {

				multipleEven = multipleEven * (M % 10);

			} else {
				multipleOdd = multipleOdd * (M % 10);

			}

			M = M / 10;

		}
		System.out.println(
				"Multiple of even digist is: " + multipleEven + " , multiple of odd digits is: " + multipleOdd);

	}

}