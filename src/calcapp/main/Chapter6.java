package calcapp.main;

import calcapp.logics.Chapter6Logic;

public class Chapter6 {
	public static void main(String[] args) {
		int a = 10;
		int b = 2;
		int total = Chapter6Logic.tasu(a, b);
		int delta = Chapter6Logic.hiku(a, b);
		System.out.println("足すと" + total + "、引くと" + delta);
	}
}
