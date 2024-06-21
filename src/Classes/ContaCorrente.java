package Classes;

import ClssesAbstratas.ContaBancaria;

public class ContaCorrente extends ContaBancaria {

	public ContaCorrente(ClienteFisico cliente, String Senha, String Banco, int NumeroDaAgencia) {
		super(cliente, Senha, Banco, NumeroDaAgencia);
	}

	@Override
	public void ImprimirExtrato() {
		System.out.println("Extrato conta Poupanca");
		super.InformacoesDaConta();
		
	}

}
