import java.util.*;
public class bai7{
	public static boolean Armstrong(int k){
	int cnt=0;
	int result = 0;
	int rev = k;
	int check=k;
	while(k!=0){
		int n = k%10;
		cnt++;
		k/=10;
	}
	while(rev!=0){
		int m = rev%10;
		result+=Math.pow(m,cnt);
		rev/=10;
	}
	if(result==check) return true;
	else return false;
	}
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int i = 1;
		int cnt=0;
		while(true){
			if(Armstrong(i)==true){
				cnt++;
				System.out.print(i + " ");
			}
			i++;
			if(cnt==n) 
				break;
		}
	}
}