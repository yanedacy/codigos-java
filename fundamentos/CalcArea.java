import java.util.Scanner;

public class CalcArea {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        //programa para calcular a área de um triângulo

        System.out.println("Enter the base and height of the triangle");
        System.out.print("Base >> ");
        int base = scr.nextInt();

        System.out.print("Height >> ");
        double height = scr.nextInt();

        final double area = (base * height) / 2;
        System.out.println("Área = " + area);

        scr.close();
    }
}
