
	import java.util.Scanner;

	public class ComputerTest {
		
		private Computer computers[];
		private int n;
		// Hàm nhập vào số n và một mảng gồm thông tin của n máy tính
		public void input(Scanner scan)
		{
			this.n = Integer.parseInt(scan.nextLine());
			this.computers = new Computer[n];
			for(int i = 0; i < this.n; i++){
				String name = scan.nextLine();
				String manu = scan.nextLine();
				int year = Integer.parseInt(scan.nextLine());
				String detail = scan.nextLine();
				double price = Double.parseDouble(scan.nextLine());
				computers[i] = new Computer(name,manu,year,detail,price);
			}
		}
		
		// in ra các máy tính, mỗi thông tin của một máy tính trên một dòng
		public void output()
		{
			n = this.computers.length;
			for(int i = 0; i < this.n; i++){
				System.out.println(computers[i]);
			}	
		}

		
		
		// Trả về giá trung bình của các máy tính
		public double getAvgPrice()
		{
			n = this.computers.length;
			double sum = 0;
			for(int i = 0; i < this.n; i++) {
				sum += computers[i].getPrice();
			}
			double result = sum / n;
			return result;
		}
		
		// In ra các máy tính có giá cao nhất
		public void getMaxPrice()
		{
			n = this.computers.length;
			double max = -1;
			for(int i = 0; i < this.n; i++) {
				if(computers[i].getPrice() > max) {
					max = computers[i].getPrice();
				}
			}
			for(int i = 0; i < this.n; i++) {
				if(computers[i].getPrice() == max) {
					System.out.println(computers[i]);
				}
			}
			
		}
		
		// In ra các máy tính có nhà sản xuất là Dell
		public void getDell()
		{
			n = this.computers.length;
			for(int i = 0; i < this.n; i++) {
				if(computers[i].getManu().equals("Dell")) {
					System.out.println(computers[i]);
				}
			}

		
		}
		
		// Sắp xếp các máy tính theo chiều giảm dần của giá, và in ra mảng sau khi sắp xếp
		public void sort()
		{
			n = this.computers.length;
			for(int i = 0; i < this.n-1; i++) {
				for(int j = i + 1; j < this.n; j++) {
					if(computers[i].getPrice() < computers[j].getPrice()) {
						Computer tmp = computers[i];
						computers[i] = computers[j];
						computers[j] = tmp;
					}
				}
			}
			for(int i = 0; i < this.n; i++) {
				System.out.println(computers[i]);
			}
		}
		
		public static void main(String[] args) {
		
		}

	}
