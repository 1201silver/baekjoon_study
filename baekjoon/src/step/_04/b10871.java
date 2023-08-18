package step._04;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;
import java.util.StringTokenizer;

public class b10871 {

	public static void main(String[] args) throws IOException {
		/*
		Scanner sc = new Scanner(System.in);
		
		int n, x;
		n = sc.nextInt();
		x = sc.nextInt();

		for(int i = 0; i < n; i++) {
			int a = sc.nextInt();
			if(a < x) System.out.print(a +" ");
		}
		*/
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int x = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(br.readLine());
		
		for(int i = 0; i < n; i++) {
			int a = Integer.parseInt(st.nextToken());
			if(a < x) bw.write(a +" ");
		}
		bw.close();
	}

}
