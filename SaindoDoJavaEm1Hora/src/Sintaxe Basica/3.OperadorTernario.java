public class 3.OperadorTernario {
    public static void main(String[] args) {
        double idade = 22.50;
        String resultado = (idade > 22.60) ? "Maior" : (idade == 22.60) ? "Igual" : "Menor";
        System.out.println(resultado);
    }
}


/*
 * ### Explicação:
- `(idade > 22.60) ? "Maior"`: Se `idade` for maior que `22.60`, o valor "Maior" é atribuído a `resultado`.
- `(idade == 22.60) ? "Igual"`: Se `idade` for igual a `22.60`, o valor "Igual" é atribuído a `resultado`.
- `: "Menor"`: Caso contrário, o valor "Menor" é atribuído a `resultado`.

 É o mesmo exemplo da classe Condicional porém, usando operador ternario
 O operador ternário é usado diretamente dentro do System.out.println.
A estrutura é: (condição) ? valorSeVerdadeiro : valorSeFalso.
Neste caso, se idade > 22.60, imprime "Maior". Se idade == 22.60, imprime "Igual". Caso contrário, imprime "Menor".
 */