package step._14;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.StringTokenizer;

public class b7785 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		int n = Integer.parseInt(br.readLine());
		
		HashSet<String> emp = new HashSet<String>();

		for(int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			String name = st.nextToken();
			String state = st.nextToken();
			
			if(state.equals("enter")) emp.add(name);
			else if(state.equals("leave")) emp.remove(name);
		}
		
		Object[] arr = emp.toArray();
		
		Arrays.sort(arr, new Comparator<Object>() {
			@Override
			public int compare(Object o1, Object o2) {
				return (o2.toString()).compareTo(o1.toString());
			}
		});
		
		for(Object a: arr) {
			System.out.println(a);
		}
	}

}
