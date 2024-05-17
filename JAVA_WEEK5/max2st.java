import java.util.*;
public class max2st{
public static int max2nd(int a[]){
		int max = a[0];
		for(int i = 1; i < a.length; i++){
			if(a[i]>max)
				max = a[i];
		}
		int max2 = 0;
		for(int i = 0; i < a.length; i++){
			if(max>a[i])
				max2 = a[i];
			break;
		}
		for(int i = 1; i < a.length; i++){
			if(a[i] > max2 && a[i] < max)
				max2 = a[i];
		}
		return max2;
	}
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int a[] = new int[m];
		for(int i = 0; i < m; i++){
			a[i] = sc.nextInt();
		}
		System.out.print(max2nd(a));
	}
}