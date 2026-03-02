package quydoitiente;
import java.util.Scanner;
public class quydoitiente {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
		
	System.out.print("tien usd : ");
	double tienusd= sc.nextDouble();
	
	System.out.print("tien eur : ");
	double tieneur= sc.nextDouble();

    
	double usd  = tienusd * 23500;
    double eur = tieneur * 27000;
    System.out.println("vnd sang usd : " + usd);
    System.out.println("vnd sang eur : " + eur);
    sc.close();
    
	}

}
