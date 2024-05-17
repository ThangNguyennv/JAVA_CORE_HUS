public class Distance{
	public static void main(String[] args){
	int x1 = Integer.parseInt(args[0]);
	int y1 = Integer.parseInt(args[1]);
	int x2 = Integer.parseInt(args[2]);
	int y2 = Integer.parseInt(args[3]);
	double kc = Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1));
	System.out.println(Math.round(kc*100.0)/100.0);
	
}
}