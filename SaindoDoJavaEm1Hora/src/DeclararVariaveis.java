public class DeclararVariaveis {

    public static void main(String[] args) {
        //tipo nome = valor;
        int idade = 22; // hard code, eu poderia escrever sem declarar direto
        int salario;
        salario = 4000;

        // Segunda forma de declaração. Somente para var de escopo local do método onde foi declarada
        var nome = "Fernanda"; // Ñ foi declarado o tipo, só o valor pois vai inferir automáticamente o tipo pelo valor
        var idade; // Ele vai apontar um erro, quando uso o var(palavra reservada) ele não vai conseguir inferir o tipo pelo valor

    }

}
