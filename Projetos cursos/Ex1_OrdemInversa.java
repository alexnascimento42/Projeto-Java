public class Ex1_OrdemInversa{

  public static void main (String []args){
  
    int[] vetor = {0,1,3,5,4,8};
	//length é o tamanho do vetor.
	System.out.println("vetor: ");
	int count = 0;
	while (count < (vetor.length)){
	  System.out.print(vetor[count] + " ");
	   count++;
	}
	
	System.out.println("\nVetor: ");
	for (int i = vetor.length - 1; i >= 0; i--){
	
	      System.out.print(vetor[i] + " ");
	}
  }
}