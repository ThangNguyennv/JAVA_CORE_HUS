public class Triangle1
{
    public static boolean isTriangle(double x1, double y1, double x2, double y2, double x3, double y3){
       double AB = Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1));
	   double AC = Math.sqrt((x3-x1)*(x3-x1)+(y3-y1)*(y3-y1));
	   double BC = Math.sqrt((x3-x2)*(x3-x2)+(y3-y2)*(y3-y2));
	if(AB+AC>BC || AB+BC>AC || AC+BC>AB) return true;
	else return false;
    }
	public static double getArea(double x1, double y1, double x2, double y2, double x3, double y3){
		if(isTriangle(x1,y1,x2,y2,x3,y3)){
			double AB = Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1));
			double AC = Math.sqrt((x3-x1)*(x3-x1)+(y3-y1)*(y3-y1));
			double BC = Math.sqrt((x3-x2)*(x3-x2)+(y3-y2)*(y3-y2));
			double p = (AB+AC+BC)/2;
			double dientich = Math.sqrt(p*(p-AB)*(p-AC)*(p-BC));
			return dientich;
		}
		else 
			return 0.0;
		
	}
	public static void main(String[] args){
		
}