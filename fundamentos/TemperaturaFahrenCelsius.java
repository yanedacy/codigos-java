import java.util.Scanner;

public class TemperaturaFahrenCelsius {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        final int num1 = 32;                  
        final double num2 = 5.0 / 9.0;
        
        System.out.print("Grau fahren: ");
        double fahren = scr.nextDouble();
        double celsius = (fahren - num1) * num2;

        System.out.println("Graus celsius = " + celsius);

        scr.close();
    }
}
