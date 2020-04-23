package concept;

import java.util.StringTokenizer;

public class StringTokenizer_test {

	public static void main(String[] args) {
		String aaa="안녕.나는.이이.라고해.";
		StringTokenizer str=new StringTokenizer(aaa,".");
		System.out.println(str.countTokens());
		for (int i = 0; i < str.countTokens(); i++) {
			System.out.println(str.countTokens()+":next하기전");
			System.out.println(str.nextToken()+"==="+i); //nextToken()하면 줄어들어
			System.out.println(str.countTokens()+":next한 후");
		}
		System.out.println("=============");
		
		int cnt=str.countTokens();
		System.out.println(cnt);
		for(int i=0;i<cnt;i++) {
			String token=str.nextToken();
			System.out.println(token);
		}
		System.out.println("---------");
		String bbb="안녕.나는.이이.라고해.";
		StringTokenizer str1=new StringTokenizer(bbb,".");
		int count=str1.countTokens();
		for(int i=0;i<count;i++) {
			String token=str1.nextToken();
			System.out.println(token);
		}
		System.out.println("=================");
		String ccc="안녕.나는.이이.라고해.";
		StringTokenizer str2=new StringTokenizer(ccc,".");
		while(str2.hasMoreTokens()) {
			System.out.println(str2.nextToken());
		}
		
	}

}
