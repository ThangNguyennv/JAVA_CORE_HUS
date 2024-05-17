public class Function {
		
	public static int sum(int[] a)
	{
		int sum = 0;
		for(int i = 0; i < a.length; i++){
			sum+=a[i];
		}
		return sum;
	}	
	
	public static int maxOdd(int[] a)
	{
		int tmp=-1;
		for(int i = 0; i < a.length; i++){
			if(a[i]%2==1){
				if(tmp != -1) 
					tmp = Math.max(tmp,a[i]);
				else
					tmp = a[i];
			}
		}
		return tmp;
	}
	
	public static int minEven (int[] a)
	{
		int rev = -1;
		for(int i = 0; i < a.length; i++){
			if(a[i]%2==0){
				if(rev != -1)
					rev = Math.min(rev,a[i]);
				else
					rev = a[i];
			}
		}
		return rev;
	}
		

	
	public static void main(String[] args) {
		int[] a = {1,2,3,4};
		System.out.println("Tong cac phan tu trong mang la: "+sum(a));
		
		System.out.println("So le lon nha la: "+maxOdd(a));
		
		System.out.println("So chan mho nha la: "+minEven(a));
		
		String s = "a123abcbsbasdcaac3ABCXaxddsa";
		
	
		
	}

}
