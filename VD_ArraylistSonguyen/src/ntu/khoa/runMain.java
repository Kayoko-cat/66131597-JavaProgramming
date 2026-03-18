package ntu.khoa;

import java.util.ArrayList;

import java.util.Scanner;

public class runMain {

	public static void main(String[] args) {
		// Khai bao bien danh sach de chua cac so nguyen
		ArrayList<Integer> dsSoNguyen = new ArrayList<Integer>();
		
		//a. nhap 10 phan tu tu ban phim
		Scanner banphim = new Scanner(System.in);
      
		for(int i =0 ;i<10 ;i++) {
		//Nhap 1 phan tu
		   // in ra mot huong dan cho nguoi dung 
	//System.out.println("Moi nhap phan tu thu  " + i + ": ");
			System.out.print("a["+ i +"]=");
		// cho nguoi dung nhap , cat vao bien ta
		Integer tam = banphim.nextInt();
				// them vao danh sach
		dsSoNguyen.add(tam);
	}


	// b.In ra danh sach vua nhap 
		System.out.println("Danh sach vua nhap la ");
		for (int i=0; i < dsSoNguyen.size(); i++ ) {
			// lay gia tri phan tu o vi tri i, cat vao bien tam
			Integer tam = dsSoNguyen.get(i);
			System.out.print(tam + " ");
		}
		//for (Integer x: dsSoNguyen)      {
		//	System.out.print(x + " ");
		//}
		
		// dem so phan tu chan 
		int Soluongphantuchan=0;
		for (Integer x: dsSoNguyen)      {
			System.out.print(x + " ");
			if (x % 2 == 0) Soluongphantuchan= Soluongphantuchan +1;
		}
		System.out.println("so phan tu chan la: " + Soluongphantuchan);
	//	hoac
	//	for (int i=0; i < dsSoNguyen.size(); i++ ) {
	//	Integer tam = dsSoNguyen.get(i);
	//		if (tam % 2 == 0) Soluongphantuchan= Soluongphantuchan +1;

		
	// d. tinh tong cac phan tu : thuat toan cong don
	int Tong = 0;
	for (Integer x: dsSoNguyen)  {
		Tong= Tong +x;
	}
	System.out.println("tong tat ca cac phan tu chan la: " + Soluongphantuchan);
	}
}
