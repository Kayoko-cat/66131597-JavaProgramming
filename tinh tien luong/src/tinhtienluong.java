package tinhtienluong
import java.util.Scanner;

public class tinhtienluong {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
				
		System.out.print("nhập số giờ làm ");
        double sogio = sc.nextDouble();
		System.out.print("nhập lương theo giờ ");
		double luonggio =sc.nextDouble();
		double tongluong;
		  if (sogio <= 40) {
	            tongluong = sogio * luonggio;
	        } else {
	            double giovuot = sogio - 40;
	            tongluong = 40 * luonggio + giovuot * luonggio * 1.5;
	            
	        }

	}

}
