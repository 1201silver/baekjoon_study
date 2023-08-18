package step._14;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class b11478 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String s = br.readLine();

		HashSet<String> str = new HashSet<String>();
		
		int i = 0;
		while((s.length() - i) > 0) {
			for(int j = 0; j < s.length() - i; j++) {
				str.add(s.substring(j, j+i+1));
				
			}
			i++;
		}
		
		System.out.println(str.size());
	}

}
