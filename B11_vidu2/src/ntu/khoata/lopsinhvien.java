package ntu.khoata;
import java.util.ArrayList;
import java.util.List;

// Lớp SinhVien
class SinhVien {
    private String maSV;
    private String hoTen;
    private double diemTB;
    
    public SinhVien(String maSV, String hoTen, double diemTB) {
        this.maSV = maSV;
        this.hoTen = hoTen;
        this.diemTB = diemTB;
    }
    
    // Getter
    public String getMaSV() { return maSV; }
    public String getHoTen() { return hoTen; }
    public double getDiemTB() { return diemTB; }
    
    
    public String toString() {
    	String res = "Ban: " + hoTen + " co mssv la " + maSV + " co diem trung binh la " + diemTB;
        return res;
    }
}
