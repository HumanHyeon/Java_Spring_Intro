package ch14;

import java.util.Scanner;

public class IfElseTest {

	public static void main(String[] args) {
		int age;
		
		Scanner scan = new Scanner(System.in);
		age = scan.nextInt();
		
		if (age >= 8)
			System.out.println("학교에 다닙니다.");
		else
			System.out.println("학교에 다니지 않습니다.");
		System.out.println("노는게 제일 좋아");
	}

}
