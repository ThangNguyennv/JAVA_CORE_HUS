public class Divisibility{
	public static void main(String[] args){
	int x = Integer.parseInt(args[0]);
	int y = Integer.parseInt(args[1]);
	if(x % 7 == 0 && y % 7 == 0){
	System.out.println("true");
	}
	else {
	System.out.println("false");
	}
	}
}