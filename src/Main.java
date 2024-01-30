import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
	    int cod = sc.nextInt();
	    int quantidade = sc.nextInt();
		double total;
		if(cod == 1) {
			total = quantidade * 4.00;
		}else if(cod == 2) {
			total = quantidade * 4.50;
		}else if(cod == 3) {
			total = quantidade * 5.00;
	    }
		 else if(cod == 4) {
				total = quantidade * 2.00;
		}else {
				total = quantidade * 1.50;
		}
		System.out.printf("TOTAL %.2f", total);
		
	
		
		sc.close();
	}

}
