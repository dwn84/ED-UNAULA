/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructuraslineales;

/**
 *
 * @author samaniw
 */
public class ListaEnlazadaSimple<T extends Number & Comparable> implements Ilistas<T> {

    private NodoSimple<T> cabeza;

    public ListaEnlazadaSimple() {
        cabeza = null;
    }

    @Override
    public boolean validarListaVacia() {
        return cabeza == null;
    }

    @Override
    public void agregarDato(T a) {

        NodoSimple<T> nuevoNodo = new NodoSimple<>(a);
        nuevoNodo.setApuntadorSiguiente(cabeza);
        this.cabeza = nuevoNodo;

    }

    public void agregarDatosOrdenados(T a) {
        //compareTo retorna 1 si el dato del objeto es mayor al parámetro
        if (validarListaVacia() || cabeza.getDato().compareTo(a)==1){
             agregarDato(a);
        }else{
            NodoSimple<T> i = cabeza;//nodo actual
            //Validar con el dato que contiene la siguiente posición 
            //Genera java.lang.NullPointerException, falta analizar el comportamiento del ciclo
            while (i != null && i.getApuntadorSiguiente().getDato().compareTo(a)==(-1)) {
                //proceso de buscar el lugar adecuado
                i = i.getApuntadorSiguiente();
            }
            NodoSimple<T> nodoNuevo = new NodoSimple<>(a);
            nodoNuevo.setApuntadorSiguiente(i.getApuntadorSiguiente());
            i.setApuntadorSiguiente(nodoNuevo);
        }
    }

    @Override
    public void agregarDatoFinal(T a) {

    }

    @Override
    public void borrarPrimero() {

    }

    @Override
    public void borrarUltimo() {

    }

    public String mostrasDatosCicloMientras() {
        if (validarListaVacia()) {
            return "Lista sin datos";
        } else {
            System.out.println("Mostrando datos con ciclo Mientras");
            String datos = "";
            NodoSimple<T> i = cabeza;//nodo actual
            while (i != null) {
                datos += i.getDato() + "\t";
                i = i.getApuntadorSiguiente();
            }
            return datos;
        }
    }

    @Override
    public String mostrarDatos() {
        if (validarListaVacia()) {
            return "Lista sin datos";
        } else {
            String datos = "";

            for (NodoSimple<T> i = cabeza; i != null; i = i.getApuntadorSiguiente()) {
                datos += i.getDato() + "\t";
            }

            return datos;
        }

    }

}
