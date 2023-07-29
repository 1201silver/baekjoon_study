package step15;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class b4134 {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		long[] num = new long[n];
		
		for(int i = 0; i < n; i++) {
			num[i] = Long.parseLong(br.readLine());
			long prime = getPrime(num[i]);
			System.out.println(prime);
		}
	}
	
	public static Long getPrime(long a) {
		BigInteger big = new BigInteger(String.valueOf(a));
				
		if(big.isProbablePrime(10)) {
			return a;
		}
		
		return getPrime(a+1);
	}
	
	
	/*
	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < n; i++) {
			long num = Long.parseLong(br.readLine());
			
			while(true) {
				boolean flag = true;
				for(int j = 2; j < num; j++) {
					if(num % j == 0) {
						flag = false;
						break;
					}
				}
				if(flag == true){
					System.out.println(num);
					break;
				}
				num++;
			}
		}

	} */
}
