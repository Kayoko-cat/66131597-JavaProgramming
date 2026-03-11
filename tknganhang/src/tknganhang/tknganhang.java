package tknganhang;

public class tknganhang {


private String soTaiKhoan;
private String tenChuTaiKhoan;
private double soDu;


public tknganhang(String soTaiKhoan) {
    this.soTaiKhoan = soTaiKhoan;
    this.tenChuTaiKhoan = "Chưa xác định";
    this.soDu = 0.0;
}


public tknganhang(String soTaiKhoan, String tenChuTaiKhoan) {
    this.soTaiKhoan = soTaiKhoan;
    this.tenChuTaiKhoan = tenChuTaiKhoan;
    this.soDu = 0.0;
}

public tknganhang(String soTaiKhoan, String tenChuTaiKhoan, double soDu) {
    this.soTaiKhoan = soTaiKhoan;
    this.tenChuTaiKhoan = tenChuTaiKhoan;
    this.soDu = (soDu >= 0) ? soDu : 0.0;
}

public String getSoTaiKhoan() { return soTaiKhoan; }
public String getTenChuTaiKhoan() { return tenChuTaiKhoan; }
public double getSoDu() { return soDu; }

public void setTenChuTaiKhoan(String ten) {
    if (ten != null && ten.length() > 0) {
        this.tenChuTaiKhoan = ten;
    }
}

public boolean guiTien(double soTien) {
    if (soTien > 0) {
        this.soDu += soTien;
        System.out.println("Gửi tiền thành công! Số dư mới: " + this.soDu);
        return true;
    }
    System.out.println("Số tiền gửi phải > 0!");
    return false;
}

public boolean rutTien(double soTien) {
    if (soTien > 0 && soTien <= this.soDu) {
        this.soDu -= soTien;
        System.out.println("Rút tiền thành công! Số dư mới: " + this.soDu);
        return true;
    }
    System.out.println("Số tiền rút không hợp lệ!");
    return false;
}
}