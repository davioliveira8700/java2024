import java.util.Locale;
import java.util.Scanner;

public class EstruturaRepeticao {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

	int x = sc.nextInt();
	int in =0;
	int out =0;
	int y = 0;

	for(int i = 0; i < x; i++) {
		y = sc.nextInt();
		
		if(y >= 10 && y <=20) {
			 in += + 1;
			
		}else if(y < 10 || y >20) {
			 out += +1;
			
		}
	
	}
	
	System.out.println("in = " + in);
	System.out.println("out = " + out);
	
		
		sc.close();
	}

}
