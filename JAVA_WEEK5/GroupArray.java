import java.util.*;
public class GroupArray{
    public static void check(int a[]){
		for(int i = 0; i < a.length; i++){
			if(a[i]%2==1) 
				System.out.print(a[i] + " ");
		}
		for(int i = 0; i < a.length; i++){
			if(a[i]%2==0)
				System.out.print(a[i] + " ");
		}
	}
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n];
		for(int i = 0; i < n; i++){
			a[i] = sc.nextInt();
		}
		check(a);
    }
}