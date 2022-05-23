package Exam;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exam2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		List<Integer> treeX = new ArrayList<Integer>();
		List<Integer> treeY = new ArrayList<Integer>();
		List<String> result = new ArrayList<String>();

		// 공사 현장 x좌표
		int a = scanner.nextInt();
		// 공사 현장 y좌표
		int b = scanner.nextInt();
		// 소음 크기
		int R = scanner.nextInt();
		// 나무 그늘 수
		int N = scanner.nextInt();

		for (int i = 0; i < N; i++) {
			treeX.add(scanner.nextInt());
			treeY.add(scanner.nextInt());
		}

		for (int i = 0; i < N; i++) {
			if (Math.pow((treeX.get(i) - a), 2) + Math.pow((treeY.get(i) - b), 2) >= Math.pow(R, 2)) {
				result.add("silent");
			} else {
				result.add("noisy");
			}
		}

		for (int i = 0; i < N; i++) {
			System.out.println(result.get(i));
		}

	}
}
