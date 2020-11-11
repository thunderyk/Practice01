package com.javaex.practice;

public class Ex07 {

	public static void main(String[] args) {
		int i = 10;
		int n = ++i % 2;
		System.out.println(i); // 11
		System.out.println(n); // 1
		
		/*Ex06과 Ex07의 다른점은
		  Ex06의 경우의 i는 n에 대입할 때
		  10 % 2를 하고 i를 증가시키고
		  Ex07의 경우는 i를 증가시켜서
		  11 % 2를 해서 대입 시킨다.  
		 */
	}
}
