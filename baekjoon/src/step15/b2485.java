package step15;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class b2485 {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		int [] colon = new int [n];
		for(int i = 0; i < n; i++) {
			colon[i] = Integer.parseInt(br.readLine());
		}

		Arrays.sort(colon);
		int gcd = 0;
		for(int i = 0; i < n - 1; i++) {
			gcd = getGCD(colon[i + 1] - colon[i], gcd);
		}
		
		System.out.println((colon[n - 1] - colon[0]) / gcd - n + 1);
	}

	public static int getGCD(int a, int b) {
		if(b == 0) return a;
		
		if(a < b) {
			int tmp = a;
			a = b;
			b = tmp;
		}
		
		if(a % b == 0) return b;
		return getGCD(b, a % b);
	}
}
