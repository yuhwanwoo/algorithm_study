package programmers_lev02;

import java.util.Arrays;
import java.util.Comparator;

// https://programmers.co.kr/learn/courses/30/lessons/17686
// 프로그래머스 17686 [3차] 파일명 정렬
// 풀이 https://javaplant.tistory.com/12

public class SortString {

	public static void main(String[] args) {
		String[] files= {"img12.png", "img10.png", "img02.png", "img1.png", "IMG01.GIF", "img2.JPG"};
		
		solution(files);
		
	}
	
	public static String[] solution(String[] files) {
        String[] answer = {};
        answer=sort(files);
       
        for(String c:answer) {
        	System.out.println(c);
        }
        return answer;
    }
    
	public static String[] sort(String[] input) {
		Arrays.sort(input,new Comparator<String>(){

			@Override
			public int compare(String o1, String o2) {
				String head1=o1.split("[0-9]")[0];
				o1=o1.replace(head1, "");
				head1=head1.toUpperCase();
				
				String num="";
				for(char c:o1.toCharArray()) {
					if(Character.isDigit(c)) {
						num=num+c;
					}else {
						break;
					}
				}
				int num1=Integer.parseInt(num);
				
				String head2=o2.split("[0-9]")[0];
				o2=o2.replace(head2, "");
				head2=head2.toUpperCase();
				
				num="";
				for(char c:o2.toCharArray()) {
					if(Character.isDigit(c)) {
						num=num+c;
					}else {
						break;
					}
				}
				int num2=Integer.parseInt(num);
				return head1.equals(head2) ? num1-num2 : head1.compareTo(head2);
			}
			
		});
		return input;
	}
	/*public static String[] sort(String[] input) {
	    Arrays.sort(input, new Comparator<String>() {
	        @Override
	        public int compare(String s1, String s2) {
	            // 첫번째 오브젝트 head, num 추출
	            String head1 = s1.split("[0-9]")[0];
	            s1 = s1.replace(head1, "");
	            head1 = head1.toUpperCase();
	            
	            String tempNum = "";
	            for(char c : s1.toCharArray()) {
	                if(Character.isDigit(c) && tempNum.length() < 5) {
	                    tempNum += c;
	                } else {
	                    break;
	                }
	            }
	            int num1 = Integer.parseInt(tempNum);
	            
	            // 두번째 오브젝트 head, num 추출
	            String head2 = s2.split("[0-9]")[0];
	            s2 = s2.replace(head2, "");
	            head2 = head2.toUpperCase();
	            
	            tempNum = "";
	            for(char c : s2.toCharArray()) {
	                if(Character.isDigit(c) && tempNum.length() < 5) {
	                    tempNum += c;
	                } else {
	                    break;
	                }
	            }
	            int num2 = Integer.parseInt(tempNum);
	           
	            // 비교 처리
	            return head1.equals(head2) ? num1 - num2 : head1.compareTo(head2); 
	        }
	    });
	    
	    return input;
	}*/

}
