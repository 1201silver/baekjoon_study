package step15;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class b1934 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int n = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			
			if(a < b) {
				int tmp = a;
				a = b;
				b = tmp;
			}
//			System.out.println(getGCD(a, b));
			System.out.println((a * b) / getGCD(a, b));
		}
	}
	
	public static int getGCD(int a, int b) {
		if(a % b == 0) return b;

		return getGCD(b, a % b);
	}

}
