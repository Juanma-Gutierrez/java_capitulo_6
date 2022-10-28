/**
 * Exercise: 16
 *
 * @version: 28/10/2022
 * @author: Juan Manuel Gutiérrez
 *          https://github.com/Juanma-Gutierrez
 */

/*
 * Realiza un simulador de máquina tragaperras simplificada que cumpla los
 * siguientes requisitos:
 * a) El ordenador mostrará una tirada que consiste en mostrar 3 figuras. Hay 5
 * figuras posibles: corazón, diamante, herradura, campana y limón.
 * b) Si las tres figuras son diferentes se debe mostrar el mensaje “Lo siento,
 * ha perdido”.
 * c) Si hay dos figuras iguales y una diferente se debe mostrar el mensaje
 * “Bien, ha recuperado su moneda”.
 * d) Si las tres figuras son iguales se debe mostrar “Enhorabuena, ha ganado 10
 * monedas”.
 * 
 */

public class Ejercicio16 {
    public static void main(String[] args) {
        // Var declarations
        int lucky;
        String luckyChar;
        String figure1;
        String figure2;
        String figure3;

        // Input data
        luckyChar = "";
        figure1 = "";
        figure2 = "";
        figure3 = "";

        // Process
        for (int i = 0; i < 3; i++) {
            lucky = (int) (Math.random() * 5);
            switch (lucky) {
                case 0:
                    luckyChar = "Corazon";
                    break;
                case 1:
                    luckyChar = "Diamante";
                    break;
                case 2:
                    luckyChar = "Herradura";
                    break;
                case 3:
                    luckyChar = "Campana";
                    break;
                case 4:
                    luckyChar = "Limón";
                    break;
            }
            switch (i) {
                case 0:
                    figure1 = luckyChar;
                    break;
                case 1:
                    figure2 = luckyChar;
                    break;
                case 2:
                    figure3 = luckyChar;
                    break;
            }
        }

        // Output data
        System.out.println(figure1 + "  " + figure2 + "  " + figure3);

        if (figure1 == figure2 && figure2 == figure3) {
            System.out.print("Enhorabuena, ha ganado 10 monedas");
        } else if (figure1 == figure2 || figure2 == figure3 || figure1 == figure3)
            System.out.print("Bien, ha recuperado su moneda");
        else
            System.out.print("Lo siento, ha perdido");

    }
}
