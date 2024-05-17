import java.util.*;
public class mang1chieu{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        double array[] = new double[number];
        for(int i = 0; i < number; i++){
            array[i] = sc.nextDouble();
        }
        // bai1(array);
        // bai2(array);
        // bai3(array, sc);
        // bai4(array);
        // bai5(array);
        // bai6(array);
        bai14(array);
        // bai17(array);
      
        
    }

    public static void bai1(double[] array){
        double sum = 0;
        for(int i = 0; i < array.length; i++){
            sum += Math.pow(-1,i+2)*array[i];
        }
        System.out.println(sum);
    }

    public static void bai2(double[] array){
        int cnt = 0;
        for(int i = 0; i < array.length; i++){
            if(array[i] > 0)
                cnt++;
        }
        if(cnt > 0)
            System.out.println("Trong day co so duong");
        else
            System.out.println("Trong day khong co so duong");
        if(cnt == array.length)
            System.out.println("Tat ca phan tu trong day deu duong");   
        else
            System.out.println("Co phan tu trong day khong duong");
    }

    public static void bai3(double[] array, Scanner sc){
        int k = sc.nextInt();
        int cnt = 0;
        for(int i = 0; i < array.length; i++){
            if(array[i] > 0)
                cnt++;
            if(array[i] < 0)
                cnt = 0;
            if(cnt == k){
                System.out.println("Co so duong dung canh nhau");
                break;
            }
        }
        System.out.println("khong co so duong dung canh nhau");
    }
    public static boolean checkNT(double n){
        if(n < 2) return false;
        for(int i = 2; i < Math.sqrt(n); i++){
            if(n % i == 0) return false;
        }
        return true;
    }
    public static void bai4(double[] array){
        int cnt = 0;
        for(int i = 0; i < array.length; i++){
            if(checkNT(array[i]) == true)
                cnt++;
        }
        if(cnt > 0)
            System.out.println("Day co so nguyen to");
        else
            System.out.println("Day khong co so nguyen to");
        if(cnt == array.length)
            System.out.println("Day co tat ca cac so nguyen to");
        else
            System.out.println("Day ton tai so k phai so nguyen to");
    }

    public static void bai5(double[] array){
        int ok = 1;
        for(int i = 0; i < array.length-1; i++){
            if(array[i] >= array[i+1]){
                ok = 0;
                break;
            }
            ok = 1;
        }
        if(ok == 0)
            System.out.println("Day khong la day so tang");
        else
            System.out.println("Day la day so tang");
        int check = 1;
        for(int i = 0; i < array.length-1; i++){
            if(array[i] == 0){
                check = 0;
                break;
            }
            if(array[i] * array[i+1] >= 0){
                check = 0;
                break;
            }
            check = 1;
        }
        if(check == 0){
            System.out.println("Day khong la day dan dau");
        }
        else{
            System.out.println("Day la day dan dau");
        }
    }
    public static void bai6(double[] arr){
        boolean check[] = new boolean[arr.length];
        for(int i = 0; i < arr.length; i++){
            check[i] = true;
        }
        for(int i = 0; i < arr.length; i++){
            if(check[i] == true){
                for(int j = i + 1; j < arr.length; j++){
                    if(arr[j] == arr[i]){
                        check[i] = false;
                    }
                }
            }
        }
    
        for(int i = 0; i < arr.length; i++){
            if(check[i] == true){
                System.out.println(arr[i] + " ");
            }
        }
    }
    public static void bai14(double[] arr){
        boolean check[] = new boolean[arr.length];
        for(int i = 0; i < arr.length; i++){
            check[i] = true;
        }
        double sum = 0;
        int m = 0;
        double result[] = new double[arr.length];
        for(int i = 0; i < arr.length-1; i++){
            for(int j = i+1; j < arr.length; j++){
                sum = arr[j] + arr[i];
                for(int k = 0; k < arr.length; k++){
                    if(arr[k] == sum){
                        if(check[k] == true){
                            System.out.print(arr[k] + " ");
                            result[m++] = arr[k];
                            check[k] = false;   
                        }
                    }
                }
            }
        }
    }

    public static void bai17(double [] arr){
// doan tim min be nhat
        double sumLeft = 0, sumRight = 0;
        int indexResult = 1;
        for(int i = 0; i < 1; i++){
            sumLeft += arr[i];
        }
        for(int j = 1; j < arr.length; j++){
            sumRight += arr[j];
        }
        double min = Math.abs(sumLeft-sumRight);
        sumLeft = 0; 
        sumRight = 0;

        for(int index = 1; index < arr.length; index++){
            for(int i = 0; i < index; i++){
                sumLeft += arr[i];
            }
            for(int j = index; j < arr.length; j++){
                sumRight += arr[j];
            }
            if(Math.abs(sumLeft-sumRight) <= min){
                indexResult = index;
                min = Math.abs(sumLeft-sumRight);
            }
        }
        for(int i = 0; i < indexResult; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        for(int j = indexResult; j < arr.length; j++){
            System.out.print(arr[j] + " ");
        }
    }
} 
