/*
    Exemplo de conversao de graus celsisus para farenheit

    F = C * 9/5 + 32

    Pergunta 1: preciso informar dado?  SIM! Os graus celsius
        Entrada = Temperatura em Celsius
        Processamento = ? Basicamente aplica a formula, tendo em maos 
                        o valor da temperatura em C
        Saida = Temperatura em Farenheint

*/


import java.util.Scanner;
public class ConversorCF{
    public static void  main(String args[]) {
        Scanner teclado;
        teclado = new Scanner(System.in);
        float tC, tF;
        System.out.println("Digite a temperatura em Celsius = ");
        //entrada
        
        tC = teclado.nextFloat();

        // processamento

        tF = tC * 9/5 + 32;

        //saida

        System.out.println ("Temperatura em Farenheint =" + tF);
        
    }


}