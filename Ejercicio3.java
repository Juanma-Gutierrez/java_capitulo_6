/**
 * Exercise: 3
 *
 * @version: 27/10/2022 20:34
 * @author: Juan Manuel Gutiérrez
 *          https://github.com/Juanma-Gutierrez
 */

/*
 * Igual que el ejercicio anterior pero con la baraja española. Se utilizará la
 * baraja de 40 cartas: 2, 3, 4, 5, 6, 7, sota, caballo, rey y as.
 */
public class Ejercicio3 {
    public static void main(String[] args) {
        // Var declarations
        int num;
        int suit;
        String numLit;
        String suitLit;

        // Var init
        numLit = "";
        suitLit = "";

        // Process
        num = (int) (Math.random() * 10) + 1;
        suit = (int) (Math.random() * 4) + 1;

        // Output data
        switch (num) {
            case 1:
                numLit = "As";
                break;
            case 8:
                numLit = "Sota";
                break;
            case 9:
                numLit = "Caballo";
                break;
            case 10:
                numLit = "Rey";
                break;
            default:
                numLit = String.valueOf(num);
                break;
        }
        switch (suit) {
            case 1:
                suitLit = "Oros";
                break;
            case 2:
                suitLit = "Copas";
                break;
            case 3:
                suitLit = "Espadas";
                break;
            case 4:
                suitLit = "Bastos";
                break;
        }
        System.out.print("La carta escogida es: " + numLit + " de " + suitLit);
    }
}
