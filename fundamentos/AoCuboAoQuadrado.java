import java.util.Scanner;

public class AoCuboAoQuadrado {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        //programa para ler o valor ao cubo e ao quadrado do número informado

        System.out.print("Informe um número: ");
        double num = scr.nextInt();

        System.out.println(num + " ao quadrado = " + Math.pow(num, 2));
        System.out.println(num + " ao cubo: " + Math.pow(num, 3));

        scr.close();
    }    
}
