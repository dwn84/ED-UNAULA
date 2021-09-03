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
public class ListaEnlazadaSimple<T> implements Ilistas<T> {

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
        this.cabeza= nuevoNodo;
        
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

    @Override
    public String mostrarDatos() {
        return "";
    }
    
}
