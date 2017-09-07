package javastudy;

import java.util.Scanner;

public class DoWhile {

	public static void main(String[] args) {
		int value = 0;
		Scanner scan = new Scanner(System.in);
		
		do {
			 //반복할문장
			value = scan.nextInt();
			System.out.println("입력받은값 : "+value);
		} while (value != 10);
		
		System.out.println("반복문종료!!");
	}

}
