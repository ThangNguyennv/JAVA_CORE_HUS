public class Triangle
{
    public static boolean isTriangle(double x1, double y1, double x2, double y2, double x3, double y3)
    {
       double AB = Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1));
	   double AC = Math.sqrt((x3-x1)*(x3-x1)+(y3-y1)*(y3-y1));
	   double BC = Math.sqrt((x3-x2)*(x3-x2)+(y3-y2)*(y3-y2));
	if((AB+AC)>BC && (AB+BC)>AC && (AC+BC)>AB) return true;
	else return false;
    }
    public static boolean isRightTriangle(double x1, double y1, double x2, double y2, double x3, double y3)
    {
		double tvh1= (x2-x1)*(x3-x1)+(y2-y1)*(y3-y1);
		double tvh2 = (x2-x1)*(x3-x2)+(y2-y1)*(y3-y2);
		double tvh3 = (x3-x1)*(x3-x2)+(y3-y1)*(y3-y2);
		if(tvh1==0 || tvh2 == 0 || tvh3 == 0) return true;
		else return false;
    }
    public static void main(String [] args)
    {
        double x1 = Double.parseDouble(args[0]);
		double y1 = Double.parseDouble(args[1]);
		double x2 = Double.parseDouble(args[2]);
		double y2 = Double.parseDouble(args[3]);
		double x3 = Double.parseDouble(args[4]);
		double y3 = Double.parseDouble(args[5]);
		System.out.println(isTriangle(x1,y1,x2,y2,x3,y3));
		System.out.println(isRightTriangle(x1,y1,x2,y2,x3,y3));
		
    }
}