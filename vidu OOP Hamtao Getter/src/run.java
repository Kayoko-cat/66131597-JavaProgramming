
public class run {

	public static void main(String[] args) {
		// tao moi doi tuong
		ChuNhat cn1 = new ChuNhat();
		// tao doi tuong cn1 dai =10 rong= 5
		ChuNhat cn2 = new ChuNhat(20,15);
		// gia su ta muon lay du lieu cua cn1 
		// de in ra man hinh
		double cn1_dai = cn1.getDai();
		double cn1_rong = cn1.getRong();
		
		
		System.out.print("hinh cn1 co chieu dai la: ");
		System.out.print(cn1_dai);
		System.out.print("\nhinh cn1 co chieu rong la " + cn1_rong);
		// thay doi chieu dai cua cn1
		cn1.setDai(50);
		System.out.print("\nsau khi thay doi chieu dai \n");
		cn1_dai = cn1.getDai();
		 cn1_rong = cn1.getRong();
		System.out.print("hinh cn1 co chieu dai la: ");
		System.out.print(cn1_dai);
		System.out.println("\nhinh cn1 co chieu rong la " + cn1_rong);
		
		// su dung phuong thuc toString
		System.out.print(cn1.toString());
	}
}
