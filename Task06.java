package by.htp.les02.main;

//6. Написать код для решения задачи. В n малых бидонах 80 л молока. Сколько литров молока в m больших бидонах, если в каждом большом бидоне на 12 л. больше, чем в малом?

public class Task06 {
	public static void main(String[] args) {
		int n = 5;
		int m = 10;

		int literSmallCanTotal = 80;
		double literBigCanTotal;

		literBigCanTotal = ((literSmallCanTotal / n) + 12) * m;

		System.out.println("Big cans contain " + literBigCanTotal + " liters");
	}

}
