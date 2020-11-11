package com.javaex.practice;

import java.util.Scanner;

public class Ex19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		long light_Speed_Second, year_To_Second, result;
		year_To_Second = 31536000;
		light_Speed_Second = 300000;
		result = light_Speed_Second * year_To_Second;
		System.out.println("빛이 1년 동안 가는 거리는 " + result + "Km 입니다.");
		
		sc.close();
	}

}
