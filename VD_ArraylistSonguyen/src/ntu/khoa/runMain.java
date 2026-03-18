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
	//	System.out.println("Moi nhap phan tu thu  " + i + ": ");
			System.out.print("a["+ i +"]=");
		// cho nguoi dung nhap , cat vao bien ta
		Integer tam = banphim.nextInt();
				// them vao danh sach
		dsSoNguyen.add(tam);
	}

}
}