public class SieveOfErastosthenes {

    public static void main (String[] args) {
        System.out.print(erastosthenes(100));
    }
    
    /**
     * INPUT: number - tìm các số nguyên tố nhỏ hơn hoặc bằng number.
     * OUTPUT: String chứa các số nguyên tố được tìm thấy theo định dạng, ví dụ, "2 3 5 7".
     */
    public static String erastosthenes(int number) {
        boolean array[] = new boolean[number+1];
        for(int i = 0; i < number; i++){
            array[i] = false;
        }
        for(int i = 2; i <= number; i++){
            if(array[i] == false){
                for(int j = i+i; j <= number; j+=i){
                    array[j] = true;
                }
            }
        }
        String result = "";
        for(int i = 2; i <= number; i++){
            if(array[i] == false){
                result += i + " ";
            }
        }         
        return result;
    }
}   