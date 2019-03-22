package hello;
import java.util.*;
public class HelloWorld {
	private String nome;
	Calendar horario = Calendar.getInstance();
	int hora = horario.get(Calendar.HOUR_OF_DAY);
	int minutos = horario.get(Calendar.MINUTE);
	int segundos = horario.get(Calendar.SECOND);
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getNome() {
		return nome;
		
	}
	public void imprimir() {
		System.out.println(hora + ":" + minutos + ":" + segundos + " - " + " Olá " + this.getNome() + ". Você acabou de fazer seu primeiro Hello World em Java. Parabéns.");
	}
}
