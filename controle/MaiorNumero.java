package controle;

import java.util.Scanner;

public class MaiorNumero {
    public static void main(String[] args) {
        //programa que recebe 10 valores e ao final imprime o maior número.
        Scanner scr = new Scanner(System.in);
        double num2 = 0;

        System.out.println("Digite os números logo abaixo: ");

        for (int i = 1; i <= 10; i++) {
            System.out.print(">>> ");
            double num1 = scr.nextDouble();

            if (num1 > num2) {
                num2 = num1;                                                
            }
        }

        System.out.println("O maior número é " + num2);
        scr.close();
    }
}
