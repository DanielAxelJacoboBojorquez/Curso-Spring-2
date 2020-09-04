package es.pildoras.pruebaannotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UsoAnnotations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 1.- Leer el xml de configuración
		ClassPathXmlApplicationContext contexto=new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// 2.- Pedir un bean al contenedor
		Empleados Antonio=contexto.getBean("comercialExperimentado", Empleados.class);
		
		
		// 3.- Usar el bean
		System.out.println(Antonio.getInforme());
		System.out.println(Antonio.getTareas());
		
		// 4.- Cerrar el contexto
		contexto.close();
		
	}	

}
