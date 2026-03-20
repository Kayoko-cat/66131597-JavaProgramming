package khoataQLNV;

public class run {

	public static void main(String[] args) {
		// test lop nhan vien 
		NhanVien nv1= new NhanVien("001","Tran Anh Khoa",2300000);
	//	nv1.hienThiThongTin();
        System.out.println(nv1.toString());
        
        
        NhanVienVanPhong nvVanPhong1= new NhanVienVanPhong("002","Tran Anh Tay",2300000,3,200000);
        System.out.println(nvVanPhong1.toString());
//        nvVanPhong1.hienThiThongTin();
	}

}
