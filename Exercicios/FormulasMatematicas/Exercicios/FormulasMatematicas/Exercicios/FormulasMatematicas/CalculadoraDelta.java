package Exercicios.FormulasMatematicas;

import java.util.Scanner;

/* Escreva um programa que calcule o delta de uma equação de segundo grau (Δ = b² - 4ac).
 * 
 * Fórmula do Delta: O delta ((\Delta)) é dado pela fórmula: [ \Delta = b^2 - 4ac ]
 * 1. Equação de Segundo Grau: Uma equação de segundo grau tem a forma geral: [ ax^2 + bx + c = 0 ] Onde:
 * (a), (b) e (c) são coeficientes (sendo (a \neq 0)).
 * (x) é a variável desconhecida.
 * 
 * Exemplo: Suponhamos que temos a equação (2x^2 + 5x - 3 = 0). Vamos calcular o delta:
 * 
 * Coeficiente (a): 2
 * Coeficiente (b): 5
 * Coeficiente (c): -3
 * [ \Delta = 5^² - 4 \cdot 2 \cdot (-3) = 25 + 24 = 49 ] Portanto, (\Delta = 49), 
 *    o que significa que essa equação tem duas raízes reais e distintas.
 */
public class CalculadoraDelta {

    public static void main (String [] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor de A: ");
        double a = scanner.nextDouble();

        System.out.print("Digite o valor de B: ");
        double b = scanner.nextDouble();

        System.out.print("Digite o valor de C: ");
        double c = scanner.nextDouble();

        double delta =  Math.pow(b, 2) - 4 * a * c;

        System.out.println("O delta da equação é: " + delta);

        scanner.close();
    }

/*     Nesse programa, utilizamos a classe Scanner para obter a entrada do usuário. 
    Solicitamos ao usuário que informe os valores de a, b e c da equação de segundo grau.
    Em seguida, calculamos o delta da equação utilizando a fórmula Δ = b² 4ac. 
    Utilizamos a função Math.pow() para elevar b ao quadrado.
     Por fim, exibimos o valor do delta na tela utilizando System.out.println()
 */
}
