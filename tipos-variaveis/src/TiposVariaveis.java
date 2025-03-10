public class TiposVariaveis {
    public static void main(String[] args) throws Exception { // Método principal
        System.out.println("Hello, World!");

        int idade = 10; // Variável inteira
        idade = 17;
        System.out.println(idade);  // Imprime a variável idade

        double salario = 4560.0; // Variável double
        salario = 6000.0;
        System.out.println(salario); // Imprime a variável salario

        final double PI = 3.14159; // Variável final
        //PI = 3.14; // Erro - Não se pode alterar variavel final.
        System.out.println(PI);  // Imprime a variável PI

    }
}
