import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		 
		String product1 = "Computer";
		String product2 = "Ofice-desk";
		
	    int age = 30;
	    int code = 3290;
	    char gender = 'f';
	    
	    double price1 = 2100.0;
	    double price2 = 650.50;
	    double measure = 53.234567;
	    Locale.setDefault(Locale.US);
	    System.out.println("PRODUCTS: ");
	    System.out.printf("%s, wich price is $ %.2f%n", product1, price1);
	    System.out.printf("%s, wich price is $ %.2f%n", product2, price2);
	    
	    System.out.printf("Record: %d years old code: %d and gender: %s", age, code, gender);
		

	}

}
