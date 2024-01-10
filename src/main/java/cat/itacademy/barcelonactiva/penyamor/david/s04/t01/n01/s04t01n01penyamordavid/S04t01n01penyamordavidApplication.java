
package cat.itacademy.barcelonactiva.penyamor.david.s04.t01.n01.s04t01n01penyamordavid;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"cat.itacademy.barcelonactiva.penyamor.david.s04.t01.n01.s04t01n01penyamordavid", "controllers"})
public class S04t01n01penyamordavidApplication {

	public static void main(String[] args) {
		SpringApplication.run(S04t01n01penyamordavidApplication.class, args);
	}

}

