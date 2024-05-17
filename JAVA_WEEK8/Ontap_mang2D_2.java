import java.util.Scanner;

public class Ontap_mang2D_2{

    /* thực hiện nhập số nguyên m, n và trả lại mảng hai chiều m x n số nguyên nhập từ bàn phím */
    public static int[][] readMatrix(Scanner reader) {
        int m = reader.nextInt();
        int n = reader.nextInt();
        int maTrix[][] = new int[m][n];
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                maTrix[i][j] = reader.nextInt();
            }
        }
        return maTrix;
    }
    
    /* thực hiện việc in mảng hai chiều Mtr ra màn hình dạng ma trận */
    public static void printMatrix(int[][] Mtr) {
        for(int i = 0; i < Mtr.length; i++){
            for(int j = 0; j < Mtr[0].length; j++){
                System.out.print(Mtr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static boolean soDoiXung(int n){
        int rev = 0;
        int tmp = n;
        if(n < 0)
            return false;
        while(n != 0){
            rev = rev * 10 + n % 10;
            n /= 10;
        }
        return rev == tmp;
    }

    /* liệt kê chỉ số cột của các phần tử là số đối xứng trong dòng thứ k ma trận Mtr */
    public static void listPalindrome(int[][] Mtr, int k) {
        for(int j = 0; j < Mtr[0].length; j++){
            if(soDoiXung(Mtr[k][j]) == true){
                System.out.print(j + " ");
            }
        }
        System.out.println();
    }
    
    /*  thực hiện tính và trả về giá trị trung bình các phần tử dòng thứ k của Mtr */
    public static double avgRows(int[][] Mtr, int k) {
        double sum = 0;
        for(int j = 0; j < Mtr[0].length; j++){
            sum = sum + Mtr[k][j];
        }
        double reSult = sum / Mtr[0].length;
        return reSult;
    }

    /* thực hiện việc tính và in giá trị trung bình các phần tử của các dòng trong Mtr ra màn hình */
    public static void printRowsAvg(int[][] Mtr)  {
        for(int i = 0; i < Mtr.length; i++){
            double sum = 0;
            for(int j = 0; j < Mtr[0].length; j++){
                sum = sum + Mtr[i][j];
            }
            System.out.printf("%.3f", sum / Mtr[0].length);
            System.out.print(" ");
        }
        System.out.println();
    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int array[][] = readMatrix(sc);
        int k = sc.nextInt();
        printMatrix(array);
        listPalindrome(array,k);
    }
    
}
