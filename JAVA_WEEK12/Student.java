public class Student{
    
    private String msv, hovaten; // Thuộc tính mã sinh viên msv, họ tên hovaten
    private double diem;        // Thuộc tính điểm diem
    
    // Hàm dựng với 3 đối số cho Họ tên, mã sinh viên và điểm
    // chu ý với những biến trùng tên, để phân biệt giũa biến của lớp (class) và biến cục bộ của phương thức sử dụng this.
    public Student(String hoten, String masinhvien, double diem)
    {
        this.msv = masinhvien;
        this.hovaten = hoten;
        this.diem = diem;
    }

    public String getMsv() {
        return this.msv;
    }

    public String getHovaten() {
        return this.hovaten;
    }

    public double getDiem() {
        return this.diem;
    }

    // Phương thức in ra thông tin của sinh viên trên 1 dòng gồm : Mã sinh viên, họ và tên, điểm, Điểm lấy đến 1 chữ số thập phân, ví dụ 8.0
    public void printInfor()
    {
        System.out.print(this.msv + " " + this.hovaten + " ");
        System.out.printf("%.1f", this.diem);
        System.out.println();
        
    }
    
    
}