package by.htp.les02.main;

//33. Ввести любой символ и определить его порядковый номер, а также указать предыдущий и последующий символы.

public class Task33 {
	public static void main(String[] args) {

		char ch = 'z';

		int numCh = ch;

		char prevChar = (char) (ch - 1);
		char nextChar = (char) (ch + 1);

		System.out.println(
				"Char number is: " + numCh + " , previous char is: " + prevChar + " , next char is: " + nextChar);

	}

}