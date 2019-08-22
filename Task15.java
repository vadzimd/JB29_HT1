package by.htp.les02.main;

//15. Написать программу, которая выводит на экран первые четыре степени числа π.

public class Task15 {
	public static void main(String[] args) {
		double piPower1;
		double piPower2;
		double piPower3;
		double piPower4;

		piPower1 = Math.pow(Math.PI, 1);
		piPower2 = Math.pow(Math.PI, 2);
		piPower3 = Math.pow(Math.PI, 3);
		piPower4 = Math.pow(Math.PI, 4);

		System.out.println("The 1st power of PI is: " + piPower1 + " , the 2nd power of PI is: " + piPower2
				+ " , the 3rd power of PI is: " + piPower3 + " , the 4th power of PI is: " + piPower4);
	}

}
