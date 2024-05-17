/**
 * Chương trình nhập một số nguyên n và mảng gồm n số nguyên
 * sau đó in ra giá trị nhỏ nhất và lớn nhất của mảng trên cùng dòng, 
 * cách nhau bởi một khoảng trống. Cần giữ khung chương trình.
 * */
//import <libraries needed here>
import java.util.*;
public class FindMinMax{
    
    public static int findMin(int Array[]){
		int min = Array[0];
        for(int i = 0; i < Array.length; i++){
			if(Array[i]<min)
				min = Array[i];
		}
		return min;
    }
    
    public static int findMax(int Array[]){
		int max = Array[0];
        for(int i = 0; i < Array.length; i++){
			if(Array[i]>max)
				max = Array[i];
		}
		return max;
    }
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n];
		for(int i = 0; i < n; i++){
			a[i] = sc.nextInt();
		}
		System.out.print(findMin(a) + " ");
		System.out.print(findMax(a));
    }
    
}