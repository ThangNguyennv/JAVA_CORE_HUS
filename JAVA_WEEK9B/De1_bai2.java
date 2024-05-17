/**
 * Hoàn thiện các phương thức trong lớp De1_bai2 theo các yêu cầu 
 * như trong phần mô tả và đề bài. Các phương thức cần được giữ nguyên dạng
 * tên / danh sách tham đối/ kiểu trả về/ mẫu khai báo ....
 * */
import java.util.Scanner;

public class De1_bai2{

    //thực hiện đọc và trả lại mảng n số nguyên
    public static int[] readArray(Scanner reader){
        int n = reader.nextInt();
        int array[] = new int[n]; 
        for(int i = 0; i < array.length; i++){
            array[i] = reader.nextInt();
        }
        return array;
    }
    
    //kiểm tra một dãy số nguyên có lập thành cấp số cộng với công sai chẵn hay không
    public static boolean isEvenArithmetic(int[] arr){
        int d = arr[1] - arr[0];
        for(int i = 2; i < arr.length; i++){
            if(d % 2 != 0) 
                return false;
            else{
                if(arr[i] - arr[i-1] != d)
                    return false;
            }
        }
        return true;
    }
    
    
    // tìm phần tử lớn thứ nhì trong mảng arr
    public static int secondMax(int[] arr){
        int max = arr[0];
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > max)
                max = arr[i];
        }
        int max2 = arr[0];
        if(max2 == max) 
            max2 = arr[1];
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > max2 && arr[i] < max)
                max2 = arr[i];
        }   
        return max2; 
    }

    //Liệt kê chỉ số các phần tử có giá trị lớn thứ 2 trong mảng arr
    public static void list2ndMax(int[] arr){
        int max2ND = secondMax(arr);
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == max2ND){
                System.out.print(i + " ");
            }
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
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int mang[] = readArray(sc);
        printArray(mang);
        if(isEvenArithmetic(mang) == true)
            System.out.print("true");
        else
            System.out.print("false");
        System.out.println();
        System.out.print(secondMax(mang));
        System.out.println();
        list2ndMax(mang);
    }
}
 