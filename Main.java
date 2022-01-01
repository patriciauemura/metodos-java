package br.com.dio.exercicios.metodos;

/* EXERCÍCIOS
* 1 - Calcule as 4 operações básicas: soma, subtração,  multiplicação e divisão. Sempre 2 valores devem ser passados.
* 2 - A partir da hora o dia, informe a mensagem adequada: Bom dia, Boa tarde e Boa noite.
* 3 - Calcule o valor final de um empréstimo, a partir do valor solicitado. Taxas e parcelas influenciam. Defina arbitrariamente as faixas que influemciam nos valores
*4 - Crie uma aplicação que calcula a área dos 3 quadriláteros notáveis: quadrado, retângulo e trapézio. (use sobrecarga)
* 5 - Recrie a aplicação que calcula a área dos quadriláteros notáveis. Agora faça os métodos retornarem valores.
*
* OBSERVAÇÕES
* - tente ao máximo criar métodos que trabalhem sozinhos ou em conjunto
* - pode chamar um método dentro de outro
* - pode passar como parâmetro, a chamada de um outro método
* */
public class Main {
    public static void main(String[] args) {

        // Calculadora
        System.out.println("Exercício calculadora");
        Calculadora.soma(3, 6);
        Calculadora.subtracao(9, 1.8);
        Calculadora.multiplicacao(7,8);
        Calculadora.divisao(5,2.5);

        // Mensagem
        System.out.println("Exercício mensagem");
        Mensagem.obterMensagem(5);
        Mensagem.obterMensagem(14);
        Mensagem.obterMensagem(21);

        // Emprestimo
        System.out.println("Exercício empréstimo");
        Emprestimo.calcular(1000, Emprestimo.getDuasParcelas());
        Emprestimo.calcular(1000, Emprestimo.getTresParcelas());
        Emprestimo.calcular(1000, 5);

        // Quadrilatero
        System.out.println("Exercício quadrilátero");
        Quadrilatero.area(3);
        Quadrilatero.area(5d,5d);
        Quadrilatero.area(7,8,9);
        Quadrilatero.area(5f,5f);

        // Retorno
        System.out.println("Exercício retornos");

        double areaQuadrado = Quadrilatero2.area(3);
        System.out.println("Área do quadrado: " + areaQuadrado);

        double areaRetangulo = Quadrilatero2.area(5,5);
        System.out.println("Área do retângulo: " + areaRetangulo);

        double areaTrapezio = Quadrilatero2.area(7,8,9);
        System.out.println("Área do trapézio: " + areaTrapezio);

    }
}
