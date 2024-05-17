import java.util.*;
public class PrimesInArray{
	public static boolean check(int n){
		if(n<2) return false;
		for(int i = 2; i <= Math.sqrt(n); i++){
			if(n%i==0) return false;
		}
		return true;
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n];
		for(int i = 0; i < n; i++){
			a[i] = sc.nextInt();
		}
		for(int i = 0; i < a.length; i++){
			if(check(a[i]) == true)
				System.out.print(a[i] + " ");
		}
	}
}