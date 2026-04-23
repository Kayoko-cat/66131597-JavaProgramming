package thigk2.TranAnhKhoa;

import java.io.File; // Cần thêm dòng này
import java.io.FileNotFoundException; // Cần thêm dòng này
import java.util.Scanner; // Cần thêm dòng này

public class docinfile {

    /* * TÓM TẮT CÁCH GIẢI CÂU 3:
     * 1. Khai báo biến X là ngày sinh của sinh viên (23).
     * 2. Sử dụng class File trỏ tới file "text.txt".
     * 3. Dùng Scanner để đọc từng số thực từ file.
     * 4. In các số và kiểm tra X có tồn tại hay không.
     * 5. Đóng file và xuất kết quả.
     */
    public static void main(String[] args) {
        double X = 23.0; 
        boolean timThayX = false;
        // Đổi tên file thành text.txt cho đúng với file bạn đã tạo
        String fileName = "text.txt"; 

        System.out.println("--- DANH SÁCH SỐ THỰC TỪ FILE ---");

        try {
            // Sửa dòng này: Truyền fileName vào trong File()
            File f = new File(fileName);
            Scanner fileScanner = new Scanner(f);

            while (fileScanner.hasNextDouble()) {
                double so = fileScanner.nextDouble();
                System.out.println(so); 

                if (so == X) {
                    timThayX = true;
                }
            }
            
            fileScanner.close(); 

            System.out.println("--------------------------------");
            if (timThayX) {
                System.out.println("=> Tim thay gia tri X (" + X + ") trong danh sach.");
            } else {
                System.out.println("=> KHONG tim thay gia tri X (" + X + ") trong danh sach.");
            }

        } catch (FileNotFoundException e) {
            System.out.println("Loi: Khong tim thay file " + fileName);
            System.out.println("Hay dam bao file text.txt nam o thu muc goc cua project.");
        }
    }
}