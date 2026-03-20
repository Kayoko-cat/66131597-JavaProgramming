package khoataQLNV;

public class NhanVien {
  // thuoc tinh 
 private String maNV;
 private String HoTen;
 private double LuongCoBan;
 // ham tao
 public NhanVien(String maNV, String hoTen, double luongCoBan) {
	super();
	this.maNV = maNV;
	HoTen = hoTen;
	LuongCoBan = luongCoBan;
 }
 public NhanVien() {
	super();
 }
 
 public double tinhLuong() {
	 return LuongCoBan;
 }
 @Override
 public String toString() {
	 String chuoiXuat="";
	 chuoiXuat= chuoiXuat + "Ma NV : " + this.maNV;
	 chuoiXuat= chuoiXuat + "\nHo ten : " + this.HoTen;
	 chuoiXuat= chuoiXuat + "\nLuong co ban : " + this.LuongCoBan;
     return chuoiXuat;

	// return "NhanVien [maNV=" + maNV + ", HoTen=" + HoTen + ", LuongCoBan=" + LuongCoBan + "]";
 }
 
  public void hienThiThongTin() {
	  System.out.println("MA NV: " + maNV);
	  System.out.println("Ho ten: " + HoTen);
	  System.out.println("Luong Co ban: " + LuongCoBan);
  }
  
}