public class Ex1_NomeEIdade{
 public static void main (String []args){
    Scanner sc = new Scanner(System.in);
 
    String nome;
	int idade;
    
    While(true){	
    System.out.println("Nome: ");
	nome = sc.next();
	if (nome.equals("0")) break;
	
	System.out.println("Idade: ");
	idade = sc.nextint();
	}
	System.out.println("continua.... ");
 }
 sc.close();
}

