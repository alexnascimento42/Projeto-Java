package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Produto;

public class Programa {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Produto produto = new Produto();
		System.out.println("Dados do produto: ");
		System.out.print("Nome: ");
		produto.nome = sc. nextLine();
		System.out.print("Pre�o: ");
		produto.pre�o = sc.nextDouble();
		System.out.print("Qunatidade: ");
		produto.quantidade = sc.nextInt();
		
		System.out.println();
	     System.out.println("Produto data: " + produto);
		 
		 System.out.println();
		 System.out.println("Produtos em estoque: ");
		 int quantity = sc.nextInt();
		 produto.adicionarProdutos(quantity);
		 
		 System.out.println();
	     System.out.println("Dados atualizados: " + produto);
		 
		 System.out.println();
		 System.out.println("Numeros de produtos removidos do estoque: ");
		 quantity = sc.nextInt();
		 produto.removerProdutos(quantity);
		 
		 System.out.println();
	     System.out.println("Dados atualizados: " + produto);
	
		sc.close();
	}
    
}
