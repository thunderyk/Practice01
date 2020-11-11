package com.javaex.practice;

import java.util.Scanner;

public class Ex12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		final double PI = 3.14;
		double radius, result = 0;

		System.out.print("반지름을 입력하세요: ");
		radius = sc.nextDouble();
		result = radius * radius * PI;
		System.out.println("원의 넓이는 "+result);
		
		sc.close();
	}
}
