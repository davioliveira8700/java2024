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
			System.out.println("S�O MULTIPLOS");
		}else if(num2 % num1 == 0) {
			System.out.println("S�O MULTIPLOS");
		}else {
			System.out.println("N�O S�O MULTIPLOS");
		}
		sc.close();
	}

}
