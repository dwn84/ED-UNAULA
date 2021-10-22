/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructurasnolineales;

/**
 *
 * @author samaniw
 */
public class ArbolBusquedaBinaria {

    private NodoBinario raiz;
    private NodoBinario padre;
    //Si desplazamientoPadre es verdadero, el desplazamiento 
    //se realiza por la derecha. Si es falso, izquierda
    private boolean desplazamientoPadre;

    public ArbolBusquedaBinaria() {
        raiz = null;
    }

    public void agregarNodo(int dato) {
        if (raiz == null) {
            raiz = new NodoBinario(dato);
        } else {
            agregarNodo(dato, raiz);
        }
    }

    private void agregarNodo(int dato, NodoBinario raizActual) {

        //validar desplazamiento por izquierda
        if (dato < raizActual.getDato()) {
            //caso base 1
            if (raizActual.getApuntadorIzquierdo() == null) {
                raizActual.setApuntadorIzquierdo(new NodoBinario(dato));
            } else {
                agregarNodo(dato, raizActual.getApuntadorIzquierdo());
            }
            //desplazamiento a la derecha
        } //caso base 2
        else if (raizActual.getApuntadorDerecho() == null) {
            raizActual.setApuntadorDerecho(new NodoBinario(dato));
        } else {
            agregarNodo(dato, raizActual.getApuntadorDerecho());
        }

    }

    public NodoBinario buscar(int dato) {
        return buscar(dato, raiz);
    }

    private NodoBinario buscar(int dato, NodoBinario raizActual) {
        //caso base
        if (raizActual == null) {
            return null;
        } else if (raizActual.getDato() == dato) {
            return raizActual;
        } else {

            padre = raizActual;

            if (dato < raizActual.getDato()) {
                return buscar(dato, raizActual.getApuntadorIzquierdo());
            } else {
                return buscar(dato, raizActual.getApuntadorDerecho());
            }
        }
    }
}
