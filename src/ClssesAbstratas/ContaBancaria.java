package ClssesAbstratas;
import Classes.ClienteFisico;
import Interfaces.FuncoesConta;

public abstract class ContaBancaria implements FuncoesConta{
	private static long NumeroDaContaSequencial = 0000000001;
	protected int Agencia;
	protected double Saldo;
	protected long NumeroDaConta;
	protected String Banco;
	protected ClienteFisico cliente;
	protected String Senha;
	
	public ContaBancaria(ClienteFisico cliente, String Senha, String Banco, int NumeroDaAgencia){
		this.cliente= cliente;
		this.Senha = Senha;
		this.Banco = Banco;
		this.Agencia = NumeroDaAgencia;
		this.NumeroDaConta = this.NumeroDaContaSequencial++; 	
	}
	
	@Override public void Sacar(double valor) {
		
		if(valor <= this.Saldo) {
			this.Saldo -= valor;
		}else {
			throw new RuntimeException("Saldo Insuficiente para esse Saque, Verifique o valor e tente Novamente");
		}
		
	}
	
	@Override public void Depositar(double valor) {
		
		if(valor > 0) {
			this.Saldo += valor;
		}else {
			throw new RuntimeException("Valor menor que 1 ou negativo sao invalidos, Verifique o valor e tente Novamente");		
		}
	}
	
	@Override public void Tranferir(double valor, ContaBancaria ContaDestino) {
		this.Sacar(valor);
		ContaDestino.Depositar(valor);
	}
	
	@Override public double ConsutarSaldo() {
		return this.Saldo;
	}
	
	 public void InformacoesDaConta() {
		 System.out.println("Nome Titular: "+ cliente.getNomeTitular() + "\nBanco: "+Banco+
				 "  ||  Agencia: "+Agencia+
				 "  || Numero Da Conta: "+NumeroDaConta + 
				 "\n Saldo: "+Saldo);
	}
	 
	 public int getAgencia() {
		 return Agencia;
	 }
	 public long getNumeroDaConta() {
		 return NumeroDaConta;
	 }
	 public String Banco() {
		 return Banco;
	 }
	 public ClienteFisico cliente() {
		 return cliente;
	 }
	
}
