package com.javaex.practice;

import java.util.Scanner;

public class Ex15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		final double MILE = 1.609;
		double input_mile, output_Km;
		
		System.out.print("마일을 입력하세요: ");
		input_mile = sc.nextDouble();
		output_Km = input_mile * MILE;
		System.out.println(input_mile+"마일은 "+output_Km+"킬로미터 입니다.");
		
		sc.close();
	}

}
