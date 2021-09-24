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
    public static void main(String[] args) {

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
//        miLista.agregarDato(7.7);
        miLista.agregarDatosOrdenados(33.0);
        miLista.agregarDatosOrdenados(44.0);
        miLista.agregarDatosOrdenados(22.0);
        miLista.agregarDatosOrdenados(99.0);
        miLista.agregarDatosOrdenados(77.0);
        miLista.agregarDatosOrdenados(11.0);
        System.out.println(miLista.mostrarDatos());
        miLista.agregarDatoFinal(99.99);
        miLista.borrarPrimero();
        System.out.println("Datos de la lista enlazada simple");
        System.out.println(miLista.mostrarDatos());
        //System.out.println(miLista.mostrasDatosCicloMientras());
        System.out.println("Validación de lista vacia");
        System.out.println(miLista.validarListaVacia());
        System.out.println("");

        //Ejemplo de lista enlazada doble
        ListaEnlazadaDoble<Integer> miListaDoble = new ListaEnlazadaDoble();
        miListaDoble.agregarDatoFinal(1);
        miListaDoble.agregarDatoFinal(3);
        miListaDoble.agregarDatoFinal(5);
        System.out.println("Datos de la lista doble: " + miListaDoble.mostrarDatos());
        miListaDoble.agregarDatoFinal(2);
        miListaDoble.agregarDatoFinal(4);
        miListaDoble.agregarDatoFinal(7);
        System.out.println("Datos de la lista doble: " + miListaDoble.mostrarDatos());
        System.out.println("Datos de la lista doble: " + miListaDoble.mostrarDatosDesdeFinal());

    }

}
