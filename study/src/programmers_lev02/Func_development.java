package programmers_lev02;

import java.util.ArrayList;
import java.util.HashMap;


// https://programmers.co.kr/learn/courses/30/lessons/42586
// ���α׷��ӽ� 42586 ��ɰ���
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
		ArrayList<Integer> day = new ArrayList<>();
		for (int i = 0; i < progresses.length; i++) {
			ans[i] = ((int) Math.ceil((100 - progresses[i]) / (float) speeds[i]));
		}
		day.add(ans[0]);
		for (int i = 1; i < ans.length; i++) {
			if (ans[0] < ans[i]) {
				day.add(ans[i]);
			}
		}
		HashMap<Integer, Integer> map = new HashMap<>();
		for (int j = 0; j < day.size(); j++) {
			for (int i = 0; i < ans.length; i++) {
				if(ans[i]<=day.get(j)) {
					map.put(day.get(j), map.getOrDefault(day.get(j),0)+1);
					ans[i]=200;
				}
			}
		}
		answer=new int[day.size()];
		for(int i=0;i<day.size();i++) {
			answer[i]=map.get(day.get(i));
		}
		return answer;
	}
}