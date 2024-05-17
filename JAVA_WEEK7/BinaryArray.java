import java.util.*;
public class BinaryArray{
	public static int binary(int n){
		int s = 0, sodu;
		while(n!=0){
			sodu = n % 2;
			n/=2;
			s = s*10 + sodu;
		}
		return s;
	}
	public static int reverse(int n){
		int result = binary(n);
		int rev = 0;
		int tmp = result;
		while(result != 0){
			rev = rev*10 + result%10;
			result/=10;
		}
		return rev;
			
	}
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.print(reverse(n));
	}
}