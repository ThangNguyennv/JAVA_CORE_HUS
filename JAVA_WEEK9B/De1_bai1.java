import java.util.Scanner;

/** De1_bai1.java
 * Nhập vào số thực x và số nguyên dương n từ bàn phím (x nhập trước, n nhập sau).
 * Tính và in ra giá trị biểu thức f(x) = x^3 * arctan(x) - 9x^2 + 5
 * */

 public class De1_bai1{

    public static double F(double x, int n){ // tính và trả về f(x)
        double f = x*x*x*arctang(x, n) - 9*x*x + 5;
        return f;
    }
    
    public static double arctang(double x, int n){ // tính và trả về arctan(x)
        double Sk = x;
        double arctan = x;
        for(int k = 2; k <= n; k++){
            Sk = (Sk*(-1)*x*x*(2*k-3)) / (2*k-1);
            arctan = arctan + Sk;   
        }
        return arctan;
    
    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double x = sc.nextDouble();
        System.out.println(arctang(x, n));
        System.out.println(F(x,n));
    }

    // phương thức main để thực hiện.
}