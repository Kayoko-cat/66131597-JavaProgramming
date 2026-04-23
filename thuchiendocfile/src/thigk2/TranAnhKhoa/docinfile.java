package thigk2.TranAnhKhoa;

public class docinfile {

	
	/* * TÓM TẮT CÁCH GIẢI CÂU 3:
     * 1. Khai báo biến X là ngày sinh của sinh viên (ví dụ: 23).
     * 2. Sử dụng class File để trỏ tới đường dẫn file "data.txt".
     * 3. Dùng Scanner để đọc từng dòng (từng số thực) trong file.
     * 4. In các số ra màn hình và dùng biến boolean để kiểm tra X có tồn tại hay không.
     * 5. Đóng file và thông báo kết quả cuối cùng.
     */
    public static void main(String[] args) {
        // Giả sử ngày sinh của bạn là 23 (theo ngày thi trong đề 23/04)
        double X = 23.0; 
        boolean timThayX = false;
        String fileName = "data.txt"; // Tên file bạn tự tạo

        System.out.println("--- DANH SÁCH SỐ THỰC TỪ FILE ---");

        try {
            File f = new File(fileName);
            Scanner fileScanner = new Scanner(f);

            // Đọc file cho đến khi hết dữ liệu
            while (fileScanner.hasNextDouble()) {
                double so = fileScanner.nextDouble();
                System.out.println(so); // In ra màn hình từng số

                // Kiểm tra xem số vừa đọc có trùng với ngày sinh X không
                if (so == X) {
                    timThayX = true;
                }
            }
            
            fileScanner.close(); // Đóng file sau khi đọc xong

            // Thông báo kết quả tìm kiếm
            System.out.println("--------------------------------");
            if (timThayX) {
                System.out.println("=> Tìm thấy giá trị X (" + X + ") trong danh sách.");
            } else {
                System.out.println("=> KHÔNG tìm thấy giá trị X (" + X + ") trong danh sách.");
            }

        } catch (FileNotFoundException e) {
            System.out.println("Lỗi: Không tìm thấy file " + fileName);
            System.out.println("Hãy đảm bảo bạn đã tạo file data.txt trong thư mục dự án.");
        }
    }
}

	


