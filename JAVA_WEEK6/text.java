
import java.util.*;
public class text{
    
    //Hoàn thiện định nghĩa hàm/phương thức kiểm tra 2 mảng cộng tuyến dưới đây
    public static boolean isCollinear(int V[], int U[]){
		double k = 1;
		for(int i = 0; i < V.length; i++){
			if(U[i]==0 && V[i]!=0) return false;
			else if(U[i]==0 && V[i]==0) continue;
			if(U[i]!=0){
				k = (double)V[i]/(double)U[i];
				break;
			}
		}
		if(k==0) return false;
		for(int i = 0; i < V.length; i++){
			if(U[i] != V[i]*k) return false;
		}
		return true;
    }
	public static void main(String [] args){
		Scanner sc = new Scanner (System.in);
		int v[] = new int[5];
		int u[] = new int[5];
		for(int i = 0; i < 5; i++){
			v[i] = sc.nextInt();
		}
		for(int i = 0; i < 5; i++){
			u[i] = sc.nextInt();
		}
		if(isCollinear(v,u)==true)
			System.out.print("true");
		else
			System.out.print("no");
		
		
	}
}