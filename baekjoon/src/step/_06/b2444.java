package step._06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class b2444 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < n; i++) {
			for(int x = 0; x < (n - i - 1); x++) {
				System.out.print(" ");
			}
			for(int y = 0; y < (2 * i + 1); y++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		
		for(int i = n - 1; i > 0; i--) {
			for(int x = 0; x < (n - i); x++) {
				System.out.print(" ");
			}
			
			for(int y = 0; y < (2 * i - 1); y++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}

}
