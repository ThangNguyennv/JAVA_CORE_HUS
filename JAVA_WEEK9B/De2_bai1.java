import java.util.*;

public class De2_bai1{

    public static double F(double x, int n){ // tính và trả về f(x)
        double f = 5*x*x*x*loganepe(x, n) - 7*x*x + 13;
        return f;
    }
    
    public static double loganepe (double x, int n) { // tính và trả về ln(1+x)
        double Sk = x;
        double ln = x;
        for(int k = 2; k <= n; k++){
            SK = (SK*(-1)*x*(k-1)) / k;
            ln = ln + Sk;
        }
        return ln;
    
    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double x = sc.nextDouble();
        System.out.println(loganepe(x, n));
        System.out.println(F(x,n));
    }

    // phương thức main để thực hiện.
}