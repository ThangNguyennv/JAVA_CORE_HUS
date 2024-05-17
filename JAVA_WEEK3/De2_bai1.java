import java.util.*;
public class De2_bai1{
	public static double cos6x(double x, int n){
		double Sk = 1.0;
		double cos = 1.0;
		for(int k = 1; k <= n; k++){
			Sk = (Sk*(-1)*6*x*6*x)/(2*k*(2*k-1));
			cos = cos + Sk;
		}
		return cos;
	}
	public static double F(double x, int n){
		double fx = 7*x*x*x*cos6x(x,n)-5*x*x+13*x-2;
		return fx;
	}
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		double x = sc.nextDouble();
		int n = sc.nextInt();
		System.out.print(cos6x(x,n));
		System.out.println();
		System.out.print(F(x,n));
	}
}