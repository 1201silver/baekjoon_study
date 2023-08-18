package step._05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class b2675 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int t = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < t; i ++) {
			String line = br.readLine();
			st = new StringTokenizer(line);
			
			int r = Integer.parseInt(st.nextToken());
			String s = st.nextToken();
			
			String word = "";
			for(int j = 0; j < s.length(); j++) {
				for(int k = 0; k < r; k++) {
					word += s.charAt(j);
				}
			}
			System.out.println(word);
		}
		
	}

}
