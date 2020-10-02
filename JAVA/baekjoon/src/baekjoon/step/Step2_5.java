package baekjoon.step;

import java.util.Scanner;

public class Step2_5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int h = sc.nextInt();   //시
		int m = sc.nextInt();   //분
		sc.close();
		
		if(m<45) {
			h--;
			m = 60-(45-m);
			if(h<0) {
				h=23;
			}
			System.out.println(h + " " + m);
		} else {
			System.out.println(h + " " + (m-45));
		}
	}

}
