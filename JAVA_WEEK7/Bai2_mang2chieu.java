
import java.util.Scanner;

public class  Bai2_mang2chieu {
	
	public static int[][] inputMatrix(Scanner reader){
	
		int n = reader.nextInt();
		int a[][] = new int[n][n];
		for(int i = 0; i < n;i++)
			for(int j = 0; j < n; j++)
				a[i][j] = reader.nextInt();
		return a;
	}
	
	public static boolean isUpperTriangle (int[][] arr) {
		for(int i = arr.length-1; i >= 1; i--){
			for(int j = i-1; j >= 0; j--){
				if(arr[i][j] != 0)
					return false;
			}
		}
		return true;
	}

	public static int[] findRows(int[][] arr){
		int minArray[] = new int [arr[0].length];
		for(int i = 0; i < arr.length; i++){
			int max = arr[i][0];			
			for(int j = 0; j < arr[0].length; j++){
				if(arr[i][j] > max)
					max = arr[i][j];
			}
			minArray[i] = max;
		}
		int min = minArray[0];
		for(int i = 0; i < minArray.length; i++){
			if(minArray[i] < min)
				min = minArray[i];
		}
		int cnt = 0;
		for(int i = 0; i < minArray.length; i++){
			if(minArray[i] == min)
				cnt++;
		}
		int result [] = new int[cnt];
		int k = 0; 
			for(int i = 0; i < minArray.length; i++){
				if(minArray[i] == min){
					result[k]= i;
					k++;
				}
					
			}
        
		return result;
	}
	
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		int a[][] = inputMatrix(sc);
		if(isUpperTriangle(a)==true)
			System.out.print("true");
		else
			System.out.print("false");
	
	}

}



