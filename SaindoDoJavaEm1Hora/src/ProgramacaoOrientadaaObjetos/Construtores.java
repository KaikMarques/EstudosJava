package ProgramacaoOrientadaaObjetos;
/*
 * Construtores são métodos da nossa classe que vão ser chamados para inicializar uma instência dessa classe
 * 
 * Toda vez que eu criar uma nova instância da classe Main ou a classe que estou usando, eu quero atribuir um nome desse objeto, posso fazer isso através do construtor
 * O construtor é um método e ele tem que ter o mesmo nome da classe
 */

public class Construtores {
    String nome;
    int idade;
    static String nome2;
    public static void main(String[] args) {
        
    }

    // Construtor é um método que vai ser chamado toda vez que uma nova instância dessa classe for criada "new Construtor()"
    public Construtores(String nome ){// Fazendo a inicialização do meu objeto, como por exemplo atribuir o nome do objeto "String nome;" recebendo por parametro uma String no colchetes
        this.nome = nome; // O nome dessa instancia vai ser nome
    // Um construtor não precisa necessáriamente ser publico, publico quer dizer que ele é visível a todas as outras classes
    // Private é somente essa classe que vai conseguir ver esse construtor
    }

    public Construtores(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }
}

class Pessoa {
    void criaConstrutores(){
        Construtores meuConstrutores = new Construtores("Kaik"); // Ele está esperando receber uma string, se eu não passar vai apresentar erro
    }
}
