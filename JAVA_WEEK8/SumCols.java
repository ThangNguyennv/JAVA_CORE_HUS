import java.util.*;
public class  SumCols{
	public static void tong1cot(int a[][],int m, int n){
		int b[][] = new int[n][m];
		for(int i = 0; i < m; i++){
			for(int j = 0; j < n; j++){
				b[j][i] = a[i][j];
			}
		}
		for(int i = 0; i < b.length; i++){
			int sum = 0;
			for(int j = 0; j < b[0].length; j++){
				sum+=b[i][j];
			}
			System.out.print(sum + " ");
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
		tong1cot(a,m,n);
		
	}
}