package baekjoon.step;

import java.util.Scanner;

public class Step3_1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		sc.close();
		
		if (a > 1 && a < 10) {
			for (int i = 1; i < 10; i++) {
				System.out.println(a + " * " + i + " = " + a*i);
			}
		}
	}

}
