package introduccionj;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;
import java.util.Scanner;
import java.util.Stack;

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
        mostrarArreglo(info);
        //Invocación o llamado del procedimiento
        ordenarSeleccion(info);
        System.out.println("");
        //comprobar el ordenamiento
        mostrarArreglo(info);
        //Invocar el método de búsqueda secuencial
        boolean respuesta = buscarSecuencial(info, 5);
        if (respuesta) {//validar si el objeto respuesta es verdadero (verdadero == true)
            System.out.println("Dato encontrado");
        } else {
            System.out.println("Dato no existente");
        }

        //Invocar el método de búsqueda secuencial
        boolean respuesta2 = buscarBinaria(info, 3);
        if (respuesta2) {//validar si el objeto respuesta es verdadero (verdadero == true)
            System.out.println("Dato encontrado");
        } else {
            System.out.println("Dato no existente");
        }

        //Pila de datos
        Stack<String> superDatos = new Stack<>();
        superDatos.push("Ana");
        superDatos.push("Jaime");
        superDatos.push("Juan");
        superDatos.push("Angela");
        superDatos.push("Veronica");
        superDatos.push("Eliecer");
        superDatos.push("Melquiades");
        superDatos.pop();
        System.out.println(superDatos);

        Stack<Integer> listado = new Stack<>();
        listado.push(11);
        listado.push(22);
        listado.push(99);
        listado.push(33);
        listado.push(44);
        listado.push(88);
        System.out.println(listado);

        //Colas de datos
        Queue<Double> notasEstudiantes = new LinkedList<>();
        notasEstudiantes.add(4.4);
        notasEstudiantes.add(3.4);
        notasEstudiantes.add(4.9);
        notasEstudiantes.remove();
        System.out.println(notasEstudiantes);
        
        //Para el taller
        //invocar el metodo validarParentesis
        validarParentesis("(5+5)/5");//retorna verdadero
        validarParentesis("5+(5/5))");//retorna falso
        
        
        //crear un objeto de la clase ColaArregloCircular
        ColaArregloCircular c = new ColaArregloCircular(4);
        c.agregar(2);
        c.agregar(3);
        c.agregar(6);
        c.mostrar();//[2,3,6]
        c.borrar();
        c.mostrar();//[3,6]
        c.agregar(7);
        c.agregar(8);
        c.mostrar();//[3,6,7,8]
        c.borrar();
        c.mostrar();//[6,7,8]
        c.agregar(9);
        c.mostrar();//[6,7,8,9]
        c.borrar();
        c.mostrar();//[7,8,9]
        //invocar metodos agregar y eliminar
        //comprobar resultado invocando el metodo mostrar
        
        //realizar conversión de decimal a binario
        System.out.println("Resultado de convertir 715 a binario:"
                + convertirBinario(715));
        
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

    //crear método de ordenamiento por selección
    public static void ordenarSeleccion(double[] arreglo) {
        int minimo;
        double aux;
        for (int i = 0; i < arreglo.length; i++) {
            minimo = i;
            for (int j = i; j < arreglo.length; j++) {
                if (arreglo[j] < arreglo[minimo]) {
                    minimo = j;
                }
            }
            aux = arreglo[i];
            arreglo[i] = arreglo[minimo];
            arreglo[minimo] = aux;

        }

    }

    public static void mostrarArreglo(double[] arreglo) {

        for (double dato : arreglo) {
            System.out.print(dato + " ");
        }
    }

    //Método para buscar un dato de forma secuencial
    public static boolean buscarSecuencial(double[] arreglo, double dato) {
        int temp = 0, i = 0;
        //boolean encontrado = false;
        while (i < arreglo.length) {// && encontrado == false){
            if (arreglo[i] == dato) {
                temp = i;
                System.out.println("Encontrado en la posición:" + temp);
                return true;
                //encontrado  = true;
            }
            i++;
        }
        /*if(encontrado){
            System.out.println("Encontrado en la posición:" + temp);
        }*/
        //return encontrado;
        return false;
    }

    public static boolean buscarBinaria(double[] arreglo, double dato) {
        int inf = 0, sup = arreglo.length - 1;
        int centro;
        do {
            //analizar validación en posiciones pares...
            centro = (int) Math.round((sup + inf) / 2);
            System.out.println(centro);

            if (arreglo[centro] == dato) {
                return true;
            } else if (dato < arreglo[centro]) {
                sup = centro - 1;
            } else {
                inf = centro + 1;
            }

        } while (inf < sup);
        return false;
    }

    //conversion de decimal a binario usando pilas
    public static String convertirBinario(int sistemaDecimal) {
        String binario = "";//registrar los digitos
        Stack<Integer> digitos = new Stack<>();
        while (sistemaDecimal > 0) {
            digitos.push(sistemaDecimal%2);//almacenar el residuo de la división
            sistemaDecimal /= 2;
        }
        
        while(!digitos.empty()){//extrayendo datos mientras la pila NO este vacia
            binario += digitos.pop();
        }

        return binario;
    }

}
