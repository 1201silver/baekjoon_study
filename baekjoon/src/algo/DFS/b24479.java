package algo.DFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class b24479 {
	
	static ArrayList<ArrayList<Integer>> graph;
	static int[] seq;
	
	static int cnt = 1;

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		int r = Integer.parseInt(st.nextToken());
		
		graph = new ArrayList<ArrayList<Integer>>();
		seq = new int[n + 1];
		
		for(int i = 0; i <= n; i++) { 
			graph.add(new ArrayList<Integer>());
		}
		
		for(int i = 0; i < m; i++) {
			st = new StringTokenizer(br.readLine());
			
			int u = Integer.parseInt(st.nextToken());
			int v = Integer.parseInt(st.nextToken());
			
			graph.get(u).add(v);
			graph.get(v).add(u);
		}
		
		for(int i = 1; i <= n; i++) {
			Collections.sort(graph.get(i));
		}
		
		dfs(r);
		
		for(int i = 1; i <= n; i++) {
			sb.append(seq[i] +"\n");
		}
		System.out.println(sb);
	}
	
	static void dfs(int num) {
		
		seq[num] = cnt;
		
//		System.out.println(num +" -> "+ cnt);
		
//		Collections.sort(graph.get(num));
		
		for(int i = 0; i < graph.get(num).size(); i++) {
			int g = graph.get(num).get(i);
			
			if(seq[g] == 0) {
				cnt++;
				dfs(g);
			}
		}
	}

}
