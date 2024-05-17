public class MovementTime{
	public static void main(String[] args){
	double S = Double.parseDouble(args[0]);
	double v0 = Double.parseDouble(args[1]);
	double a = Double.parseDouble(args[2]);
	double denta = 4*v0*v0 + 8*a*S;
	if(S>0 && v0>0 && a>0 ){
		double t1=(-2*v0 + Math.sqrt(denta))/(2*a);
		double t2=(-2*v0 - Math.sqrt(denta))/(2*a);
		if(t1>0){
			System.out.println(Math.round(t1*100.0)/100.0);
		}
		if(t2>0){
			System.out.println(Math.round(t2*100.0)/100.0);
		}
	}
	else {
	System.out.println("-1");
	}
}
}
