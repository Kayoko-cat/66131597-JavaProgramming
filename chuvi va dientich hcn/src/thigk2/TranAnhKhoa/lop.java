package thigk2.TranAnhKhoa;

public class lop {
 private double x1, y1, x2 , y2;
//Constructor
 public lop(double x1, double y1, double x2, double y2) {
     this.x1 = x1;
     this.y1 = y1;
     this.x2 = x2;
     this.y2 = y2;
 }
 // Phương thức tính chiều dài
 private double getChieuDai() {
     return Math.abs(x1 - x2);
 }

 // Phương thức tính chiều rộng
 private double getChieuRong() {
     return Math.abs(y1 - y2);
 }
//Phương thức tính chu vi
 public double tinhChuVi() {
     return 2 * (getChieuDai() + getChieuRong());
 }

 // Phương thức tính diện tích
 public double tinhDienTich() {
     return getChieuDai() * getChieuRong();
 }
}
