public class ConvertUnit2{
	public static void main(String[] args){
	double x = Double.parseDouble(args[0]);
	double y = (x*1000)/1609;
	System.out.printf("%.2f \n", y);
	}
}