package com.javaex.practice;

import java.util.Scanner;

public class Ex16 {

	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		
		final double SURTAX = 0.1;
		double get_Money, price, balance,current_surtax;
		
		System.out.print("상품가격: ");
		price = sc.nextDouble();
		System.out.print("받은돈: ");
		get_Money = sc.nextDouble();
		current_surtax = price * SURTAX;
		balance = get_Money - price;
		System.out.println("==================================");
		System.out.println("받은돈: "+get_Money);
		System.out.println("상품가격: "+price);
		System.out.println("부가세: "+current_surtax);
		System.out.println("잔액: "+balance);
		
		sc.close();
	}
}
