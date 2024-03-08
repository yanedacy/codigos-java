package controle;

import java.util.Scanner;

public class MediaAlunos {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        //programa para calcular a media das notas e informa o valor total delas
        //junto a um contador que irá mostrar quantas notas válidas foram digitadas
        double grades = 0;
        double overallGrades = 0;
        int validGrades = 0;

        System.out.println("Para sair do programa digite '-1'");
        System.out.print("Nome do aluno: ");
        String studentName = scr.nextLine();
        System.out.println("Digite as notas logo abaixo");

        while (grades != -1) {
            System.out.print(">>> ");
            grades = scr.nextDouble();

            if (grades == -1) {
                break;                
            }

            if (grades >= 0 && grades <= 10) {
                overallGrades += grades;
                validGrades++;
            }else {
                System.out.println("Insira uma nota válida");
            }
        }

        double gradeAverage = overallGrades / validGrades;
        System.out.printf("O aluno(a) %s ficou com uma média de %.1f %n" +
                          "Soma total das notas >> %.1f %n" +
                          "Notas válidas digitadas >> %d", studentName, gradeAverage, overallGrades, validGrades);
        scr.close();
    }    
}
