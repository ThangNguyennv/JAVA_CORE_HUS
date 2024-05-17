import java.util.*;
public class Tinh_hamso{
	public static double F(double x, int n){
		double fx = 4*x*x*x*sin5x(x,n) + 3*x*x*sin5x(x,n) - 6*x + 8;
		return fx;
	}
	public static double sin5x(double x, int n){
		double sin = 5*x;
		double Sk = 5*x;
		for(int k = 1; k <= n; k++){
			Sk = (Sk*(-1)*5*x*5*x)/((2*k+1)*(2*k)); 
			sin = sin + Sk;
		}
		return sin;
	}
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		double x = sc.nextDouble();
		int n = sc.nextInt();
		System.out.print(sin5x(x,n));
		System.out.println();
		System.out.print(F(x,n));
	}
}
