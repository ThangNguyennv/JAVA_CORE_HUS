import java.util.HashMap;
import java.util.Map;

public class ConvertToVietnamese {
    public static void main(String[] args) {
        int number = 12;

        String vietnameseNumber = convertToVietnamese(number);
        System.out.println(vietnameseNumber);
    }

    public static String convertToVietnamese(int number) {
        Map<Integer, String> vietnameseMap = createVietnameseMap();

        String numberString = String.valueOf(number);
        StringBuilder vietnameseNumber = new StringBuilder();

        for (int i = 0; i < numberString.length(); i++) {
            int digit = Character.getNumericValue(numberString.charAt(i));
            String vietnameseDigit = vietnameseMap.get(digit);
            vietnameseNumber.append(vietnameseDigit);
        }

        return vietnameseNumber.toString();
    }

    public static Map<Integer, String> createVietnameseMap() {
        Map<Integer, String> vietnameseMap = new HashMap<>();
        vietnameseMap.put(0, "khong");
        vietnameseMap.put(1, "mot");
        vietnameseMap.put(2, "hai");
        vietnameseMap.put(3, "ba");
        vietnameseMap.put(4, "bon");
        vietnameseMap.put(5, "nam");
        vietnameseMap.put(6, "sau");
        vietnameseMap.put(7, "bay");
        vietnameseMap.put(8, "tam");
        vietnameseMap.put(9, "chin");
        return vietnameseMap;
    }
}