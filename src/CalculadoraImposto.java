/*
 *Crie uma classe que calcule uma determinada porcentagem de um dado salario
 *Criar uma classe
 *Aceitar um valor de entrada para o salario
 *Definir o valor da porcentagem
 *Calcular a porcentagem
 */

public class CalculadoraImposto {
    public static void main (String [] args) {
        float salario = 2500.00F;
        float porcentagem = 30;
        float porcentagemDoSalario = salario * (porcentagem /100);
        System.out.println (porcentagemDoSalario);
    }
}
