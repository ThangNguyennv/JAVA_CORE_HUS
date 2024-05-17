import java.util.*;
public class bai5{
	
	public static boolean isPerfectNumber(int k){
		long sum = 1;
		if(k<2) return false;
		for(int i = 2; i <= Math.sqrt(k); i++){
			if(k%i==0){
				sum=sum+i+(k/i);
			}
		}
		if(sum==k) return true;
		else return false;
		
	}
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int i = 6;
		int cnt = 0;
		while(true){
			if(isPerfectNumber(i)==true){
				cnt++;
				System.out.print(i + " ");
			}
			i++;
			if(cnt==n)
				break;
		}
	
	}
}