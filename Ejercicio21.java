/**
 * Exercise: 21
 *
 * @version: 28/10/2022 20:10
 * @author: Juan Manuel Gutiérrez
 *          https://github.com/Juanma-Gutierrez
 */

/*
 * Realiza un programa que genere una secuencia de cinco monedas de curso legal
 * lanzadas al aire. Las monedas disponibles son de 1 céntimo, 2 céntimos, 5
 * céntimos, 10 céntimos, 20 céntimos, 50 céntimos, 1 euro y 2 euros. Las dos
 * posiciones posibles son cara y cruz.
 */
public class Ejercicio21 {
    public static void main(String[] args) {
        // Var declarations
        String coin;
        String headOrTail;

        // Var init
        coin = "";
        headOrTail = "";

        // Process
        for (int i = 0; i < 5; i++) {
            switch ((int) (Math.random() * 7)) {
                case 0:
                    coin = "1 Céntimo: ";
                    break;
                case 1:
                    coin = "2 Céntimos: ";
                    break;
                case 2:
                    coin = "5 Céntimos: ";
                    break;
                case 3:
                    coin = "10 Céntimos: ";
                    break;
                case 4:
                    coin = "50 Céntimos: ";
                    break;
                case 5:
                    coin = "1 euro: ";
                    break;
                case 6:
                    coin = "2 euros: ";
                    break;
            }
            switch ((int) (Math.random() * 2)) {
                case 0:
                    headOrTail = "cara";
                    break;
                case 1:
                    headOrTail = "cruz";
                    break;
            }
            System.out.printf("%-13s%5s\n", coin, headOrTail);
        }
    }

}
