
public class Palindrome{
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
		int N = Integer.parseInt(args[0]);
		if(isPalindrome(N)==true)
			System.out.println("true");
		else
			System.out.println("false");
	}
}