package step4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class b1546 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int n = Integer.parseInt(br.readLine());
		
		int[] score = new int[n];
		
		st = new StringTokenizer(br.readLine());
		
		int max = -1;
		for(int i = 0; i < n; i++) {
			int s = Integer.parseInt(st.nextToken());
			score[i] = s;
			if(s > max) max = s;
		}
		
		double sum = 0;
		for(int i = 0; i < n; i++) {
			sum += ((double)score[i] / max * 100);
			
		}
		
		double avg = sum / n;
		System.out.println(avg);
	}

}
