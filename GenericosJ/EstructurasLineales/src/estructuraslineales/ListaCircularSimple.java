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
public class ListaCircularSimple<T> implements Ilistas<T> {

    private NodoSimple<T> cabeza, cola;

    public ListaCircularSimple() {
        cabeza = cola = null;
    }

    @Override
    public boolean validarListaVacia() {
        return cabeza == null;
    }

    @Override
    public void agregarDato(T a) {
        NodoSimple<T> nodoNuevo = new NodoSimple<>(a);
        if (validarListaVacia()) {
            cabeza = cola = nodoNuevo;
            nodoNuevo.setApuntadorSiguiente(nodoNuevo);
        } else {
            nodoNuevo.setApuntadorSiguiente(cabeza);
            cabeza = nodoNuevo;
            cola.setApuntadorSiguiente(cabeza);
        }
    }

    @Override
    public void agregarDatoFinal(T a) {
        NodoSimple<T> nodoNuevo = new NodoSimple<>(a);
        if (validarListaVacia()) {
            cabeza = cola = nodoNuevo;
            nodoNuevo.setApuntadorSiguiente(nodoNuevo);
        } else {
            nodoNuevo.setApuntadorSiguiente(cabeza);
            cola.setApuntadorSiguiente(nodoNuevo);
            cola = nodoNuevo;
        }
    }

    @Override
    public void borrarPrimero() {
        if (validarListaVacia()) {
            System.out.println("Lista vacia");
        } else if (cabeza.getApuntadorSiguiente() == cabeza) {
            cabeza = cola = null;
        } else {
            cola.setApuntadorSiguiente(cabeza.getApuntadorSiguiente());
            cabeza = cabeza.getApuntadorSiguiente();
        }
    }

    @Override
    public void borrarUltimo() {
        if (validarListaVacia()) {
            System.out.println("Lista vacia");
        }else if (cabeza.getApuntadorSiguiente() == cabeza) {
            cabeza = cola = null;
        } else {
            //Llegar al penúltimo
            NodoSimple<T> i = cabeza;
            while (i.getApuntadorSiguiente().getApuntadorSiguiente() != cabeza) {
                i = i.getApuntadorSiguiente();
            }
            i.setApuntadorSiguiente(cabeza);
            cola = i;

        }

    }

    @Override
    public String mostrarDatos() {
        if (validarListaVacia()) {
            return "Lista sin datos";
        } else {
            NodoSimple<T> i = cabeza;//nodo actual
            System.out.println("Mostrando datos lista circular simple");
            String datos = "";
            do {
                datos += i.getDato() + " ";
                i = i.getApuntadorSiguiente();
            } while (i != cabeza);
            return datos;
        }
    }

}
