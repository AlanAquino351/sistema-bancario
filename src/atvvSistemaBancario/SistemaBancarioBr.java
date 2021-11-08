package atvvSistemaBancario;

import java.util.Scanner;

public class SistemaBancarioBr implements Comandos {

	static Scanner entrada = new Scanner(System.in);

	private Boolean statusConta;
	private double saldo;
	private int tipoConta;
	
	
	@Override
	public void abrirConta() {

		if (this.getStatusConta() == false) {
			
			char op;

			System.out.println("\n*****Banco AkiBank*****");
			System.out.println("\nDeseja abrir conta: \n[1]-Corrente \n[2]-Poupan�a \n[3]-Conjunta \n\n[9]-Sair");
			System.out.print("\nOp��o digitada: ");
			op = entrada.next().charAt(0);

				switch (op) {
				case '1': {
					this.setTipoConta(1);
					this.setStatusConta(true);
					System.out.println("\nConta Corrente aberta com sucesso! :)");
					break;
				}
				case '2': {
					this.setTipoConta(2);
					this.setStatusConta(true);
					System.out.println("\nConta Poupan�a aberta com sucesso! :)");
					break;
				}
				case '3': {
					this.setTipoConta(3);
					this.setStatusConta(true);
					System.out.println("\nConta Conjunta aberta com sucesso! :)");
					break;
				}
				case '9': {
					System.out.println("\nSaindo....");
					break;
				}
				default:
					System.out.println("\nOp��o inv�lida! Saindo...");
				}
			
		} else {
			System.out.println("\n*****Banco AkiBank*****");
			System.out.println("\nVoc� j� tem uma conta criada! :)");
		}
	}

	@Override
	public void encerrarConta() {
		char op;

		if (this.getStatusConta() == true) {
			System.out.println("\n*****Banco AkiBank*****");
			System.out.println("\nTem certeza que deseja encerrar sua conta? [S]im ou [N]�o");
			System.out.print("\nOp��o digitada: ");
			op = entrada.next().toUpperCase().charAt(0);

			if (op == 'S') {
				
				if (this.getSaldo() >= 0) {
					System.out.println("\n*****Encerrando Conta*****");
					System.out.println("\nSaldo atual: " + this.getSaldo());
					this.setSaldo(0);
					this.setTipoConta(4);
					this.setStatusConta(false);
					System.out.println("\nSua conta foi encerrada! :(");
				} else {
					System.out.println("\nN�o foi poss�vel encerrar sua conta, pois seu saldo est� negativo! ");
					System.out.println("\nSaldo atual: " + this.getSaldo());
				}
				
			} else if (op == 'N') {
				System.out.println("\nQue bom que mudou de ideia :)");
				System.out.println("\nSaindo...");
			} else {
				System.out.println("\nOp��o inv�lida! Saindo...");
			}	
		} else {
			System.out.println("\n*****Banco AkiBank*****");
			System.out.println("\nVoc� ainda n�o abriu uma conta! :(");
		}
	}

	@Override
	public void consultarSaldo() {
		
		if (this.getStatusConta() == true) {
			System.out.println("\n*****Consultando Saldo*****");
			System.out.println("\nSaldo atual: R$" + this.getSaldo());
		} else {
			System.out.println("\n*****Banco AkiBank*****");
			System.out.println("\nVoc� ainda n�o abriu uma conta! :(");
		}
	}

	@Override
	public void creditarSaldo() {
		double valor = 0.0;
		
		if (this.getStatusConta() == true) {
			System.out.println("\n*****Creditando*****");
			System.out.println("\nSaldo atual: " + this.getSaldo());
			System.out.print("\nQual o valor do deposito? R$ ");
			valor = entrada.nextDouble();
			System.out.println("\nValor R$ " + valor + " depositado com sucesso! :)");
			this.setSaldo(this.getSaldo() + valor);
			System.out.println("\nSaldo atual: R$" + this.getSaldo());
		} else {
			System.out.println("\n*****Banco AkiBank*****");
			System.out.println("\nVoc� ainda n�o abriu uma conta! :(");
		}
	}

	@Override
	public void debitarSaldo() {
		double valor = 0.0;
		
		if (this.getStatusConta() == true) {
			System.out.println("\n*****Debitando*****");
			System.out.println("\nSaldo atual: R$" + this.getSaldo());
			System.out.print("\nQual o valor do saque? R$ ");
			valor = entrada.nextDouble();
			System.out.println("\nSaque no valor de R$ " + valor + " realizado com sucesso! :)");
			this.setSaldo(this.getSaldo() - valor);
			System.out.println("\nSaldo atual: R$ " + this.getSaldo());
		} else {
			System.out.println("\n*****Banco AkiBank*****");
			System.out.println("\nVoc� ainda n�o abriu uma conta! :(");
		}
	}
	
	
	public SistemaBancarioBr() {
		this.saldo = 0;
		this.statusConta = false;
	}
	
	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public int getTipoConta() {
		return tipoConta;
	}

	public void setTipoConta(int tipoConta) {
		this.tipoConta = tipoConta;
	}

	public Boolean getStatusConta() {
		return statusConta;
	}

	public void setStatusConta(Boolean statusConta) {
		this.statusConta = statusConta;
	}

}
