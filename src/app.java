import Classes.BancoListasContas;
import Classes.ClienteFisico;
import Classes.ContaCorrente;
import Classes.ContaPoupanca;

public class app {

	public static void main(String[] args) {
		ContaCorrente gabrielContaCorrente = new ContaCorrente(
				new ClienteFisico("Gabriel", 12346, 52225888),"2255asd","brasil",123456);
		ContaPoupanca henriquePoupanca = new ContaPoupanca(
				new ClienteFisico("henrique", 2315588, 200144),"senha123456", "Santander", 20011);
		
		BancoListasContas ContasPoupanca = new BancoListasContas("Poupanca");
		BancoListasContas ContasCorrentes = new BancoListasContas("Corrente");
		gabrielContaCorrente.Depositar(3000.0);
		System.out.println(gabrielContaCorrente.ConsutarSaldo());
		gabrielContaCorrente.Sacar(100.0);
		System.out.println(gabrielContaCorrente.ConsutarSaldo());
		
		henriquePoupanca.Depositar(5000.0);
		System.out.println(henriquePoupanca.ConsutarSaldo());
		henriquePoupanca.Tranferir(1000.0, gabrielContaCorrente);
		System.out.println(gabrielContaCorrente.ConsutarSaldo());
		System.out.println(henriquePoupanca.ConsutarSaldo());
		
		ContasCorrentes.setConta(gabrielContaCorrente);
		ContasPoupanca.setConta(henriquePoupanca);
		ContasCorrentes.listarContas();
		ContasPoupanca.listarContas();
		ContasCorrentes.ExcluirConta(1, "Gabriel");
		
		ContasPoupanca.listarContas();
		ContasCorrentes.listarContas();
}

}
