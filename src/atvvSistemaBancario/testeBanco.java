package atvvSistemaBancario;

import java.util.Scanner;

public class testeBanco {

	static Scanner entrada = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		char opMenu, opFunc;
		
		SistemaBancarioBr c = new SistemaBancarioBr();
		
		System.out.println("\nSeja Bem-vindo ao Banco AkiBank! O melhor Banco do Brasil! ");
		
		do {
			
			System.out.println("\n*****Menu*****");
			System.out.println("\n[1]-Abrir Conta \n[2]-Encerrar Conta \n[3]-Consultar Saldo \n[4]-Saque \n[5]-Deposito \n\n[9]-Sair");
			System.out.print("\nOpção digitada: ");
			opMenu = entrada.next().charAt(0);
			
			switch (opMenu) {
			case '1':
				c.abrirConta();
				break;
			case '2':
				c.encerrarConta();
				break;
			case '3':
				c.consultarSaldo();
				break;
			case '4':
				do {
					c.debitarSaldo();
					
					System.out.println("\nDeseja realizar outro Saque? [S]im ou [N]ão");
					System.out.print("\nOpção digitada: ");
					opFunc = entrada.next().toUpperCase().charAt(0);
					
				} while (opFunc != 'N');
				
				break;
			case '5':
				do {
					c.creditarSaldo();
					
					System.out.println("\nDeseja realizar outro Deposito? [S]im ou [N]ão");
					System.out.print("\nOpção digitada: ");
					opFunc = entrada.next().toUpperCase().charAt(0);
					
				} while (opFunc != 'N');
				break;
			case '9':
				break;

			default:
				System.out.println("\nOpção inválida! Saindo...");
				break;
			}
			
			entrada.nextLine();
			entrada.nextLine();
			
		} while (opMenu != '9');
		
		System.out.println("\nSaindo...");
		System.exit(0);
		
	}
}
