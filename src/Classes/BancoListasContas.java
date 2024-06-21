package Classes;

import java.util.ArrayList;
import java.util.List;

import javax.management.RuntimeErrorException;

import ClssesAbstratas.ContaBancaria;
 
public class BancoListasContas {

	private String nome;
	List<ContaBancaria> listasComAsContas;
	
	public BancoListasContas(String nome) {
		this.nome = nome;
		this.listasComAsContas = new ArrayList<>();
	}
	
	public void setConta(ContaBancaria conta) {
		listasComAsContas.add(conta);
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public void listarContas(){
		if(!listasComAsContas.isEmpty()) {
		for(ContaBancaria c : listasComAsContas) {
			 c.InformacoesDaConta();
		}
		}else {
			throw new RuntimeException("A lista esta vazia");
		}
		
	}
	
	public void ExcluirConta(long numeroDaConta, String nomeTitular) { 
		List<ContaBancaria> contaARemover = new ArrayList<>(listasComAsContas);
		if(!listasComAsContas.isEmpty()) {
			for(ContaBancaria c : listasComAsContas) {
				if(c.getNumeroDaConta() == numeroDaConta && c.cliente().getNomeTitular() == nomeTitular) {
					contaARemover.add(c);
				}else {
					throw new RuntimeException("Nao existe uma conta com esse titular e numero, verifique e tente novamente");
				}
			}
			listasComAsContas.removeAll(contaARemover);
		}else {
			throw new RuntimeException("A lista esta vazia");
		}
	}
	
	public List<ContaBancaria> PequisarConta(String nomeTitular){
		List<ContaBancaria> contaPorNome = new ArrayList<>(listasComAsContas);
		if(!listasComAsContas.isEmpty()) {
			for(ContaBancaria c : listasComAsContas) {
				if(c.cliente().getNomeTitular().equalsIgnoreCase(nomeTitular)) {
					contaPorNome.add(c);
				}else{
					throw new RuntimeException("Naoe exite um conta com esse titular");
				};
			}
			return contaPorNome;
		}else {
			throw new RuntimeException("A lista esta vazia");
		}
	}
	
}
