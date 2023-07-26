package step13;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class b1427 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String s = br.readLine();
		
		int[] counting = new int[10];
		
		for(int i = 0; i < s.length(); i++) {
			counting[(int)s.charAt(i) - 48] += 1;
		}

		for(int i = 9; i >= 0; i--) {
			while(counting[i] > 0) {
				System.out.print(i);
				counting[i] -= 1;
			}
			
		}
	}

}
