package step._04;

import java.util.Scanner;

public class b10807 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n, a, v;
		n = sc.nextInt();
		int[] num = new int[n];
		
		for(int i = 0; i < n; i++) {
			num[i] = sc.nextInt();
		}

		v = sc.nextInt();
		
		int res = 0;
		for(int i = 0; i < n; i++) {
			if(num[i] == v) res++;
		}
		
		System.out.println(res);
	}

}
