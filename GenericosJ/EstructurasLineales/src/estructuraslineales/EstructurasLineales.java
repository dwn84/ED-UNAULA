/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructuraslineales;

import java.util.Arrays;
import java.util.Stack;

/**
 *
 * @author samaniw
 */
public class EstructurasLineales {

    /**
     * @param args the command line arguments
     */
    public static int sumatoriaRecursiva(int n) {
        //caso base
        if (n == 1) {
            return 1;
        } else {
            return n+sumatoriaRecursiva(--n);
        }

    }
    public static int factorialRecursivo(int n) {
        //caso base
        if (n == 0) {
            return 1;
        } else {
            return n*factorialRecursivo(--n);
        }

    }
    public static int fibonacciRecursivo(int n) {
    
        if(n==0){
            return 0;
        }else if(n==1){
            return 1;
        }else{
            return fibonacciRecursivo(n-1)+fibonacciRecursivo(n-2);
        }
        
    }
    
    
    


    public static void main(String[] args) {
        int x = sumatoriaRecursiva(10);
        int s = factorialRecursivo(6);
        System.out.println(s);
        int f = fibonacciRecursivo(7);
        System.out.println("Elemento fibo:"+f);
        // TODO code application logic here
        //Ejemplo de lista enlazada simple, creda nodo a nodo
        NodoSimple<Integer> nodo1 = new NodoSimple<>(11);
        NodoSimple<Integer> nodo2 = new NodoSimple<>(22);
        NodoSimple<Integer> nodo3 = new NodoSimple<>(33);
        NodoSimple<Integer> nodo4 = new NodoSimple<>(44);
        NodoSimple<Integer> nodo5 = new NodoSimple<>(55);
        //configuración (unión o enlace) de nodos
        nodo1.setApuntadorSiguiente(nodo2);
        nodo2.setApuntadorSiguiente(nodo3);
        nodo3.setApuntadorSiguiente(nodo4);
        nodo4.setApuntadorSiguiente(nodo5);
        //System.out.println(nodo1.getDato());
        //System.out.println(nodo1.getApuntadorSiguiente().getApuntadorSiguiente().getDato());

        //Crear una listta enlazada simple a partir de la clase
        ListaEnlazadaSimple<Double> miLista = new ListaEnlazadaSimple<>();
        //System.out.println(miLista.validarListaVacia());
//        miLista.agregarDato(1.1);
//        miLista.agregarDato(2.2);
//        miLista.agregarDato(9.9);
//        miLista.agregarDato(3.3);
//        miLista.agregarDato(4.4);
        miLista.agregarDato(7.7);
        miLista.agregarDatosOrdenados(33.0);
        miLista.agregarDatosOrdenados(44.0);
        miLista.agregarDatosOrdenados(99.0);
        miLista.agregarDatoFinal(99.0);
        miLista.agregarDatosOrdenados(22.0);
        miLista.agregarDatosOrdenados(99.0);
        miLista.agregarDatosOrdenados(77.0);
        miLista.agregarDatosOrdenados(11.0);
        miLista.agregarDatosOrdenados(99.0);
        //miLista.borrarDuplicados();
        //miLista.contarDatos();//6
        //miLista.mostrarPromedio();
        System.out.println(miLista.mostrarDatos());
        miLista.agregarDatoFinal(99.99);
        //miLista.contarDatos();//7
        miLista.borrarPrimero();
        //miLista.contarDatos();//6
        System.out.println("Datos de la lista enlazada simple");
        System.out.println(miLista.mostrarDatos());
        //System.out.println(miLista.mostrasDatosCicloMientras());
        System.out.println("Validación de lista vacia");
        System.out.println(miLista.validarListaVacia());
        System.out.println("");

        //Ejemplo de lista enlazada doble
        ListaEnlazadaDoble<Integer> miListaDoble = new ListaEnlazadaDoble();
        miListaDoble.agregarDatosOrdenados(1);
        miListaDoble.agregarDatosOrdenados(5);
        miListaDoble.agregarDatosOrdenados(3);
        System.out.println("Datos de la lista doble: " + miListaDoble.mostrarDatos());
        miListaDoble.agregarDatosOrdenados(2);
        miListaDoble.agregarDatosOrdenados(4);
        miListaDoble.agregarDatosOrdenados(7);
        System.out.println("Datos de la lista doble: " + miListaDoble.mostrarDatos());
        /*miListaDoble.borrarUltimo();
        miListaDoble.borrarUltimo();
        miListaDoble.borrarUltimo();
        miListaDoble.borrarUltimo();
        miListaDoble.borrarUltimo();
        miListaDoble.borrarUltimo();
        miListaDoble.borrarUltimo();
        miListaDoble.borrarUltimo();*/
        System.out.println("Datos de la lista doble: " + miListaDoble.mostrarDatosDesdeFinal());

        ListaCircularSimple<Integer> miListaCircular = new ListaCircularSimple<>();
        miListaCircular.agregarDatoFinal(11);
        miListaCircular.agregarDatoFinal(22);
        miListaCircular.agregarDatoFinal(33);
        miListaCircular.agregarDatoFinal(99);
        miListaCircular.agregarDatoFinal(55);
        miListaCircular.agregarDatoFinal(77);
        miListaCircular.agregarDatoFinal(46);
        System.out.println(miListaCircular.mostrarDatos());
        //miListaCircular.borrarPrimero();
        //miListaCircular.borrarPrimero();
        miListaCircular.borrarUltimo();
        miListaCircular.borrarUltimo();
        miListaCircular.borrarUltimo();
        miListaCircular.borrarUltimo();
        System.out.println(miListaCircular.mostrarDatos());

        ListaCircularDoble<Integer> miListaCD = new ListaCircularDoble<>();
        miListaCD.agregarDatoFinal(11);
        miListaCD.agregarDatoFinal(33);
        miListaCD.agregarDatoFinal(44);
        miListaCD.agregarDatoFinal(22);
        miListaCD.agregarDatoFinal(77);
        miListaCD.agregarDatoFinal(55);
        System.out.println(miListaCD.mostrarDatos());
//        miListaCD.borrarPrimero();
//        miListaCD.borrarPrimero();
//        miListaCD.borrarPrimero();
        miListaCD.borrarUltimo();
        miListaCD.borrarUltimo();
        miListaCD.borrarUltimo();

        System.out.println(miListaCD.mostrarDatos());

    }

}
