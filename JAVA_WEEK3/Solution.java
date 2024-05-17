import java.util.function.Function;
class Solution {
	public static double solver(double a, double b,double e, Function<Double, Double> f) {
		if(f.apply(a)*f.apply(b)>0)
			return Double.NaN;
		else{
			double u = a, v = b;
			double c =(u+v)/2;
			while(Math.abs(f.apply(c)) > e) {
				if(f.apply(u)*f.apply(c) <= 0) 
					v = c;
				else
					u = c;
				c=(u+v)/2;
			} 
			return c;
		}
	}
    public static void main(String[] args) {
    	
		
	}
}