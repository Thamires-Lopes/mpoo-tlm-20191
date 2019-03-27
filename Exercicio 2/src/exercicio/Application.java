package exercicio;

import java.util.Date;

public class Application {

	public static void main(String[] args) {
		
		//Instanciando classe Aluno - aluno1
		
		Aluno aluno1 = new Aluno();
		aluno1.setNome("Thamires");
		aluno1.setCpf("15618916156");
		aluno1.setAnoEntrada(2018);
		aluno1.setPeriodoEntrada(1);
		aluno1.setRua("Limãozinho");
		aluno1.setCidade("Olinda");
		aluno1.setComplemento("Bloco 2");
		aluno1.setNumero(103);
		aluno1.setAnoEntrada(2018);
		aluno1.setPeriodoEntrada(1);
		aluno1.imprimirAluno();
		
		//Instanciando classe Professor - professor1
		
		Professor professor1 = new Professor();
		Date data = new Date();
		professor1.setAdmissao(data);
		professor1.setCidade("Recife");
		professor1.setComplemento("Lado B");
		professor1.setCpf("4564564546");
		professor1.setNome("José");
		professor1.setNumero(212);
		professor1.setRua("Mangaba");
		professor1.imprimirProf();
		
		//Transformação do aluno1 em Professor
		
		Professor professor2 = new Professor();
		professor2.setNome(aluno1.getNome());
		professor2.setCidade(aluno1.getCidade());
		professor2.setComplemento(aluno1.getComplemento());
		professor2.setCpf(aluno1.getCpf());
		professor2.setNumero(aluno1.getNumero());
		professor2.setRua(aluno1.getRua());
		professor2.setAdmissao(new Date());
		professor2.imprimirProf();
		
		// Transformação do professor1 em Aluno
		
		Aluno aluno2 = new Aluno();
		aluno2.setNome(professor1.getNome());
		aluno2.setAnoEntrada(2019);
		aluno2.setCidade(professor1.getCidade());
		aluno2.setComplemento(professor1.getComplemento());
		aluno2.setCpf(professor1.getCpf());
		aluno2.setNumero(professor1.getNumero());
		aluno2.setPeriodoEntrada(1);
		aluno2.setRua(professor1.getRua());
		aluno2.imprimirAluno();
	

	}

}
