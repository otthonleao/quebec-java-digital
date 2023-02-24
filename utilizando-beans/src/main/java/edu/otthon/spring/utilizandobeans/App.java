package edu.otthon.spring.utilizandobeans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class App {
	public static void main(String[] args) {
		ApplicationContext factory = new AnnotationConfigApplicationContext(AppConfig.class);

		Livro livro = factory.getBean(Livro.class);
		livro.setNome("Java: Guia do Programador");
		livro.setCodigo("INF3224");

		Autor autor = factory.getBean(Autor.class);
		autor.setNome("Peter Junior");
		livro.exibir();

		((AbstractApplicationContext) factory).close();


	}
}
