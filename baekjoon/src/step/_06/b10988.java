package step._06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class b10988 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String word = br.readLine();
		
		boolean flag = true;
		for(int i = 0; i < word.length() / 2; i++) {
			if(word.charAt(i) != word.charAt(word.length() - i - 1)) flag = false;
		}
		
		if(flag == false) System.out.println(0);
		else System.out.println(1);
	}

}
