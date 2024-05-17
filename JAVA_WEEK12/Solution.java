import java.io.*;
import java.util.*;

public class Solution {
    public static int[] cnt = new int[1001];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        int d[] = new int[28];
        for(int i = 0; i < n; i++) {
            a[i] = sc.nextInt();   
            d[a[i] % 28]++;
        }
        long res = 0;
        for(int x = 0; x <= 14; x++) {
            int y = (28 - x) % 28;
            if(x != y){
                res += (long)d[x]*d[y];
            }
            else{
                res += (long)d[x]*(d[x]-1)/2;
            }
        }
        System.out.println(res);
        
        
        
    }
}