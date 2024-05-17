import java.util.*;
public class AddMatrix{
	public static void congmatran(int a[][], int b[][], int m, int n){
		int c[][] = new int[m][n];
		for(int i = 0; i < m; i++){
			for(int j = 0; j < n; j++){
				c[i][j] = 2*a[i][j] + 3*b[i][j];
			}
		}
		for(int i = 0; i < m; i++){
			for(int j = 0; j < n; j++){
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
		int b[][] = new int [m][n];
		for(int i = 0; i < m; i++){
			for(int j = 0; j < n; j++){
				a[i][j] = sc.nextInt();
			}
		}
		for(int i = 0; i < m; i++){
			for(int j = 0; j < n; j++){
				b[i][j] = sc.nextInt();
			}
		}
		congmatran(a,b,m,n);
		
	}
}