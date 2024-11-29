package com.yedam.reference;

import java.util.Scanner;

public class ArrayEx2 {
	public static void main(String[] args) {
		// 변수 초기화. 10만원 초과불가. -잔고불가. 90000원이면 20000원 못받아들임
		boolean run = true;
		int balance = 0;
		int maxBalance = 100000; // 최대금액
		Scanner scn = new Scanner(System.in);

		while (run) {
			System.out.println("-------------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료   ");
			System.out.println("-------------------------------");
			System.out.print("선택>>> ");
			int menu = Integer.parseInt(scn.nextLine());

			switch (menu) {
			case 1:
				System.out.print("예금액> ");
				// 현재잔고 + 예금액 <= 100000 인 경우 정상예금처리
				int inBalance = Integer.parseInt(scn.nextLine());
				if (balance + inBalance <= maxBalance) {
					balance += inBalance;
				} else {
					System.out.println("입금금액이 100000원을 넘을수 없습니다");
				}
				break;
			case 2:
				System.out.print("출금액> ");
				// 현재잔고 - 출금액 > 0 인 경우 정상출금처리
				inBalance = Integer.parseInt(scn.nextLine());
				if (balance - inBalance >= 0) {
					balance -= inBalance;
				} else {
					System.out.println("마이너스 잔고로 출금할수 없음");
				}
				break;
			case 3:
				System.out.println("잔고> " + balance);
				break;
			case 4:
				run = false;
			}
		}
		System.out.println("프로그램 종료");

	}
}
