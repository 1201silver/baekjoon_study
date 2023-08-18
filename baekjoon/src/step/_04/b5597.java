package step._04;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class b5597 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int[] std = new int[30];
		
		for(int i = 0; i < 30; i++) {
			std[i] = 0;
		}
		
		for(int i = 0; i < 28; i++) {
			int num = Integer.parseInt(br.readLine());
			std[num - 1] = num;
		}

		for(int i = 0; i < 30; i++) {
			if(std[i] == 0) bw.write((i + 1) +"\n");
//			bw.write(std[i] +"\n");
		}
		
		bw.close();
	}

}
