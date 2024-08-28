package Exercicios.FormulasMatematicas;

import java.util.Scanner;

public class CalculadoraAreaCirculo {
/* 
 * Escreva um programa que calcule a área de um círculo a
 * partir do raio, utilizando a fórmula A = πr² (A = \pi r^2).
 * 
 *   Detalhes:
 * (A) representa a área do círulo
 * (\pi) ou (pi) é uma constante cujo valor aproximado é 3,14 
 * (r) é o raio do círculo
 * 
 * Para calcular a área:
 *  1. Eleve o raio ao quadrado ((r^2))
 *  2. Multiplique o resultado pelo valor de (\pi)
 * Por exemplo, se o rio for 5 unidades, o cálculo seria:
 * [ A = 3,14 \cdot 5^2 = 3,14 \cdot 25 = 78.5 ]
 * 
 *  Portanto, a área do círculo com raio 5 unidades seria aproximadamente 78,5 unidades quadradas
 * 
 * \cdot  significa que estamos multiplicando 
 * 
 */


    public static void main (String [] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor do raio: ");
        double raio = scanner.nextDouble();

        // Math.pow eleva a potencia raio é a variavel e depois, coloco virgula e o expoente para ser elevado a potencia
        double areaCirculo = Math.PI * Math.pow(raio, 2);

        System.out.println("A área do círculo é: " + areaCirculo);

        scanner.close();
    }

/*     Nesse programa, utilizamos a classe Scanner para obter a entrada do
 usuário. Solicitamos ao usuário que informe o raio do círculo, que é armazenado na variável raio.
 Em seguida, calculamos a área do círculo utilizando a fórmula A = πr²,
 onde π é o valor da constante pi (aproximadamente 3.14159), que é obtido
 através da constante Math.PI em Java. A função Math.pow() é usada para elevar o raio ao quadrado.
   Por fim, exibimos o valor da área na tela utilizando System.out.println().

 */
}
