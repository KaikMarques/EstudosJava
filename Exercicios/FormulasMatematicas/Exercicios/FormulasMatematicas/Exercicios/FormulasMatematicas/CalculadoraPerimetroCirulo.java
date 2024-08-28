package Exercicios.FormulasMatematicas;

import java.util.Scanner;

public class CalculadoraPerimetroCirulo {

    /*
     * Enunciado: Crie um programa que calcule e exiba o perímetro de um círculo, solicitando o raio ao usuário.
     * 
     * Entendendo o que é o perimetro de um circulo:
     *  O perimetro de um circulo é o cumprimento da sua circunferência. Para calcular o perímetro, usamos a seguinte fórmula:
     * [ P = 2 \pi r ]
     * (P) representa o perímetro
     * (\pi) ou (pi) é uma constante cujo valor aproximado é 3,14
     * (r) é o raio do círculo, que é a distância entre o centro do círculo e qualquer ponto na sua circunferência
     * 
     */

    public static void main (String [] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor do circulo: ");
        double raio = scanner.nextDouble();

        double perimetro = 2 * Math.PI * raio;
        
        System.out.println("O perimetro do circulo é: " + perimetro);

        scanner.close();
    }


/* Nesse programa, utilizamos a classe Scanner para obter a entrada do usuário. Solicitamos ao usuário que informe o raio do círculo, 
    que é armazenado na variável raio. Em seguida, calculamos o perímetro do círculo utilizando a fórmula 2 * π raio, 
    onde π é o valor da constante pi (aproximadamente 3.14159), que é  obtido através da constante Math.PI em Java.
   Por fim, exibimos o valor do perímetro na tela utilizando  System.out.println() 
 */
 

}
