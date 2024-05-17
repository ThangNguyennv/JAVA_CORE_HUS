import java.util.*;
public class TransPose{
	public static void chuyenvi(int a[][], int m, int n){
		int b[][] = new int[n][m];
		for(int i = 0; i < m; i++){
			for(int j = 0; j < n; j++){
				b[j][i] = a[i][j];
			}
		}
		for(int i = 0; i < b.length; i++){
			for(int j = 0; j < b[0].length; j++){
				System.out.print(b[i][j] + " ");
			}
			System.out.println();
		}
	}
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int n = sc.nextInt();
		int a[][] = new int[m][n];
		for(int i = 0; i < m; i++){
			for(int j = 0; j < n; j++){
				a[i][j] = sc.nextInt();
			}
		}
		chuyenvi(a,m,n);
	}
}