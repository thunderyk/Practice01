package com.javaex.practice;

import java.util.Scanner;

public class Ex11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int moneySave = 0;
		System.out.print("월급을 입력하세요: ");
		moneySave = sc.nextInt();
		moneySave = moneySave * 10 * 12;
		System.out.println("10년동안 최대 저축액은 " + moneySave + "원 입니다.");
		
		sc.close();
	}
}
