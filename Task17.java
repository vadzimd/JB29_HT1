package by.htp.les02.main;

//17. Даны два числа. Найти среднее арифметическое кубов этих чисел и среднее геометрическое модулей этих чисел.

public class Task17 {
	public static void main(String[] args) {

		double num1 = 2.0078;
		double num2 = -0.02;
		int power = 3;

		double arithMeanPower3;
		double geometrMeanMod;

		arithMeanPower3 = (Math.pow(num1, power) + Math.pow(num2, power)) / 2;

		geometrMeanMod = Math.sqrt(Math.abs(num1 * num2));

		System.out.println("The arithemetic mean of the numbers in power " + power + " is: " + arithMeanPower3
				+ " , the geometric mean of mod of the numbers is: " + geometrMeanMod);
	}

}
