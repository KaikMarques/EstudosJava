package ProgramacaoOrientadaaObjetos;

/* Modificadores de acesso determinam o nível de visibilidade das nossas classes dos atributos dessas classes 
 * e dos métodos dessas classes, sendo uma palavra reservada public static void main(String[] args), sendo PUBLIC a palavra reserda
 * 
 * Qualquer outra classe do meu programa que criar uma instancia da classe Main/ModificadoresAcesso fazendo um New Main ou New ModificadoresAcesso ela vai ter visibilidade do método static void
 * e conseguimos fazer isso nos atribudos
 * 
 */
public class ModificadoresAcesso {// modificador de acesso public, significa que essa classe ModificadoresAcesso está visivel para todas outras classes do meu programa e o método voi main também

    public String name; // atributo name será visivel para todas as outras classes que criaram uma instancia da minha classe Main

    protected int salary; // a classe Pessoa não vai conseguir modificar

    // protected int salary; // agora a classe pessoa vai conseguir ver o salary porque, o protected irá proteger o atributo ou método ou classe
    // somente para classes externas. Então classes que estiverem no mesmo pacote e classe mãe tem a visibilidade. Classes de fora de outros pacote não tem 
    public static void main(String[] args) { // método static não pertence as instancias e sim a classe, porque quando eu executo o java no terminal ele vai executar este método primeiro
    // ele recebe strings como argumentos, são arguementos que posso usar no terminal    
        // Ser meuSerAnimal = new Ser(); // Se eu colocar new Pessoa não vai apresentar erro porque toda subclasse é do tipo super classe 
        Ser meuSerAnimal = new Pessoa("Kaik", 22, "Marques");
        meuSerAnimal.setNome("Kaik");
        meuSerAnimal.saudacao();


        // Um Ser é do tipo Pessoa, porém eu não poderia fazer o inverso
        Pessoa minhaPessoa = new Ser(); // erro pois uma superclasse não pode ser uma suibclasse
}

    // void atualizaSalario(){ método com modificador de visualização publico
    private void atualizaSalario(){
        this.salary = 4000; // tenho acesso porque a classe ModificadoresAcesso somente ela pode visualizar 
    }

    public int getSalary(){
        this.atualizaSalario(); // aqui consigo chamar o método atualizaSalario porque é uma instancia da própria classe
        return this.salary; // a minha classe pessoa posso chamar esse getSalary
    }

}
