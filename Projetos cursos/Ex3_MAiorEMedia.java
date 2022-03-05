/*faça um programa que leia 5 numeros e 
informe o maior numero e a media desses numeros.*/

public class Ex3_MAiorEMedia{
 public static void main (String []args){
    Scanner sc = new Scanner(System.in);
	
	int numero;
	int maior = 0;
	int soma = 0;
	int count = 0;
	do{
	System.out.println("Numero: "); 
    numero = sc.nextint();
	soma = soma + numero;
	
	if (numero > maior) maior = numero;
	
	count = count + 1;
	}while(count < 5);
	System.out.println("Maior: " + maior); 
	System.out.println("Soma: " + soma/5); 
	
	}
	sc.close();
}


