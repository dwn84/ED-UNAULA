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
public class ListaEnlazadaDoble<T extends Number & Comparable> implements Ilistas<T> {

    private NodoDoble<T> cabeza;
    private NodoDoble<T> cola;

    public ListaEnlazadaDoble() {
        cabeza = cola = null;
    }

    @Override
    public boolean validarListaVacia() {
        return cabeza == null;
    }

    @Override
    public void agregarDato(T a) {
        if (validarListaVacia()) {
            cabeza = cola = new NodoDoble<>(a);
        } else {
            NodoDoble<T> nodoNuevo = new NodoDoble<>(null, a, cabeza);
            cabeza.setApuntadorAnterior(nodoNuevo);
            cabeza = nodoNuevo;
        }
    }

    @Override
    public void agregarDatoFinal(T a) {
        if (validarListaVacia()) {
            cabeza = cola = new NodoDoble<>(a);
        } else {
            NodoDoble<T> nodoNuevo = new NodoDoble<>(cola, a, null);
            cola.setApuntadorSiguiente(nodoNuevo);
            cola = nodoNuevo;

        }
    }

    @Override
    public void borrarPrimero() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void borrarUltimo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String mostrarDatos() {
        if (validarListaVacia()) {
            return "Lista sin datos";
        } else {
            String datos = "";

            for (NodoDoble<T> i = cabeza; i != null; i = i.getApuntadorSiguiente()) {
                datos += i.getDato() + "\t";
            }

            return datos;
        }
    }

    public String mostrarDatosDesdeFinal() {
        if (validarListaVacia()) {
            return "Lista sin datos";
        } else {
            String datos = "";

            for (NodoDoble<T> i = cola; i != null; i = i.getApuntadorAnterior()) {
                datos += i.getDato() + "\t";
            }

            return datos;
        }
    }

}
