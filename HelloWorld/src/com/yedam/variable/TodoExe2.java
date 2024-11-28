package com.yedam.variable;

import java.util.Scanner;

public class TodoExe2 {
	public static void main(String[] args) {
		String name = "김길동";
		
		Scanner scn = new Scanner(System.in);
		System.out.println("이름을 입력하세요");
		String inputValue = scn.nextLine(); // 사용자의 입력값을 반환
		
		if(inputValue.equals(name)) {
			System.out.println("같은이름입니다"); // 같은이름. 다른이름
		}else {
			System.out.println("다른이름입니다");
		}
		System.out.println("end of prog");
		
	}
}
