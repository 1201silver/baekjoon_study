package step._04;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashSet;

public class b3052 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		HashSet<Integer> num = new HashSet<Integer>();
		
		for(int i = 0; i < 10; i++) {
			num.add(Integer.parseInt(br.readLine()) % 42);
		}
		
		bw.write(num.size()+ "\n"); //�ڿ� "\n" �Ⱥ��̸� ���ڵ��������� ���� ���ڰ� �ȶ��. ...
		bw.close();
	}

}
