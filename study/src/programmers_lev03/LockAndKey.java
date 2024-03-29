package programmers_lev03;

public class LockAndKey {

	public static void main(String[] args) {
		
		int[][] key= {{0, 0, 0}, {1, 0, 0}, {0, 1, 1}};
		int[][] lock= {{1, 1, 1}, {1, 1, 0}, {1, 0, 1}};
		
		solution(key,lock);
	}
	
	public static boolean solution(int[][] key,int[][] lock) {
		boolean answer=false;
		int n=key.length;
		int m=lock.length;
		int[][] extention_map=new int[m*3][m*3];
		
		for(int i=0;i<m;i++) {
			for(int j=0;j<m;j++) {
				extention_map[m+i][m+j]=lock[i][j];
			}
		}
		
		for(int cnt=0;cnt<4;cnt++) {
			key=rotation_key(key);
			for (int i = 0; i < lock.length*2; i++) {
				for (int j = 0; j < lock.length*2; j++) {
					for (int x = 0; x < key.length; x++) {
						for (int y = 0; y < key.length; y++) {
							extention_map[i+x][j+y]+=key[x][y];
						}
					}
					if(judge(extention_map)==true) {
						return true;
					}
					else {
						for (int x = 0; x < key.length; x++) {
							for (int y = 0; y < key.length; y++) {
								extention_map[i+x][j+y]-=key[x][y];
							}
						}
					}
				}
			}
		}
		
		/*for(int i=0;i<extention_map.length;i++) {
			for(int j=0;j<extention_map.length;j++) {
				System.out.print(extention_map[i][j]);
			}
			System.out.println();
		}*/
		return answer;
	}
	
	public static int[][] rotation_key(int[][] key){
		int[][] rot_key=new int[key.length][key.length];
		for (int i = 0; i < rot_key.length; i++) {
			for (int j = 0; j < rot_key.length; j++) {
				rot_key[j][key.length-i-1]=key[i][j];
			}
			
		}
		return rot_key;
	}
	
	public static boolean judge(int[][] map) {
		int lock_length=map.length/3;
		for (int i = lock_length; i < lock_length*2; i++) {
			for (int j = lock_length; j < lock_length*2; j++) {
				if (map[i][j]!=1) {
					return false;
				}
			}
		}
		return true;
	}
	
}
