import java.util.Locale;
import java.util.Scanner;

public class EstruturaRepeticao {

	public static void main(String[] args) {
        
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

	int n = sc.nextInt();
	for(int i = 0; i < n; i++) {
		
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		
		
		double div = a / b ;
		if(b == 0) {
			System.out.println("Imposivel dividir");
		}
		
		System.out.printf("%.1f", div);
	}
		
		sc.close();
	}

}
