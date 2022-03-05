/*faça um programa que peça N numeros inteiros, calcule e mostre
a qtd de numeros pares e impares  */

public class Ex4_ParEImpar{

public static void main (String []args){
    Scanner sc = new Scanner(System.in);
    
	int quantNumeros;
	int numero;
	int pares = 0; 
	int impares = 0;
	
	System.out.println("Quantidade de numeros: ");
    quantNumeros = sc.nextint();
    
	int count = 0;
    do{
	   System.out.println("Numero: ");
	   numero = sc.nextint();
	   
	   if(numero % 2 == 0) pares++;
	   else impares ++;
	   // % - mod
	   
	   count++;
	}while(count < quantNumeros);	
	
	System.out.println("Pares: " + pares);
    System.out.println("Impares: " + impares);
   }
    sc.close();
  }

