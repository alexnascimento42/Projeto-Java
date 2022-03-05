/*faça um programa que calcule o tatorial de um numero inteiro pelo usuario 
ex: 5!= 120 (5x4x3x2x1)
*/

public class Ex6_Fatorial{

public static void main (String []args){
    Scanner sc = new Scanner(System.in);
    
	System.out.println("Fatorial: ");
	int fatorial = sc.nextint();
	int multiplicar = 1;
	
	System.out.print(fatorial +"! =");
	for(int i = fatorial ; i >= 1  ; i-- ){
	     
	     multiplicar = multiplicar * i;
	}
	
	System.out.println(multiplicar);
	}
	sc.close();
}