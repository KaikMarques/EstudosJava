package Exercicios.FormulasMatematicas;

import java.util.Scanner;

public class MediaGeometrica {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        double numero1 = scanner.nextDouble();

        System.out.print("Digite o segundo número: ");
        double numero2 = scanner.nextDouble();

        System.out.print("Digite o terceiro número: ");
        double numero3 = scanner.nextDouble();

        @SuppressWarnings("unused")
        double mediaGeometrica = Math.pow(numero1 * numero2 * numero3, 1.0/3.0);
        // Math.pow(): Essa é uma função da classe Math em Java que calcula a potência de um número. O primeiro argumento é a base e o segundo é o expoente.
        // 1.0/3.0: Esse cálculo resulta em 0.3333..., que é o equivalente a 1/3. Esse valor será o expoente da potência.
        System.out.println("A média geométrica dos números é: " + mediaGeometrica);

        scanner.close();
        /*
         * Como a média geométrica é calculada?
         * 1. Multiplicação: Os três números são multiplicados entre si.
         * 2. Raiz cúbica: O resultado da multiplicação é elevado à potência de 1/3. Isso equivale a calcular a raiz cúbica do produto dos três números.
         * 
         * Por que usamos 1.0/3.0 em vez de 1/3?
         *  Divisão por zero: Se usarmos 1/3, o compilador pode interpretar isso como uma divisão inteira, 
         *                    e se algum dos números for zero, ocorrerá um erro de divisão por zero.
         * 
         * Precisão: Ao usar 1.0/3.0, garantimos que a divisão seja realizada como uma operação de ponto flutuante, 
         *           o que proporciona maior precisão no resultado.
         * 
         * 
         * double mediaGeometrica = Math.pow(numero1 * numero2 * numero3, 1.0/3.0);
         *  Essa linha de código calcula a média geométrica de três números utilizando a função Math.pow() 
         *  para elevar o produto dos números à potência de 1/3. O resultado é armazenado na variável mediaGeometrica.
         */

    }
}
