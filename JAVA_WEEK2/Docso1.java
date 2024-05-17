import java.util.*;


public class Docso1{
	
	public static String chuyendoiso(int hang tram, int hangchuc, int hangdv){
		int hangdv = N%10;
		int hangchuc = (N/10)%10;
		int hangtram = (N/100)%10;
		if(hangtram==0&&hangchuc==0){
			switch(hangdv){
				case 0: return "khong";
				case 1: return "mot";
				case 2: return "hai";
				case 3: return "ba";
				case 4: return "bon";
				case 5: return "nam";
				case 6: return "sau";
				case 7: return "bay";
				case 8: return "tam";
				case 9: return "chin";
				default: return "";
			}
		}
		//else if(hangtram==0&&hangchuc!=0){
			//if(hangdv==4){
				//switch(hangchuc){
				//case 0: return "muoi";
				//case 1: return "hai muoi tu";
				//case 2: return "ba muoi tu";
				//case 3: return "bon muoi tu";
				//case 4: return "nam muoi";
				///case 5: return "nam";
				//case 6: return "sau";
				//case 7: return "bay";
				//case 8: return "tam";
				//case 9: return "chin";
				//default: return "";
		//	}
				
				
				
		//	}
		}
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		if (N < 0 || N > 999) {
            System.out.print("Ngoai pham vi doc");
        } 
		else {
            System.out.print(chuyendoiso(N));
        }
	}
}