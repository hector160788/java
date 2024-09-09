package tipodedatos.principal;

public class TiposDeDatosPrimitivos {
	

	    public static void main(String[] args) {
	    	/*
	    	 * Las variables en Java son contenedores para almacenar datos que 
	    	 * pueden cambiar a lo largo de la ejecución del programa. 
	    	 * Se definen por un tipo de dato, un nombre, y pueden recibir un valor 
	    	 * que se puede modificar o utilizar según las necesidades del programa.
	    	 * */
	    	
	        // 1. byte - Entero de 8 bits
	        byte ejemploByte = 100;
	        System.out.println("byte:");
	        System.out.println("Valor: " + ejemploByte);
	        System.out.println("Tamaño: 8 bits");
	        System.out.println("Rango: " + Byte.MIN_VALUE + " a " + Byte.MAX_VALUE);
	        System.out.println();

	        // 2. short - Entero de 16 bits
	        short ejemploShort = 1000;
	        System.out.println("short:");
	        System.out.println("Valor: " + ejemploShort);
	        System.out.println("Tamaño: 16 bits");
	        System.out.println("Rango: " + Short.MIN_VALUE + " a " + Short.MAX_VALUE);
	        System.out.println();

	        // 3. int - Entero de 32 bits
	        int ejemploInt = 100000;
	        System.out.println("int:");
	        System.out.println("Valor: " + ejemploInt);
	        System.out.println("Tamaño: 32 bits");
	        System.out.println("Rango: " + Integer.MIN_VALUE + " a " + Integer.MAX_VALUE);
	        System.out.println();

	        // 4. long - Entero de 64 bits
	        long ejemploLong = 10000000000L;
	        System.out.println("long:");
	        System.out.println("Valor: " + ejemploLong);
	        System.out.println("Tamaño: 64 bits");
	        System.out.println("Rango: " + Long.MIN_VALUE + " a " + Long.MAX_VALUE);
	        System.out.println();

	        // 5. float - Número de punto flotante de 32 bits
	        float ejemploFloat = 5.75f;
	        System.out.println("float:");
	        System.out.println("Valor: " + ejemploFloat);
	        System.out.println("Tamaño: 32 bits");
	        System.out.println("Rango: " + Float.MIN_VALUE + " a " + Float.MAX_VALUE);
	        System.out.println();

	        // 6. double - Número de punto flotante de 64 bits
	        double ejemploDouble = 19.99;
	        System.out.println("double:");
	        System.out.println("Valor: " + ejemploDouble);
	        System.out.println("Tamaño: 64 bits");
	        System.out.println("Rango: " + Double.MIN_VALUE + " a " + Double.MAX_VALUE);
	        System.out.println();

	        // 7. char - Carácter de 16 bits
	        char ejemploChar = 'A';
	        System.out.println("char:");
	        System.out.println("Valor: " + ejemploChar);
	        System.out.println("Tamaño: 16 bits");
	        System.out.println("Rango: " + (int) Character.MIN_VALUE + " a " + (int) Character.MAX_VALUE);
	        System.out.println();

	        // 8. boolean - Representa un valor verdadero o falso
	        boolean ejemploBoolean = true;
	        System.out.println("boolean:");
	        System.out.println("Valor: " + ejemploBoolean);
	        System.out.println("Tamaño: 1 bit (teórico, ya que en la práctica depende de la implementación)");
	        System.out.println("Rango: " + Boolean.FALSE + " a " + Boolean.TRUE);
	        System.out.println();
	    }



}
