import java.util.*;
public class giaiPTBac2{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		double c = sc.nextDouble();
		if(a==0){
			if(b==0)
				if(c==0)
					System.out.println("Vo so nghiem");
				else
					System.out.println("Vo nghiem");
			else
				System.out.printf("%.3f\n",(-c/b));
		}
		else {
		double delta = b*b-4*a*c;
		if(delta<0)
			System.out.println("Vo nghiem");
		else if(delta==0)
			System.out.printf("%.3f\n",(-b/(2*a)));
		else{
			System.out.printf("%.3f",(-b-Math.sqrt(delta))/(2*a));
			System.out.print(" ");
			System.out.printf("%.3f\n",(-b+Math.sqrt(delta))/(2*a));
			
		}
	}
	}
}