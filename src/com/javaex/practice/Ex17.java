package com.javaex.practice;

import java.util.Scanner;

public class Ex17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		final double PI = 3.14;
		double volume, radius;

		System.out.print("반지름: ");
		radius = sc.nextDouble();
		volume = (double)4 / (double)3 * PI * (radius * radius * radius);
		System.out.println("구의 부피는: " + volume);
		sc.close();
	}

}
