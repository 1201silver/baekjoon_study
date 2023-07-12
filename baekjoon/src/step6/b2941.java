package step6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class b2941 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String [] croatia = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};
	
		String s = br.readLine();
		
		int cnt = 0;
		for(int i = 0; i < croatia.length; i++) {
			if(s.contains(croatia[i])) s = s.replace(croatia[i], "!");
		}
		
		System.out.println(s.length());
	}

}
