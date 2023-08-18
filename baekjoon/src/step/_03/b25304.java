package step._03;

import java.util.Scanner;

public class b25304 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int x, n, a, b;
		x = sc.nextInt();
		n = sc.nextInt();
		
		int sum = 0;
		for(int i = 0; i < n; i++) {
			a = sc.nextInt();
			b = sc.nextInt();
			sum += (a * b);
		}
		
		if(x == sum) System.out.println("Yes");
		else System.out.println("No");
		
	}

}
