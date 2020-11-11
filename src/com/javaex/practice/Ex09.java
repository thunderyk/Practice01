package com.javaex.practice;

public class Ex09 {

	public static void main(String[] args) {
		double f = 80.0;
		System.out.println(5 / 9 * (f - 32.0));
		System.out.println(5.0 / 9.0 * (f - 32.0));
		System.out.println((double) 5 / (double) 9 * (f - 32.0));
		//5, 9는 int이기(정수형) 때문에 나누면 0이된다.
		//실수형으로 해야 소수점까지 나와서 계산을 할 수 있다.
	}
}
