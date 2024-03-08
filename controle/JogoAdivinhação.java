package controle;

import java.util.Random;
import java.util.Scanner;

public class JogoAdivinhação {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scr = new Scanner(System.in);
        // programa para tentar adivinhar um número de 0 à 100
        // o jogador possui 10 chances
        int randomNumber = random.nextInt(100);

        System.out.println("Bem-vindo(a) ao jogo da adivinhação.");
        System.out.println("Um jogo para adivinhar o número que foi gerado, em um intervalor de 0 a 100.");
        System.out.println("Você terá 10 chances.");

        for (int i = 10; i >= 1; i--) {
            System.out.print("Faça os seus palpites >> ");
            int num = scr.nextInt();

            if (num == randomNumber) {
                System.out.println("You did it bro. <3");  
                break;                                            
            }else if (num < randomNumber) {
                System.out.println("Wrong, o palpite foi menor que o número gerado, you have " + (i - 1) + " remaining attempts. You can do it");                         
            }else {
                System.out.println("Wrong, o palpite foi maior que o número gerado, you have " + (i - 1) + " remaining attempts. You can do it");                         
            }

            System.out.println("Número correto era " + randomNumber + ", na próxima você consegue.");
            

        } 
        scr.close();
    }       
}
