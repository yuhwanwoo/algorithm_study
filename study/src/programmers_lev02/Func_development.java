package programmers_lev02;

import java.util.ArrayList;
import java.util.HashMap;



// https://programmers.co.kr/learn/courses/30/lessons/42586
// 프로그래머스 42586 기능개발
public class Func_development {

	public static void main(String[] args) {
		/*int[] progresses = { 93, 30, 55 };
		int[] speeds = { 1, 30, 5 };*/
		int[] progresses= {93,30,55,20,10};
		int[] speeds= {1,30,5,20,30};

		solution(progresses, speeds);
	}

	public static int[] solution(int[] progresses, int[] speeds) {
		int[] answer = {};
		int[] ans = new int[progresses.length];
		ArrayList<Integer> arr=new ArrayList<>();
		for (int i = 0; i < progresses.length; i++) {
			ans[i] = ((int) Math.ceil((100 - progresses[i]) / (float) speeds[i]));
		}
		int da=ans[0];
		arr.add(da);
		for(int i=0;i<ans.length;i++) {
			if(ans[i]>da) {
				da=ans[i];
				arr.add(da);
				
			}else if(ans[i]<=da) {
				ans[i]=da;
		
			}
		}
	
		HashMap<Integer, Integer> hash=new HashMap<>();
		
		for(int i=0;i<ans.length;i++) {
			hash.put(ans[i],hash.getOrDefault(ans[i], 0)+1 );
		}
		answer=new int[arr.size()];
		
		for(int i=0;i<arr.size();i++) {
			answer[i]=hash.get(arr.get(i));
		}
		return answer;
	}
}
