package step._10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class b27323 {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int a = Integer.parseInt(br.readLine());
		int b = Integer.parseInt(br.readLine());
		
		System.out.println(a * b);
	}

}