public class ThreeSort{
	public static void main(String[] args){
	int a = Integer.parseInt(args[0]);
	int b = Integer.parseInt(args[1]);
	int c = Integer.parseInt(args[2]);
	int maximum = Math.max(Math.max(a,b),c);
	int minimum = Math.min(Math.min(a,b),c);
	int mid = (a+b+c)-maximum-minimum;
	System.out.println(minimum + " " + mid + " " + maximum);
}
}