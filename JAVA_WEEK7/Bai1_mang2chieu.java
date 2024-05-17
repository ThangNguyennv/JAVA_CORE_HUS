
import java.util.Scanner;

public class  Bai1_mang2chieu {
	
	public static int[][] inputMatrix(Scanner reader){
	
		int n = reader.nextInt();
		int a[][] = new int[n][n];
		for(int i = 0; i < n;i++)
			for(int j = 0; j < n; j++)
				a[i][j] = reader.nextInt();
		return a;
	}
	
	public static boolean isDiagDominant (int[][] arr) {
		for(int i = 0; i < arr.length-1; i++){
			for(int j = i+1; j < arr[0].length; j++){
				if(arr[i][j] != 0)
					return false;
			}
		}
		return true;
	}
		
	public static int[] findColumns(int[][] arr){
		int maxArray[] = new int [arr[0].length];
		for(int j = 0; j < arr[0].length; j++){
			int min = arr[j][0];			
			for(int i = 0; i < arr.length; i++){
				if(arr[i][j] < min)
					min = arr[i][j];
			}
			maxArray[j] = min;
		}
		int max = maxArray[0];
		for(int i = 0; i < maxArray.length; i++){
			if(maxArray[i] > max)
				max = maxArray[i];
		}
		int cnt = 0;
		for(int i = 0; i < maxArray.length; i++){
			if(maxArray[i] == max)
				cnt++;
		}
		int result [] = new int[cnt];
		int k = 0; 
			for(int i = 0; i < maxArray.length; i++){
				if(maxArray[i] == max){
					result[k]= i;
					k++;
				}
					
			}
		return result;
	}
	
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		int a[][] = inputMatrix(sc);
		if(isDiagDominant(a)==true)
			System.out.print("true");
		else
			System.out.print("false");
	
	}

}
