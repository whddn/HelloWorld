package com.yedam.variable;

public class TodoExe1 {
	public static void main(String[] args) {
		// Math.random() : 0 ~ 1 임의의 실수
		// 1 ~ 100 까지의 임의의 정수 3번 생성
		// 3개의 변수의 합 강제형변환( (int) )
		
		int sum = 0;
		for(int i=1; i<=3; i++) {
			int n = (int) (Math.random()*100) + 1;
			sum += n;
		}
		System.out.println(sum);
		
	}
}
