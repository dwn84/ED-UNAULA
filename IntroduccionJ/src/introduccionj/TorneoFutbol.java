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
            30, 11,
            11, 12,
            14, 15,
            29, 8,
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
        int maximoGoles = goles[0];
        int tempMaximo = 0;
        double sumaTotalGoles = 0;
        for (int i = 0; i < goles.length; i++) {
            //https://es.wikipedia.org/wiki/Operador_ternario
            //Operador ternario, reemplaza condicional doble
            saltoH = (jugador[i].length() >= 9) ? "\t" : "\t\t";
            /*
            if (jugador[i].length() >= 9) {
                saltoH = "\t";
            } else {
                saltoH = "\t\t";
            }
             */
            saltoH2 = (equipo[i].length() <= 7) ? "\t\t" : "\t";
            /*if (equipo[i].length() <= 7) {
                saltoH2 = "\t\t";
            } else {
                saltoH2 = "\t";
            }*/
            System.out.println((i + 1) + "\t" + jugador[i] + saltoH + equipo[i] + saltoH2 + goles[i]);
            //acumular los goles
            sumaTotalGoles += goles[i];

            //localizar la posición de goles con el valor mas alto
            if (goles[i] > maximoGoles) {
                maximoGoles = goles[i];
                tempMaximo = i;
            }
        }
        double promedio = sumaTotalGoles / goles.length;
        System.out.println("Goleador del torneo");
        System.out.println(jugador[tempMaximo] + ": " + equipo[tempMaximo] + ", goles:" + maximoGoles);
        System.out.println("El promedio de goles es:" + promedio);
        System.out.println("Jugadores con un total de goles anotados inferior al promedio");
        for (int i = 0; i < goles.length; i++) {
            if(goles[i]<promedio){
                System.out.println(jugador[i]);
            }
        }

    }
}