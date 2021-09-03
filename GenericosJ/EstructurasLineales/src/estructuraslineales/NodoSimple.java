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
public class NodoSimple<V> {

    private V dato;
    private NodoSimple<V> apuntadorSiguiente;

    public NodoSimple(V info) {
        this.dato = info;
        this.apuntadorSiguiente = null;
    }

    public NodoSimple(V info, NodoSimple siguienteNodo) {
        this.dato = info;
        this.apuntadorSiguiente = siguienteNodo;
    }

    /**
     * @return the dato
     */
    public V getDato() {
        return dato;
    }

    /**
     * @param dato the dato to set
     */
    public void setDato(V dato) {
        this.dato = dato;
    }

    /**
     * @return the apuntadorSiguiente
     */
    public NodoSimple<V> getApuntadorSiguiente() {
        return apuntadorSiguiente;
    }

    /**
     * @param apuntadorSiguiente the apuntadorSiguiente to set
     */
    public void setApuntadorSiguiente(NodoSimple<V> apuntadorSiguiente) {
        this.apuntadorSiguiente = apuntadorSiguiente;
    }

}
