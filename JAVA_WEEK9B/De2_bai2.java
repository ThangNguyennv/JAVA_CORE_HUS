import java.util.*;

public class De2_bai2{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int arr[] = readArray(sc);
        printArray(arr);
        if(isIncreasing(arr) == true)
            System.out.println("true");
        else
            System.out.println("false");
        System.out.println(maxValue(arr));
        listPrime(arr);
    }

    //thực hiện đọc và trả lại mảng n số nguyên
    public static int[] readArray(Scanner reader){
        int n = reader.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i < arr.length; i++){
            arr[i] = reader.nextInt();
        }
        return arr;
    }
    
    //kiểm tra một dãy số nguyên có tăng ngặt hay không
    public static boolean isIncreasing(int[] arr){
        for(int i = 1; i < arr.length; i++){
            if(arr[i] <= arr[i-1])
                return false;
        }
        return true; 
    }
    // tìm phần tử lớn thứ nhì trong mảng arr
    public static int maxValue(int[] arr){
        int max = arr[0];
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > max)
                max = arr[i];
        }
        return max; 
    }
    public static boolean SNT(int n){
        if(n < 2) return false;
        for(int i = 2; i <= Math.sqrt(n); i++){
            if(n % i == 0)
                return false;
        }
        return true;
    }

    //Liệt kê chỉ số các phần tử có giá trị lớn thứ 2 trong mảng arr
    public static void listPrime(int[] arr){
        for(int i = 0; i < arr.length; i++){
            if(SNT(arr[i]) == true)
                System.out.print(i + " ");
        }
        System.out.println();
    }       
    // In ra màn hình mảng số nguyên arr
    public static void printArray(int[] arr) {
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
