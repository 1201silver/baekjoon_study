package step8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class b2903 {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());

		int even = 1;
		int dot = 1;
	
		for(int i = 0; i < n; i++) {
			even *= 2;
		}
		dot += even;
		dot *= dot;
		System.out.println(dot);
	}

}
