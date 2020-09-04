package es.pildoras.pruebaannotations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("es.pildoras.pruebaannotations")
@PropertySource("classpath:datosEmpresa.propiedades")
public class EmpleadosConfig {
	// 1.- Definir el bean para InformeFinancieroDtoCompras
	@Bean
	public CreacionInformeFinanciero informeFinancieroDtoCompras() { //Será el id del bean inyectado
		return new InformeFinancieroDtoCompras();
	}
	
	// 2.- Definir el bean para DirectorFinanciero e inyectar dependencias
	@Bean
	public Empleados directorFinanciero() {
			return new DirectorFinanciero(informeFinancieroDtoCompras());
	}
}
