package kakao2020intern;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class test02 {

	public static void main(String[] args) {
		
		String expression="100-200*300-500+20";
		
		solution(expression);
	}

	public static long solution(String expression) {
		ArrayList<String> arr=new ArrayList<>();
		String[] mi=null;
		long answer=0;
		
		expression=expression.replace("-","+");
		expression=expression.replace("*","+");
		System.out.println(expression);
		mi=expression.split("\\+");
		
		
		Queue<Integer> num=new LinkedList<Integer>();
		for(int i=0;i<mi.length;i++) {
			num.add((Integer.parseInt(mi[i])));
		}
		answer=cir(num,Integer.parseInt(mi[0]),0,0);
		
		System.out.println(answer+"::::answer");
		return answer;
	}
	
	public static int cir(Queue<Integer> num,int a,int b,int c){
		int cnt=num.size();
		System.out.println(cnt+"::::cnt값이야");
		int hap;
		hap=Math.max(a, b);			
		hap=Math.max(hap, c);
		if(cnt==0) {
			int temp=Math.max(a, b);;
			System.out.println(temp+"::::이건 뭘까");
			return Math.max(temp, c);
		}else {
			int temp1=num.poll();
			int as=hap+temp1;
			int bs=hap-temp1;
			int cs=hap*temp1;
			return cir(num,as,bs,cs);
		}
		
	
	}
}
