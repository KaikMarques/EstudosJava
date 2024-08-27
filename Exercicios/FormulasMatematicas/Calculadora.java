package Exercicios.FormulasMatematicas;

import java.util.Scanner;

/*
 * Escreva um programa que solicita ao usuário dois números e exiba a soma, subtração, multiplicação e divisão entre eles 
 */
public class Calculadora {
    public static void main(String[] args) {
        
        // Criando um objeto do tipo Scanner
        Scanner scanner = new Scanner(System.in); // Criei um novo objeto Scanner armazenando na variavel scanner e vai ler a entrada apartir do concole

        // Coletando os dados de entrada do usuário e armazenando na var
        System.out.print("Digite o primeiro número: "); // Usando o print a próxima entrada/saida será na mesma linha println quebra a linha
        double numero1 = scanner.nextDouble(); // nextDouble É um método da classe Scanner que lê a próxima entrada do usuário como um número de ponto flutuante (double).

        System.out.print("Digite o segundo número: ");
        double numero2 =scanner.nextDouble();

        double soma = numero1 + numero2;
        double subtracao = numero1 - numero2;
        double multiplicacao = numero1 * numero2;
        double divisao = numero1 / numero2;

        System.out.println("Soma: " + soma);
        System.out.println("Subtração: " + subtracao);
        System.out.println("Multiplicação: " + multiplicacao);
        System.out.println("Divisão: " + divisao);


        scanner.close(); // O método "close()"  da classe Scanner fecha o objeto Scanner que você criou, liberando qualquer recurso associado a ele.


    }

}
