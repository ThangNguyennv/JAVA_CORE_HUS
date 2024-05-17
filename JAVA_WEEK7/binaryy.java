import java.util.*;
public class binaryy{
	public static void binary(int n){
		if(n < 2)
			System.out.print(n);
		else{
			binary(n/2);
			System.out.print(n%2);
		}
	}
	
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		binary(n);
	}
}