public class DivideByZero{
	public static void main(String[] args){
		int a = Integer.parseInt(args[0]);
		double b = Double.parseDouble(args[1]);
		System.out.println(a/0);
		System.out.println(b/0);
	}
}