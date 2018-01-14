package com.cice.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.cice.negocio.Universidad;

@SpringBootApplication
/**
 * 
 * @author Javier Bajo Chacon  javier.bajochacon@gmail.com
 *
 */
public class EjercicioAsignaturasApplication {

	public static void main(String[] args) {
		SpringApplication.run(EjercicioAsignaturasApplication.class, args);
		Universidad universidad = new Universidad();
		
		universidad.showMenu();
	}
}
