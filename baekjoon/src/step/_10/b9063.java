package step._10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class b9063 {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int n = Integer.parseInt(br.readLine());

		int x_min = Integer.MAX_VALUE;
		int x_max = Integer.MIN_VALUE;
		
		int y_min = Integer.MAX_VALUE;
		int y_max = Integer.MIN_VALUE;
		
		for(int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			
			if(x < x_min) x_min = x;
			if(x > x_max) x_max = x;
			
			if(y < y_min) y_min = y;
			if(y > y_max) y_max = y;
		}
		
		System.out.println((x_max - x_min) * (y_max - y_min));
		
	}

}
