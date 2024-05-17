import java.util.Scanner;

public class Matrix {
    public static void main (String[] args) {
    Scanner sc = new Scanner (System.in);
    int n = sc.nextInt();
    int a[][] = inputMatrix(n, n, sc);
    System.out.println();
    printMatrix(a);
    System.out.println();
    printPronicsInUpperTriangularMatrix(a);


    }
    
    public static int[][] inputMatrix(int rows, int columns, Scanner keyboard) {
        int array[][] = new int[rows][columns];
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < columns; j++){
                array[i][j] = keyboard.nextInt();
            }
        }
        return array;
    }
    
    public static void printMatrix(int[][] matrix) {
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[0].length; j++){
                System.out.print(matrix[i][j]);
                if(j != matrix[0].length-1)
                    System.out.print(" ");
            }
            System.out.println();
        } 
    }
    public static boolean soProNic(int n){
       int rev = (int)Math.sqrt(n);
       return rev * (rev + 1) == n;
    }
    public static void sort(int a[]){
        for(int i = 0; i < a.length-1; i++){
            for(int j = i + 1; j < a.length; j++){
                if(a[i] > a[j]){
                    int tmp = a[i];
                    a[i] = a[j];
                    a[j] = tmp;
                }
            }
        }
        for(int i = 0; i < a.length; i++){
            if(a[i] != a[a.length-1])
                System.out.print(a[i] + " ");
        }
        System.out.print(a[a.length-1]);
    }
    public static void printPronicsInUpperTriangularMatrix(int[][] matrix) {
        int cnt = 0;
        for(int i = 0; i < matrix.length; i++){
            for(int j = i; j < matrix[0].length; j++){
                if(soProNic(matrix[i][j]) == true){
                    cnt++;
                }
            }
        }
        int newArray[] = new int[cnt];
        int k = 0;
            for(int i = 0; i < matrix.length; i++){
                for(int j = i; j < matrix[0].length; j++){
                    if(soProNic(matrix[i][j]) == true){
                        newArray[k] = matrix[i][j];
                        k++;
                    }
                }
            }
        sort(newArray);
        
    }
        

    }
