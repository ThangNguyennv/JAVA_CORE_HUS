public class RightTriangle{
	public static boolean isTriangle(double a, double b, double c){
		if(a>0 && b>0 && c >0 && (a+b>c || a+c>b || b+c>a)) return true;
		else return false;
	}
	public static boolean isRightTriangle(double a, double b, double c){
		if(a>0 && b>0 && c >0 && (a*a+b*b==c*c || a*a+c*c==b*b || b*b+c*c==a*a)) return true;
		else return false;
	}
	public static void main(String[] args){
		double a = Double.parseDouble(args[0]);
		double b = Double.parseDouble(args[1]);
		double c = Double.parseDouble(args[2]);
		if(isTriangle(a,b,c))
			System.out.println("true");
		else 
			System.out.println("false");
		if(isRightTriangle(a,b,c))
			System.out.println("true");
		else
			System.out.println("false");
	}
}