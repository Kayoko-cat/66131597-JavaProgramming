package khoa.ntu;

import java.util.ArrayList;
import java.util.Scanner;

public class run {

    public static void main(String[] args) {

//        // 1. Tạo 2 học sinh (hard code)
//        HocSinh hs1 = new HocSinh();
//        hs1.setTenHS("Trần Văn A");
//        hs1.setTuoiHS((short) 10);
//        hs1.setLopHS("8A-12");
//
//        HocSinh hs2 = new HocSinh("Trần Văn B", (short) 12, "6C");
//
//        System.out.println(hs1.toString());
//        System.out.println("Tên hs2: " + hs2.getTenHS());
//        System.out.println("Tuổi hs2: " + hs2.getTuoiHS());
//        System.out.println("Lớp hs2: " + hs2.getLopHS());
//
//        // 2. Nhập học sinh thứ 3
//        Scanner banphim = new Scanner(System.in);
//
//        HocSinh hs3 = new HocSinh();
//
//        System.out.print("Nhập tên hs3: ");
//        hs3.setTenHS(banphim.nextLine());
//
//        System.out.print("Nhập tuổi hs3: ");
//        hs3.setTuoiHS(banphim.nextShort());
//        banphim.nextLine();
//
//        System.out.print("Nhập lớp hs3: ");
//        hs3.setLopHS(banphim.nextLine());
//
//        System.out.println(hs3.toString());
//
//        // 3. Nhập danh sách N học sinh
        ArrayList<HocSinh> dsHocSinh = new ArrayList<HocSinh>();

        System.out.print("Nhập số lượng học sinh: ");
        Scanner banphim = new Scanner(System.in);
		int N = banphim.nextInt();
        banphim.nextLine();

        for (int i = 0; i < N; i++) {
            HocSinh hsi = new HocSinh();

            System.out.print("Mời nhập tên của học sinh thứ " + (i +1) +": ") ; // in ra HD và đợi	
   		 String tenHSi = banphim.nextLine();
   		 hsi.setTenHS(tenHSi);

   		 // gói vào biến hs3
   		 System.out.print("Mời nhập tuổi của học sinh thứ " +( i+1) +": ");
   		 short tuoiHSi = banphim.nextShort();
   		 hsi.setTuoiHS(tuoiHSi);
   		 
   		 banphim.nextLine();
   		 System.out.print("Mời nhập lớp của học sinh thứ " +  (i+1) +": ");
   		 String lopHSi = banphim.nextLine();
   		 hsi.setLopHS(lopHSi);
   		 

            dsHocSinh.add(hsi);
        }

        // 4. In danh sách ban đầu
        System.out.println("\nDanh sách học sinh:");
        for (int i = 0; i < dsHocSinh.size(); i++) {
            System.out.println(dsHocSinh.get(i).toString());
        }

        // 5. Thêm học sinh
        HocSinh hsThem= new HocSinh();

   	 System.out.print("Nhập tên hs thêm: ");
   	 hsThem.setTenHS(banphim.nextLine());

   	 System.out.print("Nhập tuổi hs thêm: ");
   	 hsThem.setTuoiHS(banphim.nextShort());
   	 banphim.nextLine();

   	 System.out.print("Nhập lớp hs thêm: ");
   	 hsThem.setLopHS(banphim.nextLine());

   	 dsHocSinh.add(hsThem);

   	 // in danh sách sau khi thêm
   	System.out.println("\nDanh sách sau khi thêm:");

   	 for (int i = 0; i < dsHocSinh.size(); i++) {
   	     System.out.println(dsHocSinh.get(i).toString());
   	 }
   	 // xóa học sinh tên Hoa
   	 for (int i=0; i<N;i++) {
   		 HocSinh hsTim= dsHocSinh.get(i);
   		 if (hsTim.getTenHS()==("Hoa")) {
   			 dsHocSinh.remove(hsTim);
   			 break;
   		 }
   	 }
   	 //in ra
   	 for (int i=0; i<N;i++) {
   		 System.out.println(dsHocSinh.get(i).toString());
   	 }
   	
   	}
   }