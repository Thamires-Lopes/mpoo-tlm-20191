package exercicio;

import java.util.Date;

public class Professor extends Pessoa {
	private Date admissao;

	public Date getAdmissao() {
		return admissao;
	}

	public void setAdmissao(Date admissao) {
		this.admissao = admissao;
	}
	
	public void imprimirProf() {
		System.out.println("O nome do professor é: " + this.getNome() + ". Seu endereço é: " + "rua " + this.getRua() + ", " + this.getComplemento() + ", " + this.getNumero() + ", " + this.getCidade() + ". " + "Data de admissão é: " + this.getAdmissao() + ".");
	}

}
