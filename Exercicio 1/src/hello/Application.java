package hello;

public class Application {
	public static void main(String[] args) {
		HelloWorld helloWorld = new HelloWorld();
		helloWorld.setNome("Gabriel");
		helloWorld.imprimir();
		HelloWorld helloWorld2 = new HelloWorld();
		helloWorld2.setNome("Ana");
		helloWorld2.imprimir();
		HelloWorld helloWorld3 = new HelloWorld();
		helloWorld3.setNome("Thamires");
		helloWorld3.imprimir();
		HelloWorld helloWorld4 = new HelloWorld();
		helloWorld4.imprimir();
	}

}
