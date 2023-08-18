package step._02;

import java.util.Scanner;

public class b2525 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int a, b, c;
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		
		if(b + c >= 60) {
			a += ((b + c) / 60);
			if(a >= 24) {
				a -= 24;
			} 
			
			b = (b + c) % 60;
		} else {
			b += c;
		}

		System.out.println(a +" "+ b);
	}

}
