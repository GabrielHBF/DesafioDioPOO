package Classes;

public class ClienteFisico {
	
	private String nomeTitular;
	private long cpf;
	private long rg;
	
	public ClienteFisico(String nome, long cpf,long rg) {
		this.nomeTitular = nome;
		this.cpf = cpf;
		this.rg = rg;	
	}

	public String getNomeTitular() {
		return nomeTitular;
	}

	public long getCpf() {
		return cpf;
	}

	public long getRg() {
		return rg;
	}
	
}
