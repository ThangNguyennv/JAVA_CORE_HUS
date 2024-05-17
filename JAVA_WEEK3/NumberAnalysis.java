import java.util.*;
public class NumberAnalysis{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i = 2; i <= Math.sqrt(n); i++){
			while(n%i==0){
				System.out.print(i);
				n/=i;
				if(n!=1)
					System.out.print(" ");
			}
		}
		if(n!=1)
				System.out.print(n);
	}
}