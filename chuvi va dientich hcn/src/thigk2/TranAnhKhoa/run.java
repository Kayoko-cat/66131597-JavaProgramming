package thigk2.TranAnhKhoa;

import java.util.Scanner;

public class run {
	/* * TÓM TẮT CÁCH GIẢI:
     * 1. Sử dụng Scanner để nhận tọa độ 2 điểm: (x1, y1) và (x2, y2).
     * 2. Tính độ dài 2 cạnh dựa trên trị tuyệt đối hiệu tọa độ:
     * 3. Khởi tạo đối tượng HinhChuNhat với các tham số vừa nhập.
     * 4. Gọi phương thức tính toán và in kết quả ra màn hình.
     */
	
		public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        System.out.print("Nhập x1, y1 (trên-trái): ");
	        double x1 = sc.nextDouble();
	        double y1 = sc.nextDouble();

	        System.out.print("Nhập x2, y2 (dưới-phải): ");
	        double x2 = sc.nextDouble();
	        double y2 = sc.nextDouble();

	        lop hcn = new lop(x1, y1, x2, y2);

	        System.out.println("Chu vi: " + hcn.tinhChuVi());
	        System.out.println("Diện tích: " + hcn.tinhDienTich());
	        
	        sc.close();
	    }
	

	}