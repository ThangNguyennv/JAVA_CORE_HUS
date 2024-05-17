
import java.util.Scanner;

public class SuperPrime{
    
    public static boolean isPrime(int k){
        if(k<2) return false;
		for(int i = 2; i <= Math.sqrt(k); i++){
			if(k%i==0) return false;
		}
		return true;
    }
    public static boolean isSuperPrime(int n){
		if(n==0) {
			return false;
		}
		while(n!=0){
			if(isPrime(n)==false){
				return false;
			}
			n/=10;
		}
		return true;
}
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if(isSuperPrime(n)==true)
			System.out.println("true");
		else 
			System.out.println("false");
    }
    }
