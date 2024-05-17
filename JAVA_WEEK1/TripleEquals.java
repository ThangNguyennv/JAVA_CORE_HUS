public class TripleEquals{
	public static void main(String[] args){
	String a = args[0];
	String b = args[1];
	String c = args[2];
	boolean ok1 = a.equals(b);
	boolean ok2 = b.equals(c);
	boolean ok3 = true;
	if(ok1 == ok3 && ok2 == ok3){
	System.out.println("true");
	}
	else{
	System.out.println("false");
	}
	
}
}