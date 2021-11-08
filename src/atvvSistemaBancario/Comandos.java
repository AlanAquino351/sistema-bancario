package atvvSistemaBancario;

public interface Comandos {
	
	public abstract void abrirConta();
	public abstract void encerrarConta();
	public abstract void consultarSaldo();
	public abstract void creditarSaldo();
	public abstract void debitarSaldo();
}
