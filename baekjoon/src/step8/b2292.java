package step8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class b2292 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());

		int i = 1;
		int room = 1;
		while (i < n) {
			i += (6 * room);
			room++;
			System.out.println(i);
		}
		
		System.out.println(room);
	}

}
