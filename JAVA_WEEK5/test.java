import java.util.*;
public class test{
	public static void check(int a[]){
		int cnt = 0;
		for(int i = 0; i < a.length-1; i++){
			if(a[i] == a[i+1])
				cnt++;
		}
		System.out.print(cnt);
	}
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n];
		for(int i = 0; i < n; i++){
			a[i] = sc.nextInt();
		}
		for(int i = 0; i < n; i++){
			System.out.print(a[i] + " ");
			check(a);
			System.out.println();
		}
	}
}