import java.util.Locale;
import java.util.Scanner;

public class EstruturaRepeticao {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

	int x = sc.nextInt();
	int impares = 0;
	for(int i = 0; i <= x; i++) {
		if(i % 2 !=0) {
			System.out.println(i);
		}
	}
	
		
		sc.close();
	}

}
