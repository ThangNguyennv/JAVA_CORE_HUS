/**
 * Hoàn thiện chương trình Collinear cho phép nhập 2 số nguyên m, n và mảng A
 * m x n phần tử nguyên. Kiểm tra và liệt kê các cột cộng tuyến theo yêu cầu
 * Giữ cấu trúc hàm kiểm tra isCollinear(int V[], int U[]), bổ sung các hàm/
 * phương thức khác để hoàn thành chương trình.
 * */
import java.util.*;
public class Collinear{
    
    //Hoàn thiện định nghĩa hàm/phương thức kiểm tra 2 mảng cộng tuyến dưới đây
    public static boolean isCollinear(int V[], int U[]){
		double k = 1;
		for(int i = 0; i < V.length; i++){
			if(U[i]==0 && V[i]!=0) return false;
			else if(U[i]==0 && V[i]==0) continue;
			if(U[i]!=0){
				k = (double)V[i] / U[i];
				break;
			}
		}
		if(k==0) return false;
		for(int i = 0; i < V.length; i++){
			if(V[i] != U[i]*k) return false;
		}
		return true;
    }
	public static int[] check(int a[][]){
		int m = a.length;
		int n = a[0].length;
		int res[] = new int[n];
		for(int i = 0; i < n; i++){
			res[i] = -1;
		}
		for(int i = 0; i < n; i++){
			int b[] = new int[m];
			
			for(int j = 0; j < m; j++){
				b[j] = a[j][i]; //mang chua cot i
			}
			for(int k = i+1; k < n; k++){
				int c[] = new int[m];
				for(int j = 0; j < m; j++){
					c[j] = a[j][k]; //mang chua cot k
				}
				if(isCollinear(b,c)==true && res[k] == -1){
					res[k]=i;
				}
			}
		}
		for(int i = 0; i < n; i++){
			if(res[i] == -1)
				res[i] = i;
		}
		return res;
	}
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int n = sc.nextInt();
		int a[][] = new int[m][n];
		for(int i = 0; i < m; i++){
			for(int j = 0; j < n; j++){
				a[i][j] = sc.nextInt();
			}
		}
		int s[] = check(a);
		for(int i = 0; i < s.length; i++){
			System.out.print(s[i] + " ");
		}
		
		
	}
}