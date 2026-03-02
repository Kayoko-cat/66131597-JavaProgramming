package tinhtienluong;
import java.util.Scanner;
public class tinhtienluong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập số giờ làm: ");
        double soGio = sc.nextDouble();

        System.out.print("Nhập lương theo giờ: ");
        double luongGio = sc.nextDouble();

        double tongLuong;
        if (soGio <= 40) {
            tongLuong = soGio * luongGio;
        } else {
            double gioVuot = soGio - 40;
            tongLuong = 40 * luongGio + gioVuot * luongGio * 1.5;
        }

        System.out.println("Tổng lương: " + tongLuong);

        sc.close();
}
}