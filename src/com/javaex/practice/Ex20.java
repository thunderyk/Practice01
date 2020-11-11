package com.javaex.practice;

import java.util.Scanner;

public class Ex20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int fiveHund, oneHund, fifty, ten, result;
		System.out.print("500원 개수: ");
		fiveHund = sc.nextInt();
		System.out.print("100원 개수: ");
		oneHund = sc.nextInt();
		System.out.print("50원 개수: ");
		fifty = sc.nextInt();
		System.out.print("10원 개수: ");
		ten = sc.nextInt();
		result = (500 * fiveHund) + (100 * oneHund) + (50 * fifty) + (10 * ten);

		System.out.println("동전의 총합은 " + result + "입니다.");
		
		sc.close();
	}

}
