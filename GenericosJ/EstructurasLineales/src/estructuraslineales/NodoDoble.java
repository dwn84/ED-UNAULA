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
public class NodoDoble<V> {

    private V dato;
    private NodoDoble apuntadorSiguiente;
    private NodoDoble apuntadorAnterior;

    public NodoDoble(V dato) {
        //this() invoca los constructores de la clase
        this(null,dato,null);

    }
    //ana = apuntador nodo anterior
    //ans = apuntador nodo siguiente
    public NodoDoble(NodoDoble ana, V dato, NodoDoble ans) {
        setApuntadorAnterior(ana);
        setDato(dato);
        setApuntadorSiguiente(ans);
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
    public NodoDoble getApuntadorSiguiente() {
        return apuntadorSiguiente;
    }

    /**
     * @param apuntadorSiguiente the apuntadorSiguiente to set
     */
    public void setApuntadorSiguiente(NodoDoble apuntadorSiguiente) {
        this.apuntadorSiguiente = apuntadorSiguiente;
    }

    /**
     * @return the apuntadorAnterior
     */
    public NodoDoble getApuntadorAnterior() {
        return apuntadorAnterior;
    }

    /**
     * @param apuntadorAnterior the apuntadorAnterior to set
     */
    public void setApuntadorAnterior(NodoDoble apuntadorAnterior) {
        this.apuntadorAnterior = apuntadorAnterior;
    }

}
