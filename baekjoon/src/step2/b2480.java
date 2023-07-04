package step2;

import java.util.Scanner;

public class b2480 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a, b, c;
		int cash = 0;
		
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();

		/*
		if(a == b) {
			if(a == c) cash = 10000 + (a * 1000);
			else cash = 1000 + (a * 100);
		} else if(a == c) {
			if(a == b) cash = 10000 + (a * 1000);
			else cash = 1000 + (a * 100);
		} else if(b == c) {
			if(b == a) cash = 10000 + (b * 1000);
			else cash = 1000 + (b * 100);
		} else {
			int max = 0;
			if(a > b) {
				if(a > c) max = a;
				else max = c;
			} else {
				if(b > c) max = b;
				else max = c;
			}
			cash = max * 100;
		}*/
		
		
		if((a != b) && (a != c) && (b != c)) {
			int max = Math.max(a, b);
			max = Math.max(max, c);
			cash = max * 100;
		} else if((a == b) && (b == c)) {
			cash = 10000 + (a * 1000);
		} else if((a == b) || (a == c)) {
			cash = 1000 + (a * 100);
		} else if(b == c) {
			cash = 1000 + (b * 100);
		}
		
		System.out.println(cash);
	}

}
