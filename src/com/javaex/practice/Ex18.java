package com.javaex.practice;

import java.util.Scanner;

public class Ex18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		double fahren, celsius;

		System.out.print("화씨: ");
		fahren = sc.nextDouble();
		celsius = (double) 5 / (double) 9 * (fahren - 32);
		System.out.println("화씨 "+fahren+"의 섭씨온도는 "+celsius+"입니다.");
		sc.close();
	}

}
