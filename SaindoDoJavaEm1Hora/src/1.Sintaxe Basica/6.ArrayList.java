package 1.Sintaxe Basica;

import java.util.ArrayList;

public class 6.ArrayList {
    public static void main(String[] args) {
        //Array é uma classe que vem dentro da biblioteca padrão do java chamado java.util ela nada mais é do que uma estrutura de dados para representar uma lista dinâmica
        
        // Inicializando array dinamico sem valor e tamanho
        ArrayList<Integer> idades = new ArrayList<Integer>(); // Não posso passar tipo primitivo, tenho que pegar da classe integer que é nativa do java igual a classe string
        
        // adicionando valores no array
        idades.add(22);
        idades.add(30);
        idades.add(50);

        // Removendo valores no array
        idades.remove(0); // passei o index 0, assim será removido o 22

       // Pegando um valor
       idades.get(1); // passei o index 1, assim será retornado o valor 30
       
       // Vendo o tamanho do array
       idades.size();

       


    }
    
}
