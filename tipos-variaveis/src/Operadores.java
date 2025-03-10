public class Operadores {
    public static void main(String[] args) throws Exception { // Método principal
        System.out.println("Hello, World!");

        // Operadores aritméticos
        int soma = 10 + 5;          // Soma
        int subtracao = 10 - 5;     // Subtração
        int multiplicacao = 10 * 5; // Multiplicação
        int divisao = 10 / 5;       // Divisão
        int modulo = 10 % 5;        // Módulo   

        System.out.println(soma);
        System.out.println(subtracao);
        System.out.println(multiplicacao);
        System.out.println(divisao);
        System.out.println(modulo);

        // Operadores de comparação
        boolean menorQue = 10 < 5; 
        boolean maiorQue = 10 > 5;
        boolean menorOuIgual = 10 <= 5;
        boolean maiorOuIgual = 10 >= 5;
        boolean igual = 10 == 5;
        boolean diferente = 10 != 5;

        System.out.println(menorQue);
        System.out.println(maiorQue);
        System.out.println(menorOuIgual);
        System.out.println(maiorOuIgual);
        System.out.println(igual);
        System.out.println(diferente);

        // Operadores lógicos
        boolean e = true && false;
        boolean ou = true || false;
        boolean negacao = !true;

        System.out.println(e);
        System.out.println(ou);
        System.out.println(negacao);

        // Operadores de incremento e decremento
        int numero = 10;
        numero++;
        System.out.println(numero);

        numero--;
        System.out.println(numero);

        // Operadores de atribuição
        int x = 10;
        x = 5; // x = x + 5
        System.out.println(x);   
        
        // Operadores de Unários
        int y = 10; 
        y = -y; // y = -10
        System.out.println(y);

        // Operadores de negação    
        boolean z = true;
        z = !z; // z = false
        System.out.println(z);  

        // Operadores de Ternário
        int a = 10; 
        int b = 5;
        int c = (a > b) ? a : b; // c = 10
        System.out.println(c);

    }  
}
