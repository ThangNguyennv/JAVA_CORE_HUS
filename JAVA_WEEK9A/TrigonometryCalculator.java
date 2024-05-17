/**
 * Program to calculate approximately value of sinx
 */
import java.util.*;
public class TrigonometryCalculator {
    public static void main (String[] args) {

    }
    
    public static double calculateSin(double x) {
        
        double Sk = x;
        double sin = x;
        for(int k = 2; k <= 150; k++){
            Sk = (Sk*(-1) * x * x) / ((2*k-1)*(2*k-2));
            sin = sin + Sk;
        }
        return sin;
    }
}