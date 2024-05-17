import java.util.*;
public class De1Bai2{
	public static boolean sohoanhao(int n){
		int sum = 1;
		if(n==1) return false;
		for(int i = 2; i <= Math.sqrt(n); i++){
			if(n%i==0){
				sum+=i+n/i;
			}
		}
		return sum==n;
	}
	public static boolean check1(int a[][]){
		for(int i = 0; i < a.length; i++){
			if(a[i][0] != a[i][a[0].length-1])
				return false;
		}
		return true;
	}
	public static void check2(int a[][]){
		int on = 1;
		// Duyệt qua tất cả các cặp cột
		for(int i = 0; i < a[0].length; i++){
			int ok = 1;
			for(int j = 0; j < i; j++){
				// So sánh hai cột
				for(int k = 0; k < a.length; k++){
					if(a[k][i] != a[k][j]){
						ok = 0;
						break;
					}
				}
				//neu thay 2 cot bang nhau, gan on = 0 va break
				if(ok == 1){
					on = 0;
					break;
				}
			}
			if(on == 0){
				break;
			}
		}
		if(on == 0)
			System.out.print("YES");
		else
			System.out.print("NO");
	}
	public static void check3(int a[][]){
		int min = 8128;
		int ok = 1;
		for(int i = 0; i < a.length; i++){
			for(int j = 0; j < a[0].length; j++){
				if(sohoanhao(a[i][j]) == true){
					if(a[i][j] < min){
						ok = 0;
						min = a[i][j];
					}
				}
			}
		}
		if(ok == 0){
			System.out.print(min);
		}
		else
			System.out.print("-1");
		
	}
	public static void check4(int a[][]){
		int cnt = 0;
		for(int i = 0; i < a.length; i++){ //duyet tung hang
			for(int k = 0; k < a.length; k++){
				if(a[i][0] == a[k][0]){
					cnt++;
				}
			}
			System.out.print(cnt);
			if(a[i][0] != a[a.length-1][0]){
				System.out.print(" ");
			}
			cnt=0;	
		}
	}
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[][] = new int[n][n];
		for(int i = 0; i < n; i++){
			for(int j = 0; j < n; j++){
				a[i][j] = sc.nextInt();
			}
		}
		int c = sc.nextInt();
		if(c==1){
			if(check1(a)==true)
				System.out.print("YES");
			else
				System.out.print("NO");
		}
		if(c==2){
			check2(a);
		}
		if(c==3){
			check3(a);
		}
		if(c==4){
			check4(a);
		}
	}
}