package by.htp.les02.main;

//19. Дана сторона равностороннего треугольника. Найти площадь этого треугольника, его высоту, радиусы вписанной и описанной окружностей.

public class Task19 {
	public static void main(String[] args) {

		double triangleSideLength = 1.568;

		double triangleSquare;
		double triangleHeight;
		double circleCircumscribedRadius;
		double circleInscribedRadius;

		triangleSquare = triangleSideLength * triangleSideLength * (Math.sqrt(3) / 4);
		triangleHeight = triangleSideLength * (Math.sqrt(3) / 2);
		circleCircumscribedRadius = triangleSideLength * (Math.sqrt(3) / 3);
		circleInscribedRadius = triangleSideLength * (Math.sqrt(3) / 6);
		
		System.out.println("The square of the triangle is " + triangleSquare + " , the height of the triangle is: "
				+ triangleHeight + " , the radius of the circumscribed circle is: " + circleCircumscribedRadius
				+ " , the radius of the inscribed circle is: " + circleInscribedRadius);
	}

}