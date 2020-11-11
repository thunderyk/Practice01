package com.javaex.practice;

import java.util.Scanner;

public class Ex13 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		final double EXCHANE_RATE = 1230.95;
		double won;
		double result;

		System.out.print("환전할 원화를 입력하세요: ");
		won = sc.nextDouble();
		result = won / EXCHANE_RATE;
		System.out.println("받으실 달라는 "+result);
		
		sc.close();
	}
}
