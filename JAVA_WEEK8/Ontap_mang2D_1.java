import java.util.Scanner;

public class Ontap_mang2D_1{

    /* thực hiện nhập số nguyên m, n và trả lại mảng hai chiều m x n số nguyên nhập từ bàn phím */
    public static int[][] readMatrix(Scanner reader) {
        int m = reader.nextInt();
        int n = reader.nextInt();
        int array[][] = new int[m][n];
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                array[i][j] = reader.nextInt();
            }
        }
        return array;
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
    public static boolean checkSoHoanHao(int n){
        int sum = 1;
        for(int i = 2; i <= Math.sqrt(n); i++){
            if(n % i == 0){
                sum += i + n/i;
            }
        }
        return sum == n;
    }
    /* liệt kê chỉ số cột của các phần tử là số hoàn thiện trong dòng thứ k ma trận Mtr */
    public static void listPerfectNum(int[][] Mtr, int k) {
        for(int j = 0; j < Mtr[0].length; j++){
            if(checkSoHoanHao(Mtr[k][j]) == true){
                System.out.print(j + " ");
            }
        }
        System.out.println();


    }
    
    /*  thực hiện tính và chuẩn 2 của cột thứ k của Mtr */
    public static double normCols(int[][] Mtr, int k) {
        double sum = 0;
        for(int i = 0; i < Mtr.length; i++){
            sum+=Mtr[i][k]*Mtr[i][k];
        }
        double result = Math.sqrt(sum);
        return result;
    }

    /* thực hiện việc tính và in chuẩn 2 của các cột trong Mtr ra màn hình */
    public static void printColsNorm(int[][] Mtr)  {
        for(int j = 0; j < Mtr[0].length; j++){
            double sum = 0;
            for(int i = 0; i < Mtr.length; i++){
                sum += Mtr[i][j]*Mtr[i][j];
            }
            System.out.printf("%.4f", Math.sqrt(sum));
            System.out.print(" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int array[][] = readMatrix(sc);
        int k = sc.nextInt();
        printMatrix(array);
        System.out.println();
        printColsNorm(array);
        System.out.println();
        System.out.println(normCols(array,k));
        listPerfectNum(array,k);
    }
    
}

