package by.htp.les02.main;

//32. Текущее показание электронных часов: т ч (0 ≤ т ≤23) п мин (0 ≤ п ≤59) к с (0 ≤к ≤59). Какое время будут показывать часы через р ч q мин r с?

public class Task32 {
	public static void main(String[] args) {
		int m = 6;
		int n = 22;
		int k = 41;

		int p = 22;
		int q = 2;
		int r = 4;

		int timeNowSeconds = (m + p) * 3600 + (n + q) * 60 + k + r;

		int H = (int) timeNowSeconds / 3600;
		int M = (timeNowSeconds - H * 3600) / 60;
		int S = (timeNowSeconds - H * 3600 - M * 60);

		if (H > 24) {

			H = H % 24;
		}

		System.out.println("Time: " + H + " H " + M + " M " + S + " S ");

	}

}