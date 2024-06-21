package Interfaces;

import ClssesAbstratas.ContaBancaria;

public interface FuncoesConta {

	 void Sacar(double valor);
	 void Depositar(double valor);
	 void Tranferir(double valor, ContaBancaria ContaDestino);
	 double ConsutarSaldo();
	 void ImprimirExtrato();
	
}
