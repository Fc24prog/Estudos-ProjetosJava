package primeirosPassos;

import java.util.Scanner;

public class Lista2Exer8Nelio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc= new Scanner(System.in);
		
		float salario;
		float imposto_renda=0.0f; // imposto  tem que inicializar com 0, pois se não entrar nenhum
		
		System.out.println("Entre com o salario: R$ "); 
		salario=sc.nextFloat();
		
		if  (salario > 4500.00f)
        {
			imposto_renda+= (salario - 4500.00f)* 0.28f;
			salario = 4500.00f;
        } 	
		 if  (salario > 3000.00f)
        {
    			imposto_renda+= (salario - 3000.00f)* 0.18f;
    			salario = 3000.00f;
    			
         } if  (salario > 2000.00f)
         {
     			imposto_renda+= (salario - 2000.00f)* 0.08f;
     			salario = 2000.00f;
     	 }
         else  if (imposto_renda == 0.0f) 
         {
             System.out.println("Isento");
         } 
             System.out.printf("R$ %.2f\n", imposto_renda);
              sc.close();	}}
