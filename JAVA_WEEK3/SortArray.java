import java.util.*;
public class SortArray{
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int a[] = new int[N];
		for(int i = 0; i < N; i++){
			a[i] = sc.nextInt();
		}
		Arrays.sort(a);
		for(int i = 0; i < a.length; i++){
			System.out.print(a[i] + " ");
		}
	
	}
}