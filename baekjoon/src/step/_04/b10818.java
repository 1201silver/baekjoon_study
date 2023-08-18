package step._04;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class b10818 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine());

		int n = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(br.readLine());
		
		int min = 1000001;
		int max = -1000001;
		for(int i = 0; i < n; i++) {
			int a = Integer.parseInt(st.nextToken());
			
			if(a < min) min = a;
			if(a > max) max = a;
		}
		bw.write(min +" "+ max);
		bw.close();
	}

}
