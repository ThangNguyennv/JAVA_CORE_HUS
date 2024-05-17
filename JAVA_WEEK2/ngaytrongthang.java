/**
 * Chương trình tính số ngày trong một tháng của một năm với
 * tháng/năm là các số nguyên tương ứng nhận từ đối dòng lệnh
 * Bổ sung thêm các hàm/phương thức khác nếu cần thiết
 * */
public class ngaytrongthang{
     
    public static int SoNgay(int thang, int nam){
		if(nam%4==0&&nam%100!=0 || nam%400==0){
			
			if(thang==2)
				return 29;
			else if(thang==1||thang==3||thang==5||thang==7||thang==8||thang==10||thang==12)
				return 31;
			else
				return 30;
		 }
		else{
			if(thang==2)
				return 28;
			else if(thang==1||thang==3||thang==5||thang==7||thang==8||thang==10||thang==12)
				return 31;
			else
				return 30;
		}
     }
     
     public static void main(String args[]){
        int thang = Integer.parseInt(args[0]);
		int nam = Integer.parseInt(args[1]);
		boolean ok = false;
		if(nam>0 && thang>0 && thang>=1 && thang <=12){
			int res = SoNgay(thang,nam);
			System.out.println(res);
		}
		else
			System.out.println("Incorrect!");
     }
    
}