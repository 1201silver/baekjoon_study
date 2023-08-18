package step._08;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class b1193 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int x = Integer.parseInt(br.readLine());
		
		int group = 0;
		int i = 0;
		
		while(i < x) {
			group++;
			i += group;
		}
//		System.out.println(i); // x = 8, group = 4, i = 10
		
		int a, b;
		
		if(group % 2 == 0) {
			a = group - (i - x);
			b = i - x + 1;
		} else {
			a = i - x + 1;
			b = group - (i - x);
		}
		System.out.println(a +"/"+ b);
	}

}
