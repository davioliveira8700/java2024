import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
        
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int min = sc.nextInt();
		double valor = 50.0;
		if(min > 100) {
			valor = valor + (min - 100) *2.0;
		}
		System.out.printf("Valor da conta %.2f R$", valor);
	}

}
