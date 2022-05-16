/*
*Crie uma variavel que ira guardar um valor de um salario
*Calcule a porcentagem desse salario, os valores da porcentagem serao
*30%
*15%
*5%
A cada vez que voce calcular guarde o resultado em uma variavel
Imprima o resultado e reutilize a variavelque guarda o resultado para o novo calculo
 */
public class ReutilizandoVariaveis {
    public static void main (String [] args) {
        double salario = 5000;
        double resultado = salario * 0.3;
        System.out.println ("30% eh:" + resultado);
        resultado = salario  * 0.15;
        System.out.println ("15% eh:" + resultado);
        resultado = salario * 0.05;
        System.out.println ("5% eh:" + resultado);
    }
}
