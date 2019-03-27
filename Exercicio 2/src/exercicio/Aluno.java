package exercicio;

public class Aluno extends Pessoa {
	private int anoEntrada;

	public int getAnoEntrada() {
		return anoEntrada;
	}

	public void setAnoEntrada(int anoEntrada) {
		this.anoEntrada = anoEntrada;
	}
	
	private int periodoEntrada;

	public int getPeriodoEntrada() {
		return periodoEntrada;
	}

	public void setPeriodoEntrada(int periodoEntrada) {
		this.periodoEntrada = periodoEntrada;
	}
	
	public void imprimirAluno() {
		System.out.println("O nome do aluno �: " + this.getNome() + ". Seu endere�o �: " + "rua " + this.getRua() + ", " + this.getComplemento() + ", " + this.getNumero() + ", " + this.getCidade() + ". " + "Ano de entrada �: " + this.getAnoEntrada() + "." + this.getPeriodoEntrada() + ".");
	}
	

}
