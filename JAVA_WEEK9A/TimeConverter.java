/**
 * Program to convert seconds to hour, minute and seconds
 */
import java.util.*;
public class TimeConverter {
   public static void main(String [] args){
   Scanner sc = new Scanner(System.in);
   int soGiayNhap = sc.nextInt();
   int soGio = soGiayNhap / 3600;
   int soPhut = (soGiayNhap-soGio*3600) / 60;
   int soGiay = (soGiayNhap-soGio*3600) - 60 * soPhut; 
   System.out.print(soGio + ":" + soPhut + ":" + soGiay);
   }
 
}