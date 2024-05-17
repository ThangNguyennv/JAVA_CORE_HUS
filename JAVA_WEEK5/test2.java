import java.util.*;
public class test2{
	public static void cotdautien(int a[][]){
		for(int i = 0; i < a.length; i++){
			for(int j = 0; j < a[0].length; j++){
				
				System.out.print(a[i][j] + " ");
				break;
			}
		}
	}
	public static void cotcuoicung(int a[][]){
		for(int i = 0; i < a.length; i++){
			for(int j = a[0].length-1; j >= 0; j--){
				System.out.print(a[i][j] + " ");
				break;
			}
		}
	}
	public static boolean sohoanhao(int n){
		int sum = 1;
		if(n==1) return false;
		for(int i = 2; i <= Math.sqrt(n); i++){
			if(n%i==0){
				sum+=i+n/i;
			}
		}
		return sum==n;
	}
	public static void check3(int a[][]){
		int min = 8128;
		int ok = 1;
		for(int i = 0; i < a.length; i++){
			for(int j = 0; j < a[0].length; j++){
				if(sohoanhao(a[i][j]) == true){
					
					System.out.print(a[i][j] + " ");
				}
			}
		}
		
	}
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[][] = new int[n][n];
		for(int i = 0; i < n; i++){
			for(int j = 0; j < n; j++){
				a[i][j] = sc.nextInt();
			}
		}
		check3(a);
		
	}
}