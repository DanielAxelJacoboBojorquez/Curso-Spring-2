package es.pildoras.pruebaannotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UsoAnnotations2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1.- Leer el xml de configuraci�n
		ClassPathXmlApplicationContext contexto=new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// 2.- Pedir un bean al contenedor
		Empleados Antonio=contexto.getBean("comercialExperimentado", Empleados.class);
		Empleados Lucia=contexto.getBean("comercialExperimentado", Empleados.class);		
		//Apuntan al mismo objeto en memoria?
		if(Antonio==Lucia) {
			System.out.println("Apuntan al mismo lugar en memoria");	
			System.out.println(Antonio + "\n" + Lucia);
		}else {
			System.out.println("No apuntan al mismo lugar en memoria");
			System.out.println(Antonio + "\n" + Lucia);
		}
		// 4.- Cerrar el contexto
		contexto.close();
	}
}