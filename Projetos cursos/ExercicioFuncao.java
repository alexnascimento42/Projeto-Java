import java.util.Scanner;

public class ExercicioFuncao {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Insira três numeros: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        
        if (a > b && a > c) {
        	System.out.println("numero maior: " + a);
        }
        else if (b > c) {
        	System.out.println("numero maior: " + b);
        
        }
        else {
        	System.out.println("numero maior: " + c);
        }
        
        sc.close();
	}

}

