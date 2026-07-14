package com.recursion;

public class Char_Tracking {

	static int i = 0;
	static int last = -1;
	static int first = -1;

	private static void ch(String a, char b) {
		if (i == a.length() ) {
			System.out.println(first);
			System.out.println(last);
			return;

		}
		if ((a.charAt(i) == b)) {

			if (first == -1) {
				first = i;

			}
			last = i;
		}

		i = i + 1;

		 ch(a, b);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ch("helloooo", 'o');

	}

}
