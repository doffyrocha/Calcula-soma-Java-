/**
 * Uma classe simples de calculadora que fornece operações aritméticas básicas.
 */
public class Calculadora {

    /**
     * Soma dois números inteiros.
     *
     * @param numeroUm o primeiro número a ser somado
     * @param numeroDois o segundo número a ser somado
     * @return a soma dos dois números
     */
    public int somar(int numeroUm, int numeroDois) {
        return numeroUm + numeroDois;
    }

    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        int resultado = calculadora.somar(5, 3);
        System.out.println("O resultado da soma é: " + resultado);  // Saída: O resultado da soma é: 8
    }
}

