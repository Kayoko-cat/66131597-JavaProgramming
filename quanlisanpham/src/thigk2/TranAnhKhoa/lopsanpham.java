package thigk2.TranAnhKhoa;

// Lưu ý: Tên file phải trùng với tên class (LopSanPham.java)
public class lopsanpham {
    private String maSP;
    private String tenSP;
    private String loaiSP;
    private double giaBan;

    // Constructor
    public lopsanpham(String maSP, String tenSP, String loaiSP, double giaBan) {
        this.maSP = maSP;
        this.tenSP = tenSP;
        this.loaiSP = loaiSP;
        this.giaBan = giaBan;
    }

    // Getter và Setter
    
    @Override
    public String toString() {
        return "SanPham [maSP=" + maSP + ", tenSP=" + tenSP + ", loaiSP=" + loaiSP + ", giaBan=" + giaBan + "]";
    }

	public String getMaSP() {
		return maSP;
	}

	public void setMaSP(String maSP) {
		this.maSP = maSP;
	}

	public String getTenSP() {
		return tenSP;
	}

	public void setTenSP(String tenSP) {
		this.tenSP = tenSP;
	}

	public String getLoaiSP() {
		return loaiSP;
	}

	public void setLoaiSP(String loaiSP) {
		this.loaiSP = loaiSP;
	}

	public double getGiaBan() {
		return giaBan;
	}

	public void setGiaBan(double giaBan) {
		this.giaBan = giaBan;
	}
}