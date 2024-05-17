import java.util.*;
public class DayTang{
	
	public static boolean check(int a[]){
		
		for(int i = 0; i < a.length-1; i++){
			if(a[i+1] <= a[i]) return false;
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
		if(check(a)==true)
			System.out.println("YES");
		else
			System.out.println("NO");
	}
}