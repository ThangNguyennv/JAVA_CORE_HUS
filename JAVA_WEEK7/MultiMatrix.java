import java.util.*;
public class  MultiMatrix{
	public static void nhanmatran(int a[][], int b[][], int m, int n){
		int c[][] = new int[m][m];
		for(int i = 0; i < m; i++){
			for(int j = 0; j < m; j++){
				c[i][j] = 0;
				for(int k = 0; k < n; k++){
					c[i][j] += a[i][k] * b[k][j];
				}
			}
		}
		for(int i = 0; i < c.length; i++){
			for(int j = 0; j < c[0].length; j++){
				System.out.print(c[i][j] + " ");
			}
			System.out.println();
		}
		
	}
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int n = sc.nextInt();
		int a[][] = new int[m][n];
		int b[][] = new int [n][m];
		for(int i = 0; i < m; i++){
			for(int j = 0; j < n; j++){
				a[i][j] = sc.nextInt();
			}
		}
		for(int i = 0; i < n; i++){
			for(int j = 0; j < m; j++){
				b[i][j] = sc.nextInt();
			}
		}
		nhanmatran(a,b,m,n);
	}
}