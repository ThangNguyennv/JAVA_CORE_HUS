/**
 * 1d array program 
 */
import java.util.*;
public class Array1D {
    public static void main (String[] args) {
      
    }
    
    public static int[] inputArray(int size, Scanner keyboard) {
        int array[] = new int[size];
        for(int i = 0; i < size; i++){
            array[i] = keyboard.nextInt();
        }
        return array;
    }
     
    public static String arrayToString(int[] array) {  
        String s = "[";
        for(int i = 0; i < array.length-1; i++){
            s += String.valueOf(array[i]) + ",";
        }
        s += String.valueOf(array[array.length-1]) + "]";
        return s;
    } 
    
    public static int[] copyOf(int[] array) {
        int newArray [] = new int [array.length];
        for(int i = 0; i < array.length; i++){
            newArray[i] = array[i];
        }
        return newArray;
    }
    
    public static void sort(int[] array) {
        for(int i = 0; i < array.length-1; i++){
            for(int j = i + 1; j < array.length; j++){
                if(array[i] > array[j]){
                    int tmp = array[i];
                    array[i] = array[j];
                    array[j] = tmp;
                }
            }    
        }
    }
    
    public static int search(int[] array, int value) {
        for(int i = 0; i < array.length; i++){
            if(array[i] == value){
                return i;
            }
        }
        return -1;
    }
    
    public static boolean contains(int[] array, int value) {
       int sortArray[] = new int[array.length];
        for(int i = 0; i < array.length; i++){
            sortArray[i] = array[i];
        }
        for(int i = 0; i < array.length-1; i++){
            for(int j = i + 1; j < array.length; j++){
                if(sortArray[i] > sortArray[j]){
                    int tmp = sortArray[i];
                    sortArray[i] = sortArray[j];
                    sortArray[j] = tmp;
                }
            }    
        }
        int left = 0, right = array.length-1;
        while(left <= right){
            int mid = (left + right)/2;
            if(sortArray[mid] == value) return true;
            else if(sortArray[mid] < value){
                left = mid + 1;
            }
            else
                right = mid - 1;
        }
        return false;

    }
}