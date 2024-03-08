import java.util.Scanner;

public class DesafioConversao {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        //Programa para calcular a média dos últimos 3 salários
        System.out.print("Primeiro salário: ");
        String num1 = scr.nextLine().replace(",", ".");

        System.out.print("Segundo salário: ");
        String num2 = scr.nextLine().replace(",", ".");

        System.out.print("Terceiro salário: ");
        String num3 = scr.nextLine().replace(",", ".");

        double wage1 = Double.parseDouble(num1);
        double wage2 = Double.parseDouble(num2);
        double wage3 = Double.parseDouble(num3);

        double mediaWage = (wage1 + wage2 + wage3) / 3;
        System.out.println("A média dos salários são >> " + mediaWage);
        scr.close();
    }
}