package priscilaArrays;

import java.util.Scanner;

import priscilaArrays.Cliente;

public class CadastroCliente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		final int MAX_CLIENTES = 50;
		
		Cliente[] clientes = new Cliente[MAX_CLIENTES];
		
		int totalClientes = 0; // Contador para vê quantos clientes já foram cadastrados
		
		
		boolean rodando = true;

        while (rodando) 
        {
            System.out.println("\n===== MENU CLIENTE =====");
            System.out.println("1 - Cadastrar Cliente ");
            System.out.println("2 - Buscar cliente pelo nome ");
            System.out.println("3 -  Exibir dados dos clientes");
            System.out.println("4 - Sair: ");
            System.out.print("Escolha uma opção: ");
            int opcao = sc.nextInt();
            sc.nextLine(); // limpar buffer

            switch (opcao)
            {
            case 1:     
            	if (totalClientes >= MAX_CLIENTES) 
               {
            	   System.out.println("ERRO: Limite máximo de clientes atingido!");
                   break;
               }
            
               int codigo = totalClientes + 1;
               System.out.println("Código do Cliente: " + codigo); 
                	    
                System.out.print("Entre com o nome do cliente: "); // // essa variavel nome - é uma variavel local que armazena 
                String nome = sc.nextLine(); // temporariamente os dados que vou entrar via teclado
                	    
                System.out.print("Entre com o CPF do cliente : ");
                String cpf = sc.nextLine();

                System.out.print("Entre com o Telefone: ");
                String telefone = sc.nextLine();
                
                Cliente novoCliente = new Cliente(codigo, nome, cpf, telefone);
                clientes[totalClientes] = novoCliente;
                totalClientes++; 
                System.out.println("-> Cliente '" + nome + "' cadastrado com sucesso!");
                break;
            case 2:
                    if (totalClientes == 0)
                    {
                        System.out.println("Nenhum cliente cadastrado para buscar.");
                        break;
                    }
                    
                   System.out.print("Digite o nome ou parte do nome do cliente para buscar: ");
                   String termoBusca = sc.nextLine(); 
                    
                    int encontrados = 0;
                    System.out.println("\n--- Resultados da Busca ---");
                    
                    for (int i = 0; i < totalClientes; i++)
                    {
                        String nomeDoCliente = clientes[i].getNome_cliente();
                        
                        // toLowerCase - não faz a diferenciação de MAIùscula para MINUScula;
                        if (nomeDoCliente.toLowerCase().contains(termoBusca.toLowerCase())) 
                        { 
                            // Se encontrado, exibe os dados
                            System.out.println(clientes[i].toString()); 
                            encontrados++;
                        }}
                    if (encontrados == 0) 
                    {
                        System.out.println("Nenhum cliente encontrado.");
                    } 
                    else 
                    {
                        System.out.println("Total de clientes encontrados: " + encontrados);
                    }
                    
                    break; 
             case 3: 
                if (totalClientes == 0)
                {
                    System.out.println("Nenhum cliente cadastrado para exibir.");
                    break;
                }

                System.out.println("\n--- Lista de Clientes Cadastrados (Total: " + totalClientes + ") ---");

                for (int i = 0; i < totalClientes; i++) 
                {
                    
                    System.out.println(clientes[i].toString()); 
                 }
                System.out.println("---------------------------------------------------------");
                break;
                
            case 4:
                System.out.println("Encerrando o programa...");
                rodando = false;
                break;

            default:
                System.out.println("Opção inválida, tente novamente.");   
                    
            }
            }
        sc.close();}}
/* O método .contains() verifica se uma String está contida dentro de outra String.Por que é necessário? 
Ele permite que o usuário digite apenas uma parte do nome. Se o cliente for "Maria da Silva" e o usuário digitar "Maria", a busca encontra.
Se o usuário digitar "Silva", a busca também encontra.*/
        
		
		
	