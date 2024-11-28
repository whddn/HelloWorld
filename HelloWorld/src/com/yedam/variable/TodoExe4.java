package com.yedam.variable;

import java.util.Scanner;

public class TodoExe4 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("몇단까지 출력하겠습니까? ");
		int dan = scn.nextInt(); // 사용자 입력값을 int 반환

		for (int j = 0; j <= 9; j++) {
//			System.out.printf("현재 %d 단입니다. \n", j);
			for (int i = 2; i <= dan; i++) {
				System.out.printf("%d * %d = %2d ", i, j, j * i);
			}
			System.out.println(); // 줄바꿈
		}
		System.out.println("end of prog");

		// 별찍기
		for (int j = 5; j >= 1; j--) {
			for (int i = 1; i <= j; i++) {
				System.out.printf("*");
			}
			System.out.println();
		}

	}
}
