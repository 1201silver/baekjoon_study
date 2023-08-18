package step._05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class b27866 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String word = br.readLine();
		int n = Integer.parseInt(br.readLine());
		
		System.out.println(word.charAt(n - 1));

	}

}
