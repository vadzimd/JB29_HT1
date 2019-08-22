package by.htp.les02.main;

//16. Найти произведение цифр заданного четырехзначного числа.

public class Task16 {
	public static void main(String[] args) {

		int num = 4279;

		int digitsMultiple = num / 1000 + num % 1000 / 100 + num % 100 / 10 + num % 10;

		System.out.println("The sum of the digits is: " + digitsMultiple);
	}

}
