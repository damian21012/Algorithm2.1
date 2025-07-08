import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Main {
	static int N;
	static int num[];
	static int operstor[] = new int[4];
	static int MAX = Integer.MIN_VALUE;  // !=0 마이너스 고려
	static int MIN = Integer.MAX_VALUE;
	
	public static void main(String[] args) throws NumberFormatException, IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		num = new int[N];
		
		//숫자 받기
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		for(int i=0; i<N; i++) {
			num[i] = Integer.parseInt(st.nextToken());
		}
		//연산자 받기
		st = new StringTokenizer(br.readLine(), " ");
		for(int i=0; i<4; i++) {
			operstor[i] = Integer.parseInt(st.nextToken());
		}
		
		Backtracking(num[0], 1);
		System.out.println(MAX);
		System.out.println(MIN);
	}
	private static void Backtracking(int now, int index) {
		if(index == N) {
			MAX = Math.max(MAX, now);
			MIN = Math.min(MIN, now);
			return;
		}
		//+선택
		if(operstor[0]>0) {
			operstor[0]--; //하나씀
			Backtracking(now+num[index], index+1); 
			operstor[0]++; //사용하지 않았을때
		}
		//-선택
		if(operstor[1]>0) {
			operstor[1]--; //하나씀
			Backtracking(now-num[index], index+1); 
			operstor[1]++; //사용하지 않았을때
		}
		//*선택
		if(operstor[2]>0) {
			operstor[2]--; //하나씀
			Backtracking(now*num[index], index+1); 
			operstor[2]++; //사용하지 않았을때
		}
		// 나누기
		if(operstor[3]>0) {
			operstor[3]--; //하나씀
			Backtracking(now/num[index], index+1); 
			operstor[3]++; //사용하지 않았을때
		}
	}
}
