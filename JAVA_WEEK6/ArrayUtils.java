import java.util.*;

public class ArrayUtils{

    public static int[] readArray(Scanner reader){
        int n = reader.nextInt();
		int a[] = new int[n];
		for(int i = 0; i < n; i++){
			a[i] = reader.nextInt();
		}
        return a;
    }

    public static boolean isEvenArithmetic(int[] arr){
		int d = arr[1]-arr[0];
        for(int i = 2; i < arr.length; i++){
			if(d % 2 != 0)
				return false;
			else{
				if(arr[i]-arr[i-1]!=d)
					return false;
			}
		}
        return true; 
    }
	
	public static boolean soDoiXung(int n){
		int tmp = n;
		int rev = 0;
		while(n!=0){
			rev = rev*10+n%10;
			n/=10;
		}
		if(rev==tmp) return true;
		return false;
	}
	
    public static int countPalindromeNumbers(int[] arr){
        int count = 0;
		for(int i = 0; i < arr.length; i++)
			if(soDoiXung(arr[i]) == true)
				count++;
		return count;
    }
	
	public static int findSecond(int a[]){
		int max = a[0];
		for(int i = 0; i < a.length; i++)
			if(a[i] > max)
				max = a[i];
		int max2 = a[0];
		if(max2==max) max2= a[1];
		for(int i = 0; i < a.length; i++)
			if(a[i]<max && a[i]>max2)
				max2=a[i];
		return max2;
	}
	
    public static void analysis2ndMax(int[] arr){
		int n = findSecond(arr);
		for(int i = 2; i <= Math.sqrt(n); i++){
			while(n % i == 0){
				System.out.print(i + "");
				n/=i;
			
				
			}
		}
		if(n != 1)
			System.out.print(n+" ");
    } 
	
	public static int[] findLongestSequence(int[] arr) {
        int start0 = 0;
		int start1 = 0;
		int length0 = 1;
		int length1 = 1;
		for(int i = 1; i < arr.length; i++){
			if(arr[i] > arr[i-1])
				length0++;
			else{
				if(length0>length1 || (length0==length1 && start0 < start1)){
					length1 = length0;
					start1 = start0;
				}
				start0=i;
				length0=1;
			}
		}
		if(length0>length1){
			start1=start0;
		}
		int [] result = new int [length1];
		for(int i = 0; i < length1; i++){
			result[i] = arr[start1+i];
		}
		return result;
    }
    
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		int a[] = readArray(sc);
		if(isEvenArithmetic(a)==true)
			System.out.println("true");
		else
			System.out.println("false");
		
		if(countPalindromeNumbers(a)==0)
			System.out.println("0");
		else
			System.out.println(countPalindromeNumbers(a));
		
		if(findSecond(a)<2)
			System.out.println("NONE");
		else{
			analysis2ndMax(a);
			System.out.println();
		}
		int c[] = findLongestSequence(a);
		for(int i = 0; i < c.length; i++){
			System.out.print(c[i] + " ");
		}
		
		
		
	}
    
}
