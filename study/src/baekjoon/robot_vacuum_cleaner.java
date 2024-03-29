package baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

// https://buddev.tistory.com/37
// 

public class robot_vacuum_cleaner {
	static int[][] arr;
	static int n,m,r,c,d;
	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer(br.readLine());
		n=Integer.parseInt(st.nextToken());
		m=Integer.parseInt(st.nextToken());
		
		arr=new int[n][m];
		st=new StringTokenizer(br.readLine());
		r=Integer.parseInt(st.nextToken());
		c=Integer.parseInt(st.nextToken());
		d=Integer.parseInt(st.nextToken());
		for(int i=0;i<n;i++) {
			st=new StringTokenizer(br.readLine());
			for(int j=0;j<m;j++) {
				arr[i][j]=Integer.parseInt(st.nextToken());
			}
		}
		clean(arr,r,c,d);
		
	}
	
	public static int clean(int[][] arr,int r,int c, int d) {
		int answer;
		
		Cleaner cleaner=new Cleaner(r,c,d);
		return 0;
	}
}

class Cleaner{
	int r;
	int c;
	int d;
	public Cleaner(int r, int c, int d) {
		super();
		this.r = r;
		this.c = c;
		this.d = d;
	}
	
}