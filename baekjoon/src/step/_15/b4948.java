package step._15;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class b4948 {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		while(true) {
			int n = Integer.parseInt(br.readLine());
			if(n == 0) break;
			
			boolean[] prime = new boolean[2 * n + 1];
			
			prime = getPrimeNum(prime, n);
			
			int cnt = 0;
			for(int i = n + 1; i <= 2 * n; i++) {
				if(!prime[i]) cnt++;
			}
			
			sb.append(cnt +"\n");
		} 
		System.out.println(sb);
		
	}
	
	public static boolean[] getPrimeNum(boolean[] prime, int n) {
		prime[0] = prime[1] = true;
		
		for(int i = 2; i * i < prime.length; i++) {
			if(!prime[i]) {
				for(int j = i * i; j < prime.length; j += i) {
					prime[j] = true;
				}
			}
		}
		return prime;
	}
	
	/*
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int n;
		while(true) {
			n = Integer.parseInt(br.readLine());
			if(n == 0) break;
			sb.append(getPrimeNum(n) +"\n");
		} 

		System.out.println(sb);
	}
	
	public static int getPrimeNum(int n) {
		
		BigInteger bi;
		
		int cnt = 0;
		for(int i = n; i <= 2 * n; i++) {
			bi = new BigInteger(String.valueOf(i));
			if(bi.isProbablePrime(10)) cnt++;
		}
		return cnt;
	}*/
}
