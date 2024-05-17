import java.util.*;
public class mang2chieu {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int columns = sc.nextInt();
        double array[][] = new double[rows][columns];
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < columns; j++){
                array[i][j] = sc.nextDouble();
            }
        }
        // bai1(array);
        // bai2(array);
        //  bai3(array);
        bai4(array);




    }
    
    public static void bai1(double arr[][]){
        int count = 0;
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[0].length; j++){
                if(arr[i][j] == 0){
                    count++;
                }
            }
        }
        if(count >= (arr.length*arr[0].length) / 2){
            System.out.println("Day la ma tran thua");
        }
        else{
            System.out.println("Day ko phai ma tran thua");
        }
    }

    public static void bai2(double arr[][]){
        double max = arr[0][0]; 
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[0].length; j++){
                if(arr[i][j] > max){
                    max = arr[i][j];
                }
            }
        }
        System.out.println(max);
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[0].length; j++){
                if(arr[i][j] == max){
                    System.out.println(i + " " + j);
                }
            }
        }
    }
    public static void bai3(double arr[][]){
        int count = 0;
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[0].length; j++){
                if(arr[i][j] > 0){
                    count++;
                }
            }
        }
        if(count > 0)
            System.out.println("Trong ma tran co so duong");
        else
            System.out.println("Trong ma tran ko co so duong");
        if(count == arr.length * arr[0].length)
            System.out.println("Tat ca phan tu trong ma tran deu duong");
        else    
            System.out.println("Co phan tu trong ma tran ko duong");
    }

    public static void bai4(double arr[][]){
    double newArray[][] = new double[arr[0].length][arr.length];
    for(int i = 0; i < arr.length; i++){
        for(int j = 0; j < arr[0].length; j++){
            newArray[j][i] = arr[i][j];
        }
    }
    for(int i = 0; i < newArray.length; i++){
        for(int j = 0; j < newArray[0].length; j++){
            System.out.print(newArray[i][j] + " ");
        }
        System.out.println();
    }
            int on = 1;
            // Duyệt qua tất cả các cặp cột
            for(int i = 0; i < newArray[0].length; i++){
                int ok = 1;
                for(int j = 0; j < i; j++){
                    // So sánh hai cột
                    for(int k = 0; k < newArray.length; k++){
                        if(newArray[k][i] != newArray[k][j]){
                            ok = 0;
                            break;
                        }
                    }
                    //neu thay 2 cot bang nhau, gan on = 0 va break
                    if(ok == 1){
                        on = 0;
                        break;
                    }
                }
                if(on == 0){
                    break;
                }
            }
            if(on == 0)
                System.out.print("YES");
            else
                System.out.print("NO");
        
    }
}
