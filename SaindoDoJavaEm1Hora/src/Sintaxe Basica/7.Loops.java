package Sintaxe Basica;

public class 7.Loops {
    public static void main(String[] args) {
        /*
         * Loop FOR:
         * O for loop é ideal para quando você sabe com antecedência quantas vezes o loop deve ser executado. 
         * Ele combina a inicialização, a condição e a atualização em uma única linha, o que pode tornar o código mais compacto e fácil de ler quando o número de iterações é conhecido.
         *  Sintaxe: for (inicialização; condição; atualização) 
         * 
         * for (int i = 0; i < 5; i++) {
         *      System.out.println(i)
         * }
         * 
         * Inicialização: int i = 0 (executado uma vez antes do início do loop)
         * Condição: i < 5 (verificada antes de cada iteração).
         * Atualização: i++ (executado após cada iteração).
         */

        // FOR
        int idade = 10;
        // declarei a variavel i que quero observar, se i for menor que idade, i++ quer dizer que vai adicionar mais 1 a cada interação
        for(var i = 0; i < idade; i++) {
            System.print.outln("oi");
        }

        /*
         * Loop WHILE:
         * O while loop é mais flexível e é usado quando você não sabe com antecedência quantas vezes o loop será executado. 
         *  Ele executa o bloco de código enquanto a condição for verdadeira. A inicialização e a atualização ocorrem fora da estrutura do loop, 
         * o que pode resultar em um código mais verboso se você não tomar cuidado com a atualização da condição.         * 
         * 
         * Sintaxe: while (condição) {
         * // Código a ser executado em cada iteração
         * // Atualização da condição deve ocorrer aqui para evitar um loop infinito }
         * 
         * Condição: i < 5 (verificada antes de cada iteração).
         * Atualização: i++ (deve ser feita dentro do bloco de código para evitar um loop infinito).
         */

        // WHILE 
        // obs: No caso do for não preciso declarar o i, porém no while eu preciso por conta da sintaxe
        int i = 0;
        // Meu código irá executar 9 vezes, quando chegar em 10 vezes ele não vai executar porque vai ser igual
        while(i < idade){ 
            i++;
        }
    }
}
