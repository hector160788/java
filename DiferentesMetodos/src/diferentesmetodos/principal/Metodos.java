package diferentesmetodos.principal;

public class Metodos {

	// Método que no recibe parámetros y no retorna ningún valor (void)
	public void/* <-- no regresa ningun valor */ mostrarMensaje(/* metodo que no recibe parametros de entrada */) {
		System.out.println("¡Hola! Este es un método que no retorna nada y no tiene parámetros.");
	}

	// Método que no recibe parámetros y retorna un valor entero
	public int/* <-- su retorno es de tipo entero */ obtenerNumero(/* metodo que no recibe parametros de entrada */) {
		int numero = 42; // Definimos un número
		return numero; // Retornamos el número
	}

	// Método que recibe dos parámetros enteros y no retorna ningún valor (void)
	public void/* <-- no regresa ningun valor */ sumar(int a,
			int b/* este metodo recibe dos valores de entrada a y b */) {
		int resultado = a + b; // Suma los dos parámetros
		System.out.println("La suma de " + a + " y " + b + " es: " + resultado);
	}

	// Método que recibe dos parámetros enteros y retorna su producto
	public int/* <-- su retorno es de tipo entero */ multiplicar(int a,
			int b /* este metodo recibe dos valores de entrada a y b */) {
		int resultado = a * b; // Multiplica los dos parámetros
		return resultado; // Retorna el resultado de la multiplicación
	}

}
