/**
 * Exercise: 10
 *
 * @version: 28/10/2022 08:53
 * @author: Juan Manuel Gutiérrez
 *          https://github.com/Juanma-Gutierrez
 */

/*
 * Realiza un programa que pinte por pantalla diez líneas formadas por
 * caracteres. El carácter con el que se pinta cada línea se elige de forma
 * aleatoria entre uno de los siguientes: *, -, =, ., |, @. Las líneas deben
 * tener una longitud aleatoria entre 1 y 40 caracteres.
 */

public class Ejercicio10 {
    public static void main(String[] args) {
        // Var declarations
        String charac;
        int num;

        // Var init
        charac = "";

        // Process
        for (int i = 0; i < 10; i++) {
            num = (int) (Math.random() * 6);
            switch (num) {
                case 0:
                    charac = "*";
                    break;
                case 1:
                    charac = "-";
                    break;
                case 2:
                    charac = "=";
                    break;
                case 3:
                    charac = ".";
                    break;
                case 4:
                    charac = "|";
                    break;
                case 5:
                    charac = "@";
                    break;
            }
            num = (int) (Math.random() * 40) + 1;
            for (int j = 0; j < num; j++) {
                System.out.print(charac);
            }
            System.out.println();
        }
    }
}
