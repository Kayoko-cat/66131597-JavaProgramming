package bai1_nhapxuat_tinhtong2so;

import java.util.Scanner;
public class tinhtong2so {

	public static void main(String[] args) {
		//khai báo
		double num1, num2, sum;
		//khai bao doi tuong Scanner
		Scanner banPhim = new Scanner(System.in);
		
		//In ra thông tin, mời người dùng nhập số thứ nhất
		System.out.print("Moi nhap so thu nhat: ");
		num1= banPhim.nextDouble();
		//In ra thong tin, mời người dùng nhập số thứ hai
		System.out.print("Moi nhap so thu hai: ");
		num2= banPhim.nextDouble();

        //tinh toan
		sum = num1 + num2;
		// xuat ket qua ra man hinh
	//	System.out.print("Tổng của " + num1 + "và" + num2 + "là" +sum);
	//	System.out.print("Tổng của ");
	//	System.out.print(num1);
	//	System.out.print(" và ");
	//	System.out.print(num2);
	//	System.out.print(" là ");
	//	System.out.print(sum);
		
		System.out.printf("Tổng của %.2f và %.2f là %.2f", num1, num2, sum);
		
	}

}
