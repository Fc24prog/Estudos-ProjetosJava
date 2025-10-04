package priscilaArrays;

import java.util.ArrayList;

public class EstudanteLista {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub           
		
     ArrayList<Estudante> aluno= new ArrayList<>();
	 
	 Estudante numero1 = new Estudante("Alice Silva", 20, 1001);
     Estudante numero2  = new Estudante("Bruno Mendes", 22, 1002);
     Estudante numero3  = new Estudante("Carla Souza", 19, 1003);
     Estudante numero4  = new Estudante("Claudia Negona", 32, 20251003);

     
     aluno.add(numero1); // Adiciona Alice
     aluno.add(numero2); // Adiciona Bruno
     aluno.add(numero3); // Adiciona Carla
     aluno.add(numero4);
     
     System.out.println("--- ADICIONANDO ESTUDANTES ---");
     System.out.println("Total de estudantes após a adição: " + aluno.size());
     
	
   for (Estudante es : aluno) 
   {
    System.out.println(es); 
   }
   System.out.println(" \n ---------------------------------------------- ");
	
   Estudante estudanteBuscado = aluno.get(1);  // é o Bruno que tá na posição 1
    
   
   if (estudanteBuscado != null)
   {
	   System.out.println("Estudante " + numero2.getNome_estudante() + " foi achado com sucesso.");
       System.out.println(estudanteBuscado);  // apresento os dados do estudante encontrado
   }
   
   System.out.println(" \n ---------------------------------------------- ");


   Estudante foiRemovido = aluno.remove(2);
   
   if (foiRemovido != null) 
   {
	   System.out.println("Estudante " + numero3.getNome_estudante() + " foi removido com sucesso.");
	   System.out.println(foiRemovido);
    }
   else 
   {
    System.out.println("Estudante não encontrado na lista.");
   }
   
   System.out.println("Total de estudantes após a remoção: " + aluno.size());


        System.out.println("\n--- EXIBINDO LISTA APÓS REMOÇÃO ---");

    for (Estudante es : aluno) 
   	{
    System.out.println(es);
    }}}
