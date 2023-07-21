package step12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class b19532 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] s = br.readLine().split(" ");
		int a = Integer.parseInt(s[0]);
		int b = Integer.parseInt(s[1]);
		int c = Integer.parseInt(s[2]);
		int d = Integer.parseInt(s[3]);
		int e = Integer.parseInt(s[4]);
		int f = Integer.parseInt(s[5]);
		
		for(int i = -999; i <= 999; i++) {
			for(int j = -999; j <= 999; j++) {
				if((a * i + b * j == c) && (d * i + e * j == f)) System.out.println(i +" "+ j);
			}
		}
		
		
	}

}
