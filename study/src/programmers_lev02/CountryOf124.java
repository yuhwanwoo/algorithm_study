package programmers_lev02;

// https://programmers.co.kr/learn/courses/30/lessons/12899
// ���α׷��ӽ� 12899 124 ������ ����

public class CountryOf124 {

	public static void main(String[] args) {
		int n=10;
		
		solution(n);
	}
	
	public static String solution(int n) {
		String answer="";
		String[] number= {"4","1","2"};
		
		while(n>0) {
			int index=n%3;
			n=n/3;
			
			if(index==0) n--;
			
			answer=number[index]+answer;
		}
		System.out.println(answer);
		return answer;
	}
}