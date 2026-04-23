package thigk2.TranAnhKhoa;
import java.util.ArrayList;

import java.util.Scanner;
import java.util.Scanner;



public class run {
	/* * TÓM TẮT CÁCH GIẢI CÂU 2:
     * 1. Xây dựng lớp SanPham với các thuộc tính: mã, tên, loại và giá bán.
     * 2. Sử dụng ArrayList để quản lý danh sách sản phẩm.
     * 3. Hard-code 3 sản phẩm ban đầu và dùng vòng lặp để in danh sách.
     * 4. Dùng Scanner để nhập thêm sản phẩm mới từ người dùng.
     * 5. Duyệt danh sách bằng vòng lặp for-each và dùng equals() 
     * để lọc các sản phẩm thuộc loại "Thực phẩm chức năng".
     */
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<lopsanpham> ds = new ArrayList<>();

        // 1. Hard-code 3 sản phẩm ban đầu
        ds.add(new lopsanpham("SP01", "Sua Milo", "Thuc pham", 15000));
        ds.add(new lopsanpham("SP02", "Dau ca", "Thực phẩm chức năng", 120000));
        ds.add(new lopsanpham("SP03", "Banh quy", "Thuc pham", 20000));
	
     // 2. Nhập thêm 1 sản phẩm mới
        System.out.println("--- Nhap thong tin san pham moi ---");
        System.out.print("Ma SP: "); String ma = sc.nextLine();
        System.out.print("Ten SP: "); String ten = sc.nextLine();
        System.out.print("Loai SP: "); String loai = sc.nextLine();
        System.out.print("Gia ban: "); double gia = sc.nextDouble();
    
        // Them vao danh sach
        ds.add(new lopsanpham(ma, ten, loai, gia));
	
	// 3. In lai toan bo danh sach (Dung ham toString da viet o LopSanPham)
    System.out.println("\n--- Danh sach tat ca san pham ---");
    for (lopsanpham sp : ds) {
        System.out.println(sp.toString());
    }

    // 4. In cac san pham co loai la "Thực phẩm chức năng"
    System.out.println("\n--- San pham la 'Thực phẩm chức năng' ---");
    boolean check = false;
    for (lopsanpham sp : ds) {
        // equalsIgnoreCase de so sanh khong phan biet hoa thuong
        if (sp.getLoaiSP().equalsIgnoreCase("Thực phẩm chức năng")) {
            System.out.println(sp.toString());
            check = true;
        }
    }
    
    if (!check) {
        System.out.println("Khong co san pham nao thuoc loai nay.");
    }

    sc.close();
}
}

	