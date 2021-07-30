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
        double info[] = new double[]{1.1,2.2,3.3,4.4,5.5,6.6};
        for (double dato : info) {
            System.out.println(dato);
        }
        System.out.println("");
    }

}
