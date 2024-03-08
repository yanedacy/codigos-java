import java.util.Scanner;

public class Imc {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        //programa para ler o IMC do usuário

        System.out.println("Calcular IMC.");
        System.out.print("Altura >> ");
        double userAltura = scr.nextDouble();

        System.out.print("Peso >> ");
        double userPeso = scr.nextDouble();

        final double imc = userPeso / Math.pow(userAltura, 2);
        System.out.printf("Seu imc é >> %.1f ", imc);


        scr.close();
    }
}
