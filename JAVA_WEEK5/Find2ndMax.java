import java.util.*;
public class Find2ndMax{
	public static int max2nd(int a[]){
		int max = a[0];
		for(int i = 1; i < a.length; i++){
			if(a[i]>max)
				max = a[i];
		}
		int max2 = a[0];
		if(max2==max) max2=a[1];
		for(int i = 0; i < a.length; i++){
			if(a[i] > max2 && a[i] < max)
				max2 = a[i];
		}
		return max2;
	}
	public static void inketqua(int A[][], int m, int n){
		int b[][] = new int[n][m];
		for(int i = 0; i < m; i++){
			for(int j = 0; j < n; j++){
				b[j][i]=A[i][j];
			}
		}
		for(int i = 0; i < b.length; i++){
			System.out.print(max2nd(b[i]) + " ");
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
		inketqua(a,m,n);
		
	}
}