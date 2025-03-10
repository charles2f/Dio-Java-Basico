package edu.charles.metodo;
public class Metodos {
    public static void main(String[] args) throws Exception { // Método principal
        System.out.println("Hello, World!");

        // Método que retorna um valor
        int resultado = soma(10, 5);
        System.out.println(resultado);

        // Método que não retorna um valor
        imprimir("Hello, World!");

        // Método com parâmetros
        imprimir("Hello, World!", 5);

        // Método com retorno e parâmetros
        int resultado2 = multiplicacao(10, 5);
        System.out.println(resultado2);
    }

    // Método que retorna um valor
    public static int soma(int a, int b) {
        return a + b;
    }

    // Método que não retorna um valor
    public static void imprimir(String texto) {
        System.out.println(texto);
    }

    // Método com parâmetros
    public static void imprimir(String texto, int vezes) {
        for (int i = 0; i < vezes; i++) {
            System.out.println(texto);
        }
    }

    // Método com retorno e parâmetros
    public static int multiplicacao(int a, int b) {
        return a * b;
    }


}
