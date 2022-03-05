public class Ex2_Nota{
 public static void main (String []args){
    Scanner sc = new Scanner(System.in);
	
	int nota;
	
	System.out.println("Nota: ");
	nota = sc.nextint();
	
	while(nota < 0 | nota > 10){
	System.out.println("Nota invalida! Digite novamente"); 
    nota = sc.nextint();	
	}
	
	}
	sc.close();
}


