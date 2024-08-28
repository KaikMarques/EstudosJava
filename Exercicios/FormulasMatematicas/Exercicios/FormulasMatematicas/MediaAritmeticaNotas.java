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
 * 
 * ## Irei usar a classe Scanner: A classe Scanner é usada para ler dados de entrada, como por exemplo, 
 *    o que o usuário digita no teclado. Ao criar um novo objeto Scanner, você está basicamente criando uma ferramenta para capturar essa entrada.
 * 
 * ## scanner: scanner: É o nome que você escolheu para esse leitor. Poderia ser qualquer outro nome válido, como leitor, entrada, etc.
 * 
 * ## System.in: O System.in representa a entrada padrão do sistema, que geralmente é o teclado. 
 * 
 * ## new Scanner: Aqui, você está criando um novo objeto da classe Scanner. É como instanciar um objeto para usar suas funcionalidades.
 *    Ao passar System.in como argumento para o construtor do Scanner, você está dizendo que o Scanner deve ler os dados que são digitados no teclado.
 * 
 * ## Scanner scanner = new Scanner(System.in); significa que você está criando um objeto chamado scanner 
 *      do tipo Scanner que irá ler os dados que você digitar no teclado. 
 *      É como conectar um cabo do seu programa para o teclado do seu computador.
 * 
 */

public class MediaAritmeticaNotas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro valor: ");
        double numero1 = scanner.nextDouble();
        
        System.out.print("Digite o segundo valor: ");
        double numero2 = scanner.nextDouble();

        System.out.print("Digite o terceiro valor: ");
        double numero3 = scanner.nextDouble();

        double media = (numero1 + numero2 + numero3) / 3;

        System.out.println("A média dos valores: ( " + numero1 + " + " + numero2 + " + " + numero3 + " ) / 3 :");
        System.out.println(media);

        scanner.close();

        
    }
}
