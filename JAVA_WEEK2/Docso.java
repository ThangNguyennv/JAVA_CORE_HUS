import java.util.Scanner;

public class Docso {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        if (N < 0 || N > 999) {
            System.out.print("Ngoai pham vi doc");
        } else {
            System.out.print(convertToVietnamese(N));
        }
    }

    public static String convertToVietnamese(int number) {
        String[] units = {"khong","mot", "hai", "ba", "bon", "nam", "sau", "bay", "tam", "chin"};
        String[] tens = {"", "muoi", "hai muoi", "ba muoi", "bon muoi", "nam muoi", "sau muoi", "bay muoi", "tam muoi", "chin muoi"};
        String[] hundreds = {"", "mot tram", "hai tram", "ba tram", "bon tram", "nam tram", "sau tram", "bay tram", "tam tram", "chin tram"};

        int unit = number % 10;
        int ten = (number / 10) % 10;
        int hundred = (number / 100) % 10;
        StringBuilder result = new StringBuilder();
	//truong hop chu so hang tram,chuc,don vi deu bang 0
		if(hundred==0&&ten==0&&unit==0)
			System.out.println("khong");
	//kiem tra 1 chu so
		if(hundred == 0 && ten == 0 && unit != 0){
			result.append(units[unit]);
		}
	//kiem tra 2 chu so
		if(hundred == 0 && ten != 0){
			if(ten==1&&unit==4){
				result.append(tens[ten]).append(" ");
				result.append(units[unit]);
			}
			else {
				if(unit==4){
				result.append(tens[ten]).append(" ");
				result.append("tu");
				}
				else{
					if(unit==0){
						result.append(tens[ten]).append(" ");
					}
					else{
						result.append(tens[ten]).append(" ");
						result.append(units[unit]);
					}
				}
			}
		}
	//kiem tra 3 chu so
		if(hundred!=0){
			result.append(hundreds[hundred]).append(" ");
			if(ten == 0 && unit!=0){
				result.append("linh");
			}
			if(ten == 1 && unit != 0){
				if(unit==5){
					result.append(tens[ten]).append(" ");
					result.append("lam");
				}
				else{
					result.append(tens[ten]).append(" ");
					result.append(units[unit]);
				}
			}
			else{
				if(unit==4){
					result.append(tens[ten]).append(" ");
					result.append("tu");
				}
				else{
					if(unit==5){
						if(ten==0){
							result.append(tens[ten]).append(" ");
							result.append("nam");
						}
						else {
							result.append(tens[ten]).append(" ");
							result.append("lam");
						}
					}
					else{
						if(unit==0)
							result.append(tens[ten]).append(" ");
						else{
							result.append(tens[ten]).append(" ");
							result.append(units[unit]);
						}	
					}
				}
			}
		}
		return result.toString().trim();
    }
}