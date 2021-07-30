/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package introduccionj;

/**
 *
 * @author samaniw
 */
public class TorneoFutbol {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        Elaborar un programa en Java que permita: 
        mostrar la lista de jugadores, 
        su equipo y goles respectivos. 
        El nombre y equipo del goleador 
        y de los jugadores con un numero 
        de goles anotados menor al promedio general. 

         */
        String jugador[] = {
            "Gameiro", "Gerard",
            "Morata", "Aduriz",
            "Griezmann", "Aspas",
            "Cristiano", "Boateng",
            "Luis Suárez", "Sandro",
            "Juanmi", "Pedro León",
            "Neymar", "Piatti",
            "Willian José", "Benzema",
            "Ben Yedder", "Rubén Castro",
            "Enrich", "Messi"
        };
        String equipo[] = {
            "Atlético", "Espanyol",
            "Real Madrid", "Athletic",
            "Atlético", "Celta",
            "Real Madrid", "Las Palmas",
            "Barcelona", "Málaga",
            "R. Sociedad", "Eibar",
            "Barcelona", "Espanyol",
            "R. Sociedad", "Real Madrid",
            "Sevilla", "Betis",
            "Eibar", "Barcelona"
        };
        int goles[] = {
            10, 11,
            11, 12,
            14, 15,
            19, 8,
            24, 8,
            8, 9,
            9, 9,
            9, 9,
            9, 10,
            10, 27
        };
        System.out.println("Listado de jugadores");
        System.out.println("#\tNombre\t\tEquipo\t\tGoles anotados");
        String saltoH = "\t";
        String saltoH2 = "\t";
        for (int i = 0; i < goles.length; i++) {
            //Operador ternario, reemplaza condicional doble
            saltoH =(jugador[i].length() >= 9)?"\t":"\t\t";
            /*
            if (jugador[i].length() >= 9) {
                saltoH = "\t";
            } else {
                saltoH = "\t\t";
            }
            */
            saltoH2 =(equipo[i].length() <= 7)?"\t\t":"\t";
            /*if (equipo[i].length() <= 7) {
                saltoH2 = "\t\t";
            } else {
                saltoH2 = "\t";
            }*/
            System.out.println((i + 1) + "\t" + jugador[i] + saltoH + equipo[i] + saltoH2 + goles[i]);

        }

    }

}
