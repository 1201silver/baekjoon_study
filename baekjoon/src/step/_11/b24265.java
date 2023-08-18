package step._11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class b24265 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		long n = Integer.parseInt(br.readLine());
		
		System.out.println((n * (n - 1)) / 2 +"\n"+ 2);

	}

}