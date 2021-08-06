package introduccionj;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author samaniw
 */
public class IntroduccionJ {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        //Código principal
        int p = 0;
        String n = "sdf";
        double y = 2.22;
        boolean bandera = true;

        //Console.WriteLine()
        System.out.println("Hola mundo");
        //Console.ReadLine()
        Scanner teclado = new Scanner(System.in);
        String dato = teclado.nextLine();
        String nombre = teclado.nextLine();
        Scanner teclado2 = new Scanner(System.in);
        int a = teclado2.nextInt();
        //nuevo arreglo de datos tipo entero
        //crear un objeto
        int misDatos[] = new int[10];
        misDatos[0] = 22;
        misDatos[1] = 33;
        misDatos[2] = teclado2.nextInt();
        System.out.println("El dato es:" + misDatos[1]);
        for (int i = 0; i < misDatos.length; i++) {

        }
         */
        char array[];
        array = new char[7];
        Random r = new Random();
        //forma tradicional de recorrer un arreglo
        for (int x = 0; x < array.length; x++) {
            array[x] = (char) (r.nextInt(26) + 'a');
            System.out.println(array[x]);
        }
        //foreach
        //recorrido automático de un arreglo
        double info[] = new double[]{2, 5, 2, 7, 9, 3, 1};
        for (double dato : info) {
            System.out.println(dato);
        }
        System.out.println("");
        //arreglo bidimensional - matriz - tabla
        //estructura uniforme 
        int datos[][] = new int[3][4];
        //estructura irregular
        int publicaciones[][] = new int[4][];
        publicaciones[0] = new int[2];
        publicaciones[1] = new int[4];
        publicaciones[2] = new int[1];
        publicaciones[3] = new int[5];
        //crear e inicializar arreglo matriz
        int matriz[][] = {{1, 2, 1}, {3, 4, 1}, {5, 6, 1}, {7, 8, 1}};
        System.out.println("Total de filas del arreglo: " + matriz.length);
        System.out.println("Total de columnas del arreglo: " + matriz[0].length);
        //contador i se encarga de controlar indice de filas
        for (int i = 0; i < matriz.length; i++) {
            //contador i se encarga de controlar indice de columnas
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print("\t" + matriz[i][j]);
            }
            System.out.println("");

        }

        //arreglo tridimensional - cubo
        int cuboDatos[][][] = new int[3][4][2];

        //mostrar datos originales del arreglo (sin ordenar)
        for (double dato : info) {
            System.out.print(dato);
        }
        //Invocación o llamado del procedimiento
        ordenarInsercion(info);
        System.out.println("");
        //comprobar el ordenamiento
        for (double dato : info) {
            System.out.print(dato);
        }
    }

    //crear un nuevo método o procedimiento para
    //que sea invocado o utilizado en el main
    public static void ordenarBurbuja(double[] arreglo) {
        System.out.println("Ordenando...");
        double aux;
        for (int i = 1; i < arreglo.length; i++) {
            for (int j = 0; j < (arreglo.length - i); j++) {
                if (arreglo[j] > arreglo[j + 1]) {
                    aux = arreglo[j];
                    arreglo[j] = arreglo[j + 1];
                    arreglo[j + 1] = aux;
                }
            }
        }
    }

    public static void ordenarInsercion(double[] arreglo) {
        double aux;
        int j;
        for (int i = 1; i < arreglo.length; i++) {
            aux = arreglo[i];
            j = i;
            while (j > 0 && arreglo[j - 1] > aux) {
                arreglo[j] = arreglo[j - 1];
                j--;
            }
            arreglo[j] = aux;
        }
    }
}
