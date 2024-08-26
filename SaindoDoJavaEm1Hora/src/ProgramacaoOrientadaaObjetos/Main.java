package ProgramacaoOrientadaaObjetos;

public class Main {
    String nome; // Este atributo eu posso referênciar em todos os métodos que pertencem à instância da minha classe poo.9.classes

    static String nome2;

    public static void main(String[] args) { // Como este é um método static, não irei conseguir fazer referência ao atribudo String nome; 
        // porque quando é declarado métodos que são do tipo static, ele pertence a classe poo.9.classes e não as instâncias de objetos
        // Classes servem para podermos modelar os nossos objetos, e modelamos eles através de atributos e de comportamentos
        // Declaramos esses comportamentos através dos métodos
        
        // System.out.println(nome); // retorna o erro: non-static variable nome cannot be referenced from a static context(errors(3): 12:9-12:34)
        System.out.println(nome2); // agora não irá retornar erro, porque o método statico consegue enchergar o static String nome2;
        
              
    }
    static void teste(){

    }
    void declaraNome(){
        System.err.println(nome2);
        nome = "Fernanda";
        Main.teste();

        Main.declaraNome(); // diz que não existe porque não é um método static ele é um método que pertence a instância declararNome()
        // Eu só conseguiria fazer isso:
        Main meuMain = new Main(); // Preciso criar um objeto, acabei de criar uma instância dessa classe e fiz a criação de um objeto e assim consigo fazer a chamada a esses métodos
        meuMain.declaraNome();
        System.out.println(meuMain.nome);

    }

    String getNome(){
        return nome; // vai retornar o nome de String nome;
    }
    
}