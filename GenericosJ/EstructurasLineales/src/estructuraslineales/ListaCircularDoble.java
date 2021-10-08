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
public class ListaCircularDoble<T> implements Ilistas<T> {

    private NodoDoble cabeza;

    public ListaCircularDoble() {
        cabeza = null;
    }

    @Override
    public boolean validarListaVacia() {
        return cabeza == null;
    }

    @Override
    public void agregarDato(T a) {
        if (validarListaVacia()) {
            NodoDoble<T> nodoNuevo = new NodoDoble<>(a);
            cabeza = nodoNuevo;
            nodoNuevo.setApuntadorSiguiente(nodoNuevo);
            nodoNuevo.setApuntadorAnterior(nodoNuevo);
        } else {
            NodoDoble<T> ultimo = cabeza.getApuntadorAnterior();
            NodoDoble<T> nodoNuevo = new NodoDoble<>(ultimo, a, cabeza);
            cabeza.setApuntadorAnterior(nodoNuevo);
            ultimo.setApuntadorSiguiente(nodoNuevo);
            cabeza = nodoNuevo;
        }
    }

    @Override
    public void agregarDatoFinal(T a) {
        if (validarListaVacia()) {
            NodoDoble<T> nodoNuevo = new NodoDoble<>(a);
            cabeza = nodoNuevo;
            nodoNuevo.setApuntadorSiguiente(nodoNuevo);
            nodoNuevo.setApuntadorAnterior(nodoNuevo);
        } else {
            NodoDoble<T> ultimo = cabeza.getApuntadorAnterior();
            NodoDoble<T> nodoNuevo = new NodoDoble<>(ultimo, a, cabeza);
            ultimo.setApuntadorSiguiente(nodoNuevo);
            cabeza.setApuntadorAnterior(nodoNuevo);

        }
    }

    @Override
    public void borrarPrimero() {
        if (validarListaVacia()) {
            System.out.println("Lista vacia");
        } else if (cabeza.getApuntadorSiguiente() == cabeza) {
            cabeza = null;
        } else {
            NodoDoble<T> ultimo = cabeza.getApuntadorAnterior();
            NodoDoble<T> segundo = cabeza.getApuntadorSiguiente();

            ultimo.setApuntadorSiguiente(segundo);
            segundo.setApuntadorAnterior(ultimo);
            cabeza = segundo;
        }

    }

    @Override
    public void borrarUltimo() {
        if (validarListaVacia()) {
            System.out.println("Lista vacia");
        } else if (cabeza.getApuntadorSiguiente() == cabeza) {
            cabeza = null;
        } else {
            NodoDoble<T> penultimo = cabeza.getApuntadorAnterior().getApuntadorAnterior();
            penultimo.setApuntadorSiguiente(cabeza);
            cabeza.setApuntadorAnterior(penultimo);
        }
    }

    @Override
    public String mostrarDatos() {
        if (validarListaVacia()) {
            return "Lista sin datos";
        } else {
            NodoDoble<T> i = cabeza;//nodo actual
            System.out.println("Mostrando datos lista circular doble");
            String datos = "";
            do {
                datos += i.getDato() + " ";
                i = i.getApuntadorSiguiente();
            } while (i != cabeza);
            return datos;
        }
    }

}
