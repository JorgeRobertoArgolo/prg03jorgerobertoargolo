package br.com.ifba;

import br.com.ifba.curso.view.CursoListar;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * Classe principal da aplicação Spring Boot.
 *
 * Esta classe inicializa a aplicação Spring Boot e configura o contexto do Spring para suportar uma interface gráfica.
 * 
 * A interface gráfica {@link CursoListar} é iniciada após o contexto do Spring ser configurado.
 */
@SpringBootApplication
public class Prg03springApplication {
	public static void main(String[] args) {
		ConfigurableApplicationContext context =
                        new SpringApplicationBuilder(Prg03springApplication.class).
                        headless(false).run(args);

                CursoListar telaCurso = context.getBean(CursoListar.class);
                telaCurso.setVisible(true);
	}
}
