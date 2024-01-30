import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		 
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o numero1? ");
		int num1 = sc.nextInt();
		System.out.println("Digite o numero2? ");
		int num2 = sc.nextInt();
		
		if(num1 % num2 == 0) {
			System.out.println("SÃO MULTIPLOS");
		}else if(num2 % num1 == 0) {
			System.out.println("SÃO MULTIPLOS");
		}else {
			System.out.println("NÃO SÃO MULTIPLOS");
		}
		sc.close();
	}

}
