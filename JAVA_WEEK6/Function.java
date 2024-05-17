import java.util.*;
public class Function{

    public static double sinh5x(double x, int n){ 
		double Sk = 5*x;
		double sin5x = 5*x;
        for(int k = 1; k <= n; k++){
			Sk = (Sk*5*x*5*x)/((2*k)*(2*k+1));
			sin5x = sin5x + Sk;
		}
        return sin5x; 
    }
	
	public static double f(double x, int n){ 
        double fx = x*x*x*sinh5x(x,n) - 9*x + 5;
        return fx; 
    }
    
    // in ra số thực t với phần thập phân lấy đến 4 chữ số, sau khi in có xuống dòng.
    public static void printRound4digs(double  t) {
        System.out.printf("%.4f",t);
		System.out.println();
    }
    public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		double x = sc.nextDouble();
		int n = sc.nextInt();
		printRound4digs(f(x,n));
		
	}
}