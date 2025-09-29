package sistemaBancario;

import sistemaBancario.Conta;

import java.util.Scanner;

public class PrincipalConta {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner cliente = new Scanner(System.in);
		
		Conta cliente1 = new Conta(35849, "Jonatas Simões", 1, 1500.00, 300.00);
		
		Conta cliente2 = new Conta(7859, "Mariana de Paula", 2, 3000.00, 700.00);
		
		Conta cliente3= new Conta(7859, "Pedro Bruno", 1, 100000.00, 78000.00);
		
		Conta cliente4= new Conta (0, null, 0, 0, 0); // aqui vai dar erro, pq o numero só pode ser 1 ou 2.
		
		cliente4.setNome_proprietário("Novo Nome");
		cliente4.consultarSaldo();
		
	    
		System.out.println("----- Saldos Iniciais -----");
       
		cliente1.consultarSaldo();
		cliente2.consultarSaldo();
		
		System.out.println("--------------------------\n");
		
		System.out.println("----- Operação de Depósito (Conta 1) ---");
		double valorDepositado = 300.00;
		System.out.println("Depositando R$ " + valorDepositado + " na conta de " + cliente1.getNome_proprietário() 
		                                                                    + " Número da conta: " + cliente1.getNumero_conta());
		
		cliente1.Depositar(valorDepositado); // se eu não colocar isso, não soma o valor que eu depositei ao valor que está na conta
		cliente1.consultarSaldo(); // se eu não colocar isso, não apresenta o novo saldo (valor depositado + valor já em conta)
		
		System.out.println("\n");
		
		System.out.println("----- Operação de Saque (Conta 2) -----");
		double valorSolicitado = 50.00;
		System.out.println("Tentando sacar R$ " + valorSolicitado + " da conta de " + cliente2.getNome_proprietário() 
		                                                                       + " Número da conta: " + cliente1.getNumero_conta());
		cliente2.Sacar(valorSolicitado);
		cliente2.consultarSaldo();
		
		System.out.println("\n");

		System.out.println("------ Tentativa de Saque Insuficiente (Conta 2) -----");
		valorSolicitado = 3500;
		System.out.println("Tentando sacar R$ " + valorSolicitado + "...");
		cliente2.Sacar(valorSolicitado); // Isso deve falhar, pois o saldo é baixo
		cliente2.consultarSaldo();
		
		System.out.println("\n");
		
		System.out.println("------ Tentativa de Saque Suficiente (Conta 1) -----");
		valorSolicitado = 1500.00;
		System.out.println("Tentando sacar R$ " + valorSolicitado + "...");
		cliente1.Sacar(valorSolicitado); 
		cliente1.consultarSaldo();
		
		System.out.println("\n");
				
		System.out.println("----- Operação de Transferência Insuficiente ---");
		double valorTransferencia = 650.00;
		System.out.println("Transferindo R$ " + valorTransferencia + " de Jonatas Simões número da conta " + cliente1.getNumero_conta() + 
		                   " para Mariana número da conta " + cliente2.getNumero_conta());
		
		cliente1.Transferir(cliente2,650.00);
		
		cliente1.consultarSaldo();
		cliente2.consultarSaldo();
		
		System.out.println("\n");

		
		System.out.println("----- Operação de Transferência Suficiente ---");
		valorTransferencia = 50.00;
		System.out.println("Transferindo R$ " + valorTransferencia + " de Pedro Bruno número da conta " + cliente3.getNumero_conta() + 
		                   " para Jonatas Simões, da conta: " + cliente1.getNumero_conta());
		
		cliente3.Transferir(cliente1,50.00);
		cliente1.consultarSaldo();
		cliente3.consultarSaldo();
		System.out.println("--------------------------------------------");

		
		System.out.println("\n-----. Saldos Finais após Todas as Operações ------");
		
		cliente1.consultarSaldo();
		cliente2.consultarSaldo();
		cliente3.consultarSaldo();
		
		System.out.println("--------------------------------------------");
		
		
		cliente.close();
		}}