public class TrigonometricFunctions{
	public static double sinx(double x, int n){
		double sin = x;
		double Sk = x;
		for(int k = 2; k <= n; k++){
			Sk = (Sk*(-1)*x*x)/((2*k-2)*(2*k-1));
			sin = sin + Sk;
		}
		return sin;
	}
	public static double cosx(double x, int n){
		double cos = 1.0;
		double Sk = 1.0/2;
		for(int k = 1; k <= n; k++){
			Sk = Math.pow(Sk,k)*(-1)*x*x/((2*k-1)*(2*k));
			cos = cos + Sk;
		}
		return cos;
	}
	public static void main(String [] args){
		double x = Double.parseDouble(args[0]);
		int n = Integer.parseInt(args[1]);
		x = (x/180.0)*Math.PI;
		double sn = sinx(x,n);
		double sm = cosx(x,n);
		System.out.printf("sin(%.4f) = %.4f",x,sn);
		System.out.println();
		System.out.printf("cos(%.4f) = %.4f",x,sm);
	}
}