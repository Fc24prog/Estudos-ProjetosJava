package priscilaArrays;
import java.util.ArrayList;

public class DemoArrayList {
	
	public static void main(String[] args)
	{
		ArrayList <String> lista = new ArrayList<>(); // List <TIPO DA MINHA LISTA> 
		
		lista.add("LP1");
		lista.add("LP2");
		lista.add("Fundamentos de Computação");
		lista.add("Algoritmos e Estrutura de dados 1");
		                                  //size - é o tamanho da lista, 
		for (int i=0; i<lista.size();i++) //quando eu to em vetor eu uso vet.leght, aqui em lista eu uso list.size
		{
			System.out.println(lista.get(i));
			lista.remove("Algoritmos e Estrutura de dados 1");
			lista.remove(2); // nesse caso removi a posição 2 - que é o Fundamento da computação
			lista.remove(0);// nesse caso removi a posição 2 - que é LP1
			
	    for(i=0;i<lista.size();i++) 
	    {
			   System.out.println(lista.get(i));
		}
	    System.out.println();
	    System.out.println("**** IMPRESSÃO ****");
	    
	    for (String p: lista) // String - é o tipo ; p- é o objeto ; lista é o array [ArrayList <String> lista = new ArrayList<>()];
	    {
	       System.out.println(p);
	    }}}
	
}
