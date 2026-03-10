

public class ChuNhat {

    // khai bao cac thuoc tinh / du lieu cua lop / truong thong tin
    private double dai;
    private double rong;
    //

    // ham tao (constructor)
    public ChuNhat() {
        dai = 10;
        rong = 5;
    }

    public ChuNhat(double dai, double rong) {
        this.dai = dai;
        this.rong = rong;
    }

    // public ChuNhat(double daiM, double rongM) {
    //     dai = daiM;
    //     rong = rongM;
    // }

    // cac getter
    double getDai() {
        return dai;
    }

    double getRong() {
        return rong;
    }

    // --- cac setter
    //void setDai(double daiM)
    //{
    //    dai = daiM;
    //}

    //void setRong(double rongM)
    //{
    //    rong = rongM;
    //}

    void setDai(double dai)
    {
        this.dai = dai;
    }

    void setRong(double rong)
    {
        this.rong = rong;
    }
   // phuong thuc khac
    public String toString(){
    	// tom tat cac thong tin 
    	// thanh 1 chuoi , de in ra man hinh 
    	String s="Hinh nay , co chieu dai = " ;
    	s = s +dai;
    	s= s+ " va chieu rong = " + rong ;
    	//s= "hinh nay co chieu dai ="+ dai + " va chieu rong ="+ rong;
    	return s;
    }
}