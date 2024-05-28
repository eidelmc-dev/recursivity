package com.example.demo;
import java.util.ArrayList;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.example.demo.ejercicios.Ejercicios;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
		// Ejercicios.rangoHasta(5, new ArrayList<>());
		// Ejercicios.rango(5, 10, new ArrayList<>());
		// Ejercicios.sumaHasta(5);
		// Ejercicios.removerTodos(new ArrayList<>(java.util.List.of(1, 2, 3, 1, 6, 7,
		// 1, 9)), 9);
		// String mayuscula = Ejercicios.aMayusculas("hola", 0);
		// System.out.println(mayuscula);
		// Ejercicios.esPar(4);;
		//int potencial = Ejercicios.potencial(5, 2);
		//System.out.println(potencial);
		//int decimalBinario = Ejercicios.decimalBinario(79);
		//System.out.println(decimalBinario);
	}

}
