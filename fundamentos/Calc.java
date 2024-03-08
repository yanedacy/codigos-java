

import java.util.Scanner;

public class Calc {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        //mini calculadora sem o uso de estruturas de controle

        System.out.print("Digite o primeiro número: ");
        double num1 = scr.nextDouble();
        System.out.print("Digiite o segundo número: ");
        double num2 = scr.nextDouble();

        System.out.println("Escolha umas operação");
        System.out.println("+ " + " - " + " * " + " /");
        String simbolo = scr.next();

        double resultado = "+".equals(simbolo) ? num1 + num2 : 0;
               resultado = "-".equals(simbolo) ? num1 - num2 : resultado;
               resultado = "*".equals(simbolo) ? num1 * num2 : resultado;
               resultado = "/".equals(simbolo) ? num1 / num2 : resultado;
               resultado = "%".equals(simbolo) ? num1 % num2 : resultado;
               
        System.out.println(resultado);
        scr.close();
    }
}
