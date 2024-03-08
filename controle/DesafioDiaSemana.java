package controle;

import java.util.Scanner;

public class DesafioDiaSemana {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        //programa para ler os dias da semana
        System.out.println("Informe o dia da semana logo abaixo.");
        System.out.print("Dia >> ");
        String diaSemana = scr.nextLine();

        if (diaSemana.equalsIgnoreCase("Domingo")) {
            System.out.println(1);            
        }else if (diaSemana.equalsIgnoreCase("Segunda")) {
            System.out.println(2);            
        }else if (diaSemana.equalsIgnoreCase("Terça") || diaSemana.equalsIgnoreCase("terca")) {
            System.out.println(3);            
        }else if (diaSemana.equalsIgnoreCase("Quarta")) {
            System.out.println(4);            
        }else if (diaSemana.equalsIgnoreCase("Quinta")) {
            System.out.println(5);
        }else if (diaSemana.equalsIgnoreCase("Sexta")) {
            System.out.println(6);
        }else if (diaSemana.equalsIgnoreCase("Sábado") || diaSemana.equalsIgnoreCase("Sabado")) {
            System.out.println(7);
        }else {
            System.out.println("choose a valid day of the week");
        }


        scr.close();
    }
}
