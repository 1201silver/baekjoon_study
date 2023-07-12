package step6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class b25206 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		double sum = 0;
		double total = 0;
		
		for(int i = 0; i < 20; i++) {
			String[] s = br.readLine().split(" ");
			double credit = Double.parseDouble(s[1]);
			String grade = s[2];
			
			switch(grade) {
				case "A+":
					sum += (4.5 * credit);
					total += credit;
					break;
				case "A0":
					sum += (4.0 * credit);
					total += credit;
					break;
				case "B+":
					sum += (3.5 * credit);
					total += credit;
					break;
				case "B0":
					sum += (3.0 * credit);
					total += credit;
					break;
				case "C+":
					sum += (2.5 * credit);
					total += credit;
					break;
				case "C0":
					sum += (2.0 * credit);
					total += credit;
					break;
				case "D+":
					sum += (1.5 * credit);
					total += credit;
					break;
				case "D0":
					sum += (1.0 * credit);
					total += credit;
					break;
				case "F":
					sum += 0.0;
					total += credit;
					break;
				case "P":
					break;
			}
		}
		System.out.println(sum / total);

	}

}
