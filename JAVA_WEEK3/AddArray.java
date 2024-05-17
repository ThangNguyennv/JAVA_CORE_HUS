/**
 * Chương trình cộng 2 mảng số nguyên: 
 * Cho phép đọc số nguyên n, và 2 mảng với n phần tử nguyên
 * Tính và in ra mảng có phần tử là tổng phần tử tương ứng
 * của 2 mảng nhập vào trên một dòng, cách nhau bởi khoảng trống.
 * Yêu cầu giữ cấu trúc các hàm/phương thức đã có, có thể bổ sung nếu cần
 * */
 import java.util.*;
 class AddArray{
		public static int[] inputarray(int n,Scanner sc){
			int arr[] = new int[n];
			for(int i = 0; i < n; i++){
				arr[i] = sc.nextInt();
			}
			return arr;
		}
		public static int[] sumarray(int[] a, int[] b){
			int n = a.length;
			int c[] = new int[n];
			for(int i = 0; i < n; i++){
				c[i] = a[i] + b[i];
				
			}
			return c;
		}
		public static void printarray(int a[]){
			for(int i = 0; i < a.length; i++){
				System.out.print(a[i] + " ");
			}
		}
     public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int A[] = inputarray(n,sc);
		int B[] = inputarray(n,sc);
		int C[] = sumarray(A,B);
		printarray(C);
     }
 }