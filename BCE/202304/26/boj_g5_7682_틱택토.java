package a20230426;

import java.io.*;

// 왜 계속 10%에서 틀리지? : winX, winO 체크하는 데서 break 걸어서 빙고 검사가 제대로 안 됐다...
public class boj_g5_7682_틱택토 {
	
	static String VALID = "valid";
	static String INVALID = "invalid";
	static int cntX, cntO;
	static char[][] arr = new char[3][3];
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String board = "";
		while(true) {
			cntX = 0;
			cntO = 0;
			boolean winX = false;
			boolean winO = false;
			board = br.readLine();
			if(board.equals("end")) {
				break;
			}
			for (int i = 0; i < 9; i++) {
				int r = i/3;
				int c = i%3;
				arr[r][c] = board.charAt(i);
				if(arr[r][c] == 'X') {
					cntX++;
				} else if(arr[r][c] == 'O') {
					cntO++;
				}
				
			}
			for (int j = 0; j < 3; j++) {
				if((arr[0][j] == arr[1][j] && arr[1][j] == arr[2][j])) {
					if(arr[0][j] == 'X') {
						winX = true;
					} else if(arr[0][j] == 'O') {
						winO = true;
					}
				} 
				if((arr[j][0] == arr[j][1] && arr[j][1] == arr[j][2])) {
					if(arr[j][0] == 'X') {
						winX = true;
					} else if(arr[j][0] == 'O') {
						winO = true;
					}					
				}
			}
			if((arr[0][0] == arr[1][1] && arr[1][1] == arr[2][2]) || (arr[2][0] == arr[1][1] && arr[1][1] == arr[0][2])) {
				if(arr[1][1] == 'X') {
					winX = true;
				} else if(arr[1][1] == 'O') {
					winO = true;
				}
			}
			if((winX && !winO && (cntO == cntX-1)) || (!winX && winO && cntO == cntX) || (!winX && !winO && cntO == 4 && cntX == 5)) {
				sb.append(VALID).append("\n");
			} else {
				sb.append(INVALID).append("\n");
			}
		}
		br.close();
		System.out.println(sb.toString());
	}
}

// X와 O가 둘 다 빙고인 경우에 invalid로 나와야 합니다!
// O가 완성되었는데 X가 또 놨다는 게 말이 안 되는구나
//  게임판이 가득 차도 게임은 끝난다.
