package Exam;

import java.util.Scanner;

public class Exam1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		String[] str = new String[num];

		for (int i = 0; i < num; i++) {
			str[i] = scanner.next();
		}

		System.out.printf("Hello ");
		for (int i = 0; i < num - 1; i++) {
			System.out.printf("%s,", str[i]);
		}
		System.out.printf("%s.", str[num - 1]);

	}
}
