import java.util.*;
public class NPerfects{
	public static boolean isPerfect(long n){
		long sum = 1;
		for(long i = 2; i <= Math.sqrt(n); i++){
			if(n%i==0){
				sum+=i+n/i;
			}
		}
		return sum==n;
	}
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		for(long i = 6; i < n; i++){
			if(isPerfect(i)==true)
				System.out.print(i + " ");
		}
	}
}