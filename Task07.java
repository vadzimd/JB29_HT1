package by.htp.les02.main;

//7. Дан прямоугольник, ширина которого в два раза меньше длины. Найти площадь прямоугольника

public class Task07 {
	public static void main(String[] args) {
		double lengthRectangle = 15.5;
		double widthRectangle = lengthRectangle / 2;

		double squareRectangle;

		squareRectangle = widthRectangle * lengthRectangle;

		System.out.println("The square of rectangle is " + squareRectangle);
	}

}
