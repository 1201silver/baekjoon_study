package step9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class b11653 {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());

		int i = 2;
		while(n >= i) {
			if(n % i != 0) {
				i++;
			} else {
				n /= i;
				System.out.println(i);
			}
			
		}
	}

}
