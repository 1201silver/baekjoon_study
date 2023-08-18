package step._13;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;

public class b2751 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());
		
		ArrayList<Integer> num = new ArrayList<>();
		
		for(int i = 0; i < n; i++) {
			num.add(Integer.parseInt(br.readLine()));
		}
		
		Collections.sort(num);
		
		StringBuilder sb = new StringBuilder();
		for(int x : num) {
			sb.append(x+"\n");
		}
		bw.write(sb.toString());
		bw.close();
	}

}
