/* desenvolva um gerador de tabuada,capaz de gerar a tabuada de qualquer
numero entre 1 e 10.A saida deve ser como o exemplo abaixo:

Tabuada de 5:
5 x 1 = 5
5 x 2 = 10
.....
5 x 10 = 50
 */
public class Ex5_Tabuada{

public static void main (String []args){
    Scanner sc = new Scanner(System.in);
    
	System.out.println("Tabuada: ");
    int tabuada = sc. nexint();
	
	System.out.println("Tabuada de: " + tabuada);
	
	for(int i = 1; i <= 10; i++ ){
	    System.out.println(tabuada + "X" + i + "=" +(tabuada * i));
	}
	
   }
   sc.close();
} 