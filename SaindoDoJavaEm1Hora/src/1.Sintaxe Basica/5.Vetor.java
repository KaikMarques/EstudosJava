package 1.Sintaxe Basica;

public class 5.Vetor {
    public static void main(String[] args) {
        /*
         * Para declarar um array preciso passar os tipos dos dados que serão armazenados no array e indicar que tem um array
         */

        // int[] idades; Eu preciso inicializar o array, não posso declarar "idade[0] = 22;" porque não foi inicializado o array, não foi informado quantos elementos vou armazenar
    
        // exemplo 1
        int[] idades =  {2,3,4};
        idades[0] = 4; // desta forma eu inicializei com tamanho 3, e no array idade eu substitui o valor da posição 0 que é o 2, por 4
    
        // exemplo 2
        int[] idades = new int[10]; // declarei o tamanho do array como 10 e depois irei fazer a atribuição dos valores
        String[] nomes = new String[10];
        boolean[] saoBrasileiros = new boolean[10];
        boolean[] saoBrasileiross = {true, false, true};
        // Desta forma meu array fica limitado pois tem tamanho fixo, ele não é dinamico
        // não poderia declarar que "saoBrasileiross[5]" porque esse index não está no range desse array, ele foi declarado como 3 valores

        // Vendo o tamanho do array/vetor
        int[] idades1 = new int[10];
        idades1.length();


        // Declarando array no formato dinamico está na aula seguinte em 6.ArrayList


    }
}
