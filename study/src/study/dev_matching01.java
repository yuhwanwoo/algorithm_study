package study;

public class dev_matching01 {

	public static void main(String[] args) {
		String p="82195";
		String s="64723";
		
		solution(p, s);
	}
	
	public static void solution(String p,String s) {
		int result=0;
		String[] ans1=p.split("");
		String[] ans2=s.split("");
		int[] ansi1=new int[ans1.length];
		int[] ansi2=new int[ans2.length];
		
		for(int i=0;i<ans1.length;i++) {
			ansi1[i]=Integer.parseInt(ans1[i]);
		}
		
		for(int i=0;i<ans2.length;i++) {
			ansi2[i]=Integer.parseInt(ans2[i]);
		}
		
		for(int i=0;i<ans1.length;i++) {
			if((Math.abs(ansi1[i]-ansi2[i]))>5) {
				result=result+10-Math.abs(ansi1[i]-ansi2[i]);
			}else {
				result=result+Math.abs(ansi1[i]-ansi2[i]);
			}
		}
		
		System.out.println(result);
		
		
	}

}
