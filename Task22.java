package by.htp.les02.main;

//22. Дано натуральное число Т, которое представляет длительность прошедшего времени в секундах. Вывести данное значение длительности в часах, минутах и секундах в следующей форме:ННч ММмин SSc.

public class Task22 {
	public static void main(String[] args) {

		int T = 11856;

		int hoursAmount = T / 3600;

		int minutesAmount = (T - hoursAmount * 3600) / 60;

		int secondsAmount = T - hoursAmount * 3600 - minutesAmount * 60;

		System.out.println(hoursAmount + "ч " + minutesAmount + "мин " + secondsAmount + "с");
	}

}