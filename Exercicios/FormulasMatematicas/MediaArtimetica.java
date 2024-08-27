package Exercicios.FormulasMatematicas;

import java.util.Scanner;

/*
 * # Escreva um programa que calcule a média aritmética de dois números
 * 
 * Passo para a solução:
 *  Para chegar a soluçao, é necessário saber primeiro a formula da média aritmética.
 * 
 * Formula >>> Soma dos valores / numero de valores
 * 
 * Passos: Some todos os valores que você deseja incluir na média.
 *         Conte o número de valores (ou seja, quantos números você somou).
 *         Divida a soma pelo número de valores.
 */
public class MediaArtimetica {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro valor: ");
        float numero1 = scanner.nextFloat();

        System.out.print("Digite o segundo valor: ");
        float numero2 = scanner.nextFloat();

        float media = (numero1 + numero2) / 2;

        System.out.println("A média aritmética dos valores de número: " + numero1 + ", e " + numero2 + " é = " + media);

        scanner.close();

    }

}
