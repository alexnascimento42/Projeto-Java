//lendo uma variavel String

import java.util.Scanner;

public class Leitura {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String x;
		x = sc.next();
		System.out.println("você digitou: " + x);

		sc.close();
	}

}



