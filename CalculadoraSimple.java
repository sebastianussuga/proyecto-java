public class CalculadoraSimple {

    public int sumar(int a, int b) {
        return a + b; // Añadir punto y coma al final de la línea
    }

    public int multiplicar(int a, int b) {
        int resultado = a * b; // Añadir punto y coma al final de la línea
        return resultado;
    }

    public static void main(String[] args) {
        CalculadoraSimple calc = new CalculadoraSimple();
        
        int resultadoSuma = calc.sumar(10, 5);
        int resultadoMultiplicacion = calc.multiplicar(10, 10);

        System.out.println("Resultado de la suma: " + resultadoSuma); // Corregir la cadena para la impresión
        System.out.println("Resultado de la multiplicación: " + resultadoMultiplicacion);
    }
}

