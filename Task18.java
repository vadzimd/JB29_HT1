package by.htp.les02.main;

//18. Дана длина ребра куба. Найти площадь грани, площадь полной поверхности и объем этого куба.

public class Task18 {
	public static void main(String[] args) {

		double lengthEdgeCube = 2.0078;

		double squareFaceCube;
		double squareTotalCube;
		double capacityCube;

		squareFaceCube = lengthEdgeCube * lengthEdgeCube;
		squareTotalCube = squareFaceCube * 6;
		capacityCube = Math.pow(lengthEdgeCube, 3);

		System.out.println(
				"The square of the face of the cube is " + squareFaceCube + " , the total square of the cube is: "
						+ squareTotalCube + " , the capacity of the cube is: " + capacityCube);
	}

}
