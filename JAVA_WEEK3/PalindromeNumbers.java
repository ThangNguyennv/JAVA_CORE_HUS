import java.util.*;
public class  PalindromeNumbers{
	public static boolean isPalindrome(int k){
		int tmp = k;
		int rev = 0;
		while(k!=0){
		rev = rev*10+k%10;
		k/=10;
		}
		if(rev==tmp) return true;
		return false;
	}
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		int M = sc.nextInt();
		int N = sc.nextInt();
		if(M<N){
			for(int i = M; i <= N; i++){
			if(isPalindrome(i)==true)
				System.out.print(i + " ");
			}
			System.out.print("\n");
		}
		else{
			for(int i = N; i <= M; i++){
			if(isPalindrome(i)==true)
				System.out.print(i + " ");
			}
			System.out.print("\n");
		}
	}	
}
