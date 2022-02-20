package entities;

public class Produto {
	
	public String nome;
	public double pre�o;
	public int quantidade;
	
	public double valorTotalEmEstoque() {
		return pre�o * quantidade;
	}
	public void adicionarProdutos(int quantity){
		   this.quantidade += quantity;
	}
	public void removerProdutos(int quantity){
		   this.quantidade -= quantity;
    }
	public String toString(){
	     return nome
		     + ", $"
			 + String.format("%.2f", pre�o)
			 + ","
			 + quantidade
			 + "units, Total: $"
			 + String.format("%.2f", valorTotalEmEstoque());
	  }

}
