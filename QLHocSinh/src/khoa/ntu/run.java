package khoa.ntu;

import java.util.ArrayList;
import java.util.Scanner;

public class run {

	public static void main(String[] args) {
		//2.a tạo mới 2 học sinh, hard code dữ liệu
		
		HocSinh hs1 = new HocSinh();
		String TenHS1 =" Trần Văn A";
		hs1.setTenHS(TenHS1);
		short tuoiHS1 = 10;
		hs1.setTuoiHS(tuoiHS1);
		String lopHS1 ="8A-12";
		hs1.setLopHS(lopHS1);
		
		HocSinh hs2= new HocSinh("Trần Văn B",(short) 12 , "6C");
		
		// IN ra màn hình
	 System.out.print(hs1.toString());
	// System.out.print(hs2.toString());
		
	 System.out.println("\ntên của hs 2 là: " + hs2.getTenHS());
	 System.out.println("tên của hs 2 là: " + hs2.getTuoiHS());
	 System.out.println("tên của hs 2 là: " + hs2.getLopHS());
	 
	 // nhập dữ liệu từ bàn phím
	 Scanner banphim= new Scanner(System.in);
	 // nhập dữ liệu cho học sinh thứ 3
	 HocSinh hs3= new HocSinh();
	 // hỏi user nhập vào tên
	 System.out.print("Mời nhập tên của học sinh thứ 3: "); // in ra HD và đợi
	 String tenHS3 = banphim.nextLine();
	 hs3.setTenHS(tenHS3);

	 // gói vào biến hs3
	 System.out.print("Mời nhập tuổi của học sinh thứ 3: ");
	 short tuoiHS3 = banphim.nextShort();
	 hs3.setTuoiHS(tuoiHS3);
	 
	 banphim.nextLine();
	 System.out.print("Mời nhập lớp của học sinh thứ 3: ");
	 String lopHS3 = banphim.nextLine();
	 hs3.setLopHS(lopHS3);
	 
	 // in ra học sinh ra màn hình
	 System.out.print(hs3.toString());
	 
	// nhập danh sách N học sinh
	 ArrayList<HocSinh> dsHocSinh = new ArrayList<HocSinh>();
	 // nhập N
	 int N=3; // sinh viên code nhập N từ bàn phím
	 for (int i=0; i<N;i++) {
	
		 
		 // nhập dữ liệu cho học sinh thứ i
		 HocSinh hsi= new HocSinh();
		 // hỏi user nhập vào tên
		 System.out.print("Mời nhập tên của học sinh thứ : " +i); // in ra HD và đợi
		 String tenHSi = banphim.nextLine();
		 hsi.setTenHS(tenHSi);

		 // gói vào biến hs3
		 System.out.print("Mời nhập tuổi của học sinh thứ :  " + i);
		 short tuoiHSi = banphim.nextShort();
		 hsi.setTuoiHS(tuoiHSi);
		 
		 banphim.nextLine();
		 System.out.print("Mời nhập lớp của học sinh thứ : "+ i);
		 String lopHSi = banphim.nextLine();
		 hsi.setLopHS(lopHSi);
		 dsHocSinh.add(hsi);
	 }
	 // in ra màn hình
	 for (int i=0; i<N;i++) {
		 System.out.println(dsHocSinh.get(i).toString());
	 }
	}
}
