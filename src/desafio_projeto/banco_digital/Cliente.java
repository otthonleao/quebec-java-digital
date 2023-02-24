package desafio_projeto.banco_digital;

public class Cliente {

	private static final int AGENCIA = 0001;
	private static int SEQUENCIAL = 1;

	protected String nome;
	protected String cpf;

	public int agencia;
	protected int numeroConta;

	public Cliente(String nome, String cpf) {
		this.nome = nome;
		this.cpf = cpf;
		this.agencia = AGENCIA;
		this.numeroConta = SEQUENCIAL++;
	}

	public void abrirConta() {
		
	}

	public void sacar() {

	}

	public void depositar() {

	}

	public void transferir() {

	}

	public void extrato() {

	}

	public void fecharConta() {

	}



	public static int getAgencia() {
		return AGENCIA;
	}

	public static int getSEQUENCIAL() {
		return SEQUENCIAL;
	}

	public String getNome() {
		return nome;
	}

	public String getCpf() {
		return cpf;
	}

	public int getNumeroConta() {
		return numeroConta;
	}

	@Override
	public String toString() {
		return "[Nome = " + nome + ", CPF = " + cpf + ", Agencia = " + agencia + ", Conta = "
				+ numeroConta + "]";
	}
}
