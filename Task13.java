package by.htp.les02.main;

//13. Заданы координаты трех вершин треугольника (х1 у2),(х2, у2) ),(х3, у3). Найти его периметр и площадь.

public class Task13 {
	public static void main(String[] args) {
		double x1 = 10.0;
		double x2 = 3.0;
		double x3 = 0.0;
		double y1 = 0.5;
		double y2 = 0.0;
		double y3 = 4.0;
		double perimeterTriangle;
		double perimeterTriangleHalf;
		double squareTriangle;

		double a = Math.sqrt((x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2));
		double b = Math.sqrt((x1 - x3) * (x1 - x3) + (y1 - y3) * (y1 - y3));
		double c = Math.sqrt((x2 - x3) * (x2 - x3) + (y2 - y3) * (y2 - y3));

		if (a + b <= c || a + c <= b || a + c <= b)
			System.out.println("The triangle doesn't exist");
		else {
			perimeterTriangle = a + b + c;
			perimeterTriangleHalf = perimeterTriangle / 2.0;
			squareTriangle = Math.sqrt(perimeterTriangleHalf * (perimeterTriangleHalf - a) * (perimeterTriangleHalf - b)
					* (perimeterTriangleHalf - c));
			System.out.println("The perimeter of the triangle is: " + perimeterTriangle
					+ " , the square of the triangle is: " + squareTriangle);
		}
	}

}
