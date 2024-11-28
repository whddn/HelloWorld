package com.yedam;

// 대소문자 구분 (A , a 서로 다름)
// 객체지향언어 (Object Oriented Language)
public class Hello {

	// method 여러개 선언. start(), main();

	public static void start() {
		System.out.println("시작합니다");
	}

	// main 메소드 함수(function)자바에선 객체안에 있는 함수를 메소드라 불림
	public static void main(String[] args) {
		// 콘솔에 Hello, World 출력
		System.out.println("Hello, World");
		start();

		// let result = "Hello";
		OperationExe exe = new OperationExe();
		exe.sum(10, 20);

		// Hello.java -> Hello.class(실행파일)
		// 컴파일(저장하면 eclipse 컴파일)
		// HelloWorld 프로젵그 - HelloWorld repository

	}
}
