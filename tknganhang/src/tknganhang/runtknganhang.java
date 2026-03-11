package tknganhang;

public class runtknganhang {

	public static void main(String[] args) {
		        tknganhang tk1 = new tknganhang("001");
		        System.out.println("TK1: " + tk1.getSoTaiKhoan() + " - " + tk1.getTenChuTaiKhoan() + " - So du: " + tk1.getSoDu());
		        tknganhang tk2 = new tknganhang("002", "hai phat");
		        System.out.println("TK2: " + tk2.getSoTaiKhoan() + " - " + tk2.getTenChuTaiKhoan() + " - So du: " + tk2.getSoDu());
		        tknganhang tk3 = new tknganhang("003", "Nguyen Van A", 5000);
		        System.out.println("TK3: " + tk3.getSoTaiKhoan() + " - " + tk3.getTenChuTaiKhoan() + " - So du: " + tk3.getSoDu());

		        System.out.println("-----------");
		        tk3.guiTien(2000);
		        tk3.rutTien(1000);
		        System.out.println("So du cuoi cua TK3: " + tk3.getSoDu());
		 }
	}