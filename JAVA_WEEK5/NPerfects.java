import java.util.*;
public class NPerfects{
	public static boolean isPerfect(int n){
		int sum = 1;
		for(int i = 2; i <= Math.sqrt(n); i++){
			if(n%i==0){
				sum+=i+n/i;
			}
		}
		return sum==n;
	}
	public static void printNPerfect(int n){
		for(int i = 6; i < n; i++){
			if(isPerfect(i)==true)
				System.out.print(i + " ");
		}
	}
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		printNPerfect(n);
	}
}