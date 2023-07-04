package step1;

import java.util.Scanner;

public class b2588 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a, b;
		a = sc.nextInt();
		b = sc.nextInt();
		
		int x = a * (b % 10);
		int y = a * ((b / 10) % 10);
		int z = a * (b / 100);
		
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
		System.out.println((z * 100) + (y * 10) + x);
	}

}
