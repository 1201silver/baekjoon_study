package step._08;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class b2720 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());
		
		int [][] change = new int[n][4];
		
		for(int i = 0; i < n; i++) {
			int cent = Integer.parseInt(br.readLine());
			
			int q = cent / 25;
			cent %= 25;
			
			int d = cent / 10;
			cent %= 10;
			
			int ni = cent / 5;
			cent %= 5;
			
			int p = cent / 1;
			cent %= 11;
			
			System.out.println(q +" "+ d +" "+ ni +" "+ p);
		}
	}

}
