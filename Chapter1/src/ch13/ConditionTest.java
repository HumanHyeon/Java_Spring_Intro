package ch13;

import java.util.Scanner;

public class ConditionTest {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int max;
		
		System.out.print("두 수를 입력 받아서 더 큰 수를 출력하세요 : ");
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		
		max = (num1 > num2) ? num1 : num2;
		System.out.println(max);
	}

}
