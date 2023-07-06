package step4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class b2562 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int max = -10000;
		int line = 0;
		for(int i = 0; i < 9; i++) {
			int a = Integer.parseInt(br.readLine());
			
			if(a > max) {
				max = a;
				line = i + 1;
			}
		}
		bw.write(max +"\n"+ line);
		bw.close();
	}

}
