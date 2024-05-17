import java.util.*;
public class Countvalues{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n];
		int ans = 0;
		for(int i = 0; i < n; i++){
			a[i] = sc.nextInt();
		}
		for(int i = 0; i < n; i++){
			int ok = 1;
			for(int j = 0; j < i; j++){
				if(a[i]==a[j]){
					ok = 0;
					break;
				}
			}
			if(ok==1){ //duyet nhung thang khac nhau
				for(int k = 0; k < n; k++){
					if(a[k]==a[i]){
						ans++;
					}
				}
				System.out.print(a[i] + ":" + ans + " ");
				ans=0;
			}
		}
	}
}
