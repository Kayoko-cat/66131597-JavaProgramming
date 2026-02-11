package btsinhvien;

public class thongtin	 {
	  public static void main(String[] args) {
		// Tạo đối tượng sinhVien1 từ lớp SinhVien
		  Sinhvien sinhVien1 = new Sinhvien();
	        sinhVien1.ten = "Nguyễn Văn A";
	        sinhVien1.tuoi = 20;
	        sinhVien1.maSV = "SV001";
		  
		  
	     // Tạo đối tượng sinhVien2
	        Sinhvien sinhVien2 = new Sinhvien();
	       	sinhVien2.ten = "Trần Thị B";
	        sinhVien2.tuoi = 21;
	        sinhVien2.maSV = "SV002";
	   
	      //  // Gọi phương thức
	        sinhVien1.hocBai("Toán");
	        sinhVien2.hocBai("Văn");
	  }
}
