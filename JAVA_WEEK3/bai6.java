import java.util.*;
public class bai6{
	public static boolean isPalindrome(int k){
		int tmp=0;
		int rev = k;
		while(k!=0){
			tmp = tmp*10+k%10;
			k/=10;
		}
		if(tmp==rev) return true;
		else return false;
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int n = sc.nextInt();
	for(int i = m + 1; i < n;i++){
		if(isPalindrome(i))
			System.out.print(i + " ");
	}
	}
}