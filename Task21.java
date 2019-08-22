package by.htp.les02.main;

//21. Дано действительное число R вида nnn.ddd (три цифровых разряда в дробной и целой частях). Поменять местами дробную и целую части числа и вывести полученное значение числа.

public class Task21 {
	public static void main(String[] args) {

		double R = 578.123;

		int intPart = (int) R;
		double decimalRevert = (R * 1000 - intPart * 1000) + (double) intPart / 1000;

		System.out.println(decimalRevert);
	}

}