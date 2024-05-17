
import java.util.Scanner;

public class ManageBabies {
	
    private Baby babies[];
	
	/*  Nhap vao thong tin cua n baby tu ban phim. Cac thong tin theo thu tu ten, ngay thang nam sinh, gioi tinh
	gioi tinh, can nang, chieu cao
	*/
	
	// nhap vao so nguyen duong n va thong tin cua n baby
	Baby[] createData (Scanner sc)
	{
	    int n = Integer.parseInt(sc.nextLine());
        Baby[] babies = new Baby[n];
        for(int i = 0; i < n; i++) {
            String bbName = sc.nextLine();
            String bbDay = sc.nextLine();
            boolean bbGender = Boolean.parseBoolean(sc.nextLine());
            double bbWeight = Double.parseDouble(sc.nextLine());
            double bbLenght = Double.parseDouble(sc.nextLine());
            babies[i] = new Baby(bbName, bbDay, bbGender, bbWeight, bbLenght);
            
        }
	    return babies;
	}
	
	 // In ra thong tin cua n baby sau khi chuan hoa ho ten
	void printInforBabies (Baby babies[])
	{
	    for(int i = 0; i < babies.length; i++) {
            System.out.println(babies[i]);
        }
	}
	// Sap xep cac baby theo trong luong giam dan
	void sortWeight (Baby babies[])
	{
	    for(int i = 0; i < babies.length-1; i++) {
            for(int j = i + 1; j < babies.length; j++){
                if(babies[i].getWeight() < babies[j].getWeight()) {
                    Baby tmp = babies[i];
                    babies[i] = babies[j];
                    babies[j] = tmp;
                }
            }
        }
	}
	// Loc ra tat ca nhung baby co gioi tinh la gender
	void filterGender(Baby babies[], String gender)
	{
        for(int i = 0; i < babies.length; i++) {
            if(babies[i].getGender().equals(gender)) {
                System.out.println(babies[i]);
            } 
        }  
	}
	public static void main(String[] args) {
        
	}

}
