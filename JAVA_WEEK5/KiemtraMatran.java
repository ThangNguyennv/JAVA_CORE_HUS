import java.util.*;
public class KiemtraMatran{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[][] = new int[n][n];
		for(int i = 0; i < n;i++){
			for(int j = 0; j < n; j++){
				a[i][j] = sc.nextInt();
			}
		}
		int ok = 1;
		for(int i = 0; i < n; i++){
			for(int j = 0; j < n; j++){
				for(int k = 1; k <= n*n; k++){
					if(a[i][j] != k){
						ok = 0;
						break;
					}	
				}
				if(ok==0){
					System.out.print("NO");
						break;
				}
				else{
					System.out.print("YES");
					break;
				}
			}
		}
	}
}