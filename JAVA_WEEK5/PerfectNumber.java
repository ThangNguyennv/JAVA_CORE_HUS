import java.util.*;
public class PerfectNumber{
	public static boolean isPerfect(int n){
		int sum = 1;
		for(int i = 2; i <= Math.sqrt(n); i++){
			if(n%i==0){
				sum+=i+n/i;
			}
		}
		return sum==n;
	}
	public static void main(String[] args){
		
	}
}