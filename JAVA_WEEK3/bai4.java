import java.util.*;

public class bai4{
	public static boolean isPrime(int k){
		if(k<2) return false;
		for(int i = 2; i <= Math.sqrt(k); i++){
			if(k%i==0)
				return false;
		}
		return true;
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int i = 2;
		int dem = 0;
	while(true){
		if(isPrime(i)==true){
			dem++;
			System.out.print(i + " ");
		}
		i++;
		if(dem==n)
			break;
		}
	}
}