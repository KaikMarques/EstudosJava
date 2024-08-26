package 1.Sintaxe Basica;

public class 8.Casting {
    // Casting é transformar o valor de um tipo para outro tipo: do tipo interiro para double
    // No Java podemos fazer o casting #Implicito e #Explicito
    public static void main(String[] args) {
        // Casting Implicito: quando faz a transformação de um tipo para outro sem declarar que estamos fazendo essa transformação como no caso do int para double 
        int idade1 = 22;
        double idade2 = idade1;

        // Fazendo o inverso não seria possivel porque o double é maior do que o inteiro, seria possivel somente com casting explicito
        // idade1 = idade2;

        // Casting Explicito
        idade1 = (int) idade2;

        char letra = 'a';
        String nome = String.valueOf(letra); // no caso da string preciso usar a classe String e o método valueOf

        // Transformando uma String num char
        letra = nome.charAt(0); // letra recebo o caracter de nome na possivel(index) 0

        // Transformando INT em String
        String nome2 = String.valueOf(idade1);

        // Transformando uma String em INT
        // Obs: Só é possivel com numero
        idade1 = Integer.parseInt(nome2);

        

/*
 * Em Java, casting é o processo de converter uma variável de um tipo de dados para outro. Existem dois tipos principais de casting:
 * 1. Casting de Tipos Primitivos (Casting Implícito e Explícito)
 * 
 * Casting Implícito (Widening Casting)
 * Descrição: Acontece automaticamente quando você converte um tipo de dados menor (como int) para um tipo maior (como double). Isso é seguro porque não há perda de informação.
 * int numeroInteiro = 10;
 * double numeroDouble = numeroInteiro;  // Casting implícito
 * 
 * Casting Explícito (Narrowing Casting)
 * Descrição: Quando você converte um tipo de dados maior (como double) para um tipo menor (como int). Isso requer uma conversão explícita porque pode haver perda de dados
 * 
 * class Animal {}
 * class Cachorro extends Animal {}
 * Animal animal = new Cachorro(); // Casting implícito
 * Cachorro cachorro = (Cachorro) animal; // Casting explícito
 * 
 * Cuidados ao Fazer Casting
 * 
 * Casting Implícito: Geralmente, não há riscos porque a conversão não reduz o valor (como converter int para double), mas sempre esteja ciente do tipo de dados.
 * Casting Explícito: Pode causar perda de dados (como converter double para int). É importante garantir que o valor a ser convertido está dentro dos limites do tipo de destino
 * Casting entre Tipos de Objetos: Pode gerar ClassCastException se a conversão não for válida, como tentar converter um objeto de uma classe para uma classe que não faz parte da sua hierarquia. Sempre use o operador instanceof para verificar se a conversão é segura
 * 
 * 
 * Exemplo de verificação com instanceof:
 * 
 * if (animal instanceof Cachorro) {
 *   Cachorro cachorro = (Cachorro) animal; // Safe casting
 * }
 * 
 */


    }
    
}
