/**
 * Clase que representa una calculadora con operaciones aritméticas básicas.
 *
 * @author Adrián
 * @version 1.0.0
 * @since 2024
 */
public class Calculadora {

    /**
     * Suma dos números enteros.
     *
     * @param a Primer sumando
     * @param b Segundo sumando
     * @return Resultado de la suma
     */
    public int sumar(int a, int b) {
        return a + b;
    }
    
    /**
     * Resta dos números enteros.
     *
     * @param a Minuendo
     * @param b Sustraendo
     * @return Resultado de la resta
     */
    public int restar(int a, int b) {
        return a - b;
    }
    
    /**
     * Multiplica dos números enteros.
     *
     * @param a Primer factor
     * @param b Segundo factor
     * @return Resultado de la multiplicación
     */
    public int multiplicar(int a, int b) {
        return a * b;
    }
    
    /**
     * Divide dos números enteros.
     *
     * @param a Dividendo
     * @param b Divisor
     * @return Resultado de la división
     * @throws IllegalArgumentException Si el divisor es cero
     */
    public double dividir(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("No se puede dividir entre cero");
        }
        return (double) a / b;
    }
}