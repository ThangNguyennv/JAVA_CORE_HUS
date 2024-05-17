public class NumberProps{
	public static boolean isPrime(int k){
	if(k<2) return false;
	for(int i = 2; i <= Math.sqrt(k); i++){
		if(k%i==0) return false;
	}
	return true;
	}
}