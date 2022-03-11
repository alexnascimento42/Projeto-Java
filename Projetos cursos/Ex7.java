import java.util.Locale;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US); //ler a localidade (pais)
		double x;
		x = sc.nextDouble();
		System.out.println("você digitou: " + x);
		//para incluir a virgula: System.out.printf("você digitou: %.2f%n", x);
		
		sc.close();
	}

}