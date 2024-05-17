
public class Computer {

    // khai báo các thuộc tính của một computer
    // tạo tất cả các hàm dựng (có đối và không đối)
    // xây dựng các hàm getter, setter phù hợp với các thuộc tính
    // 
	private String name;
	private String manu;
	private int year;
	private String detail;
	private double price;
	
	public Computer() {

	}

	

	public String getName() {
		return this.name;
	}
	public String getManu() {
		return this.manu;
	}
	public int getYear() {
		return this.year;
	}

	public double getPrice() {
		return this.price;
	}

	public String getDell() {
		return this.detail;
	}

	

	public Computer(String name, String manu, int year, String detail, double price) {
		this.name = name;
		this.manu = manu;
		this.year = year;
		this.detail = detail;
		this.price = price;
	}

    // Hàm trả về một chuỗi thông tin của một máy tính, mỗi thuộc tính cách nhau một dấu cách
	@Override
	public String toString() {
		return this.name + " " + this.manu + " " + this.year + " " + this.detail + " " + this.price;
	}
}
