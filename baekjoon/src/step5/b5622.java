package step5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class b5622 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String word = br.readLine();
		
		int sum = 0;
		for(int i = 0 ; i < word.length(); i++) {
			char c = word.charAt(i);
			
			if(c >= 'A' && c <= 'C') sum += 3;
			else if(c >= 'D' && c <= 'F') sum += 4;
			else if(c >= 'G' && c <= 'I') sum += 5;
			else if(c >= 'J' && c <= 'L') sum += 6;
			else if(c >= 'M' && c <= 'O') sum += 7;
			else if(c >= 'P' && c <= 'S') sum += 8;
			else if(c >= 'T' && c <= 'V') sum += 9;
			else if(c >= 'W' && c <= 'Z') sum += 10;
		}
		
		System.out.println(sum);
		
	}

}
