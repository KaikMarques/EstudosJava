package ProgramacaoOrientadaaObjetos;
/*
 * Estudo sobre Herança e Polimorfismo
 * 
 * Em Java, herança é um dos principais pilares da Programação Orientada a Objetos (POO). 
 * A herança permite que uma classe (subclasse ou classe filha) adquira as propriedades e 
 * comportamentos (atributos e métodos) de outra classe (superclasse ou classe pai).
 * 
 * Reutilização de Código: A herança permite que você reutilize código da superclasse na subclasse, promovendo a reutilização e manutenção de código mais fácil.
 * Sobrescrita de Métodos: A subclasse pode sobrescrever métodos da superclasse para modificar ou estender o comportamento herdado. Isso é feito usando a anotação @Override.
 * Herança Múltipla: Java não suporta herança múltipla (uma classe não pode herdar de mais de uma superclasse diretamente). No entanto, esse conceito pode ser simulado usando interfaces.
 * 
 */

class Ser {
    String nome;
    int idade;

    public Ser(String nome, int idade){
        this.idade = idade;
        this.nome = nome;
    }

    void setNome(String nome){
        this.nome = nome;
    }

    void setIdade(int idade){
        this.idade = idade;
    }
}
 

public class Pessoa extends Ser { // posso chamar o construtor da minha superclasse dentro da subclasse 
    String sobrenome;

    public Pessoa(String nome, int idade, String sobrenome){
        // Poderia fazer como no exemplo abaixo
        // this.idade = 22;
        // this.nome = "Kaik";



        // Poderia fazer simplemente como no exemplo abaixo
        super(nome, idade);
        this.sobrenome = sobrenome; 

    }
    
    void criaMain(){
        ModificadoresAcesso meuMain = new ModificadoresAcesso();
        System.out.println(meuMain.name);
        System.out.println(meuMain.salary);
        this.idade = 22;

    }

    @Override
    public String saudacao(){
        return "Olá, meu nome é" + this.nome;
    }
}
