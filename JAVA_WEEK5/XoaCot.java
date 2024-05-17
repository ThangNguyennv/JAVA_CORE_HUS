import java.util.*;
public class XoaCot{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int n = sc.nextInt();
		int k = sc.nextInt();
		int a[][] = new int[m][n];
		for(int i = 0; i < m; i++){
			for(int j = 0; j < n; j++){
				a[i][j] = sc.nextInt();
			}
		}
		for(int i = 0; i < m; i++){
			for(int j = 0; j < k; j++){
				System.out.print(a[i][j] + " ");
			}
			for(int j = k+1; j < n; j++){
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
		
		
		
	}
}