
public class Exp{
	public static double dblExp(double x, int n){
		double e = 1.0;
		double Sk = 1.0;
		for(int k = 1; k <= n; k++){
			Sk = (Sk*x)/k;
			e = e + Sk;
		}
		return e;
	}
	public static void main(String [] args){
		
		double x = Double.parseDouble(args[0]);
		int n = Integer.parseInt(args[1]);
		double kq = dblExp(x,n);
		System.out.println(Math.round(kq*1000.0)/1000.0);;
	}
}