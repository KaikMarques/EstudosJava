
import java.util.Scanner;

public class CalculadoreImc {
/*
 * Escreva um programa que calcule o IMC de um indivíduo,
 * utilizando a fórmula IMC = peso / altura²
 */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o seu peso em quilograma: "); // exempolo: 87.90
        double peso = scanner.nextDouble();
        
        System.out.print("Digite a sua altura em metros: ");
        double altura = scanner.nextDouble();

        double imc = peso/(altura * altura);

        System.out.println("O calculo do IMC sendo peso/altura² é: " + imc);

        scanner.close();

    }
}
