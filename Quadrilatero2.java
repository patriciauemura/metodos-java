package br.com.dio.exercicios.metodos;
/*5 - Recrie a aplicação que calcula a área dos quadriláteros notáveis. Agora faça os métodos retornarem valores.*/

public class Quadrilatero2 {

    public static double area(double lado){
        return lado * lado;
    }

    public static double area(double lado1, double lado2){
        return lado1 * lado2;
    }

    public static double area(double baseMaior, double baseMenor, double altura){
        return ((baseMaior * baseMenor)*altura) / 2;
    }

}
