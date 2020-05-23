package midas_codingTest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class Exam01 {

	public static void main(String[] args) {
		
		
		String[] strs= {"a","b","c"};
		
		solution(strs);
	}
	
	public static String solution(String[] strs) {
		String answer = "";
		
		HashMap<String, Integer> hash=new HashMap<>();
		ArrayList<String> arr=new ArrayList<>();
		
		for(int i=0;i<strs.length;i++) {
			String[] pro;
			pro=strs[i].split("");
			for(String data:pro) {
				if(!arr.contains(data))
					arr.add(data);
			}
			for(int j=0;j<arr.size();j++) {
				hash.put(arr.get(j), hash.getOrDefault(arr.get(j), 0)+1);
			}
		}
		Iterator<String> keys = hash.keySet().iterator();
		String k=keys.next();
		
		for(String key:hash.keySet()) {
			
			String b=keys.next();
			
			if(hash.get(key)==hash.get(k)) {
				answer=answer+key;
			}else {
				break;
			}
		}
		
		if(answer.length()==1) {
			answer= "";
		}
		
		
		
		
		return answer;
	}

	
}
