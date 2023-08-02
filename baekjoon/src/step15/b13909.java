package step15;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class b13909 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());

//		boolean[] window = new boolean[n + 1];
		
		/*
		for(int i = 1; i <= n; i++) {
			for(int j = i; j <= n; j++) { // j°¡ iÀÇ ¾à¼öÀÏ ¶§ »óÅÂ ¹Ù²ñ (´Ý-¿­-´Ý-¿­ => È¦¼ö¹ø ¹Ù²¸¾ß ¿­¸°»óÅÂ) => Á¦°ö¼ö
				if(j % i == 0) {
					if(!window[j]) {
						window[j] = true;
					}
					else {
						window[j] = false;
					}
				}
			}
		}*/
		
		int cnt = 0;
		for(int i = 1; i * i <= n; i++) {
			cnt++;
		}
		System.out.println(cnt);
	}

}
