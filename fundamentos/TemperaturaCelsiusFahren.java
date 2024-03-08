import java.util.Scanner;

public class TemperaturaCelsiusFahren {
    public static void main(String[] args) {
        Scanner scr= new Scanner(System.in);
        final double num1 = 32;
        final double num2 = 9.0 / 5.0;

        System.out.print("Grau Celsius >> ");
        double celsius = scr.nextInt();

        double fahren = (celsius * num2) + num1;
        
        System.out.print("Grau fahren = " + fahren);


        scr.close();
    }    
}
