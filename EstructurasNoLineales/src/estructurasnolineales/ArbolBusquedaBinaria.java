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
                desplazamientoPadre = false;
                return buscar(dato, raizActual.getApuntadorIzquierdo());
            } else {
                desplazamientoPadre = true;
                return buscar(dato, raizActual.getApuntadorDerecho());
            }
        }
    }

    public void borrarNodo(int dato) {
        if (raiz == null) {
            System.out.println("Árbol vacio");
        } else {
            borrarNodo(dato, raiz);
        }
    }

    private void borrarNodo(int dato, NodoBinario raizActual) {
        NodoBinario v = buscar(dato);
        //if v is a leaf //validar si el nodo es hoja
        if (v.validarHoja()) {
            if (desplazamientoPadre) {
                padre.setApuntadorDerecho(null);
            } else {
                padre.setApuntadorIzquierdo(null);
            }
        } else if (v.validarSoloUnHijo()) {
            //  bypass v: enlazar el abuelo con el hijo
            if (v.isHijoDerechoIzquierdo()) {
                if (desplazamientoPadre) {
                    padre.setApuntadorDerecho(v.getApuntadorDerecho());
                } else {
                    padre.setApuntadorIzquierdo(v.getApuntadorDerecho());
                }
            } else if (desplazamientoPadre) {
                padre.setApuntadorDerecho(v.getApuntadorIzquierdo());
            } else {
                padre.setApuntadorIzquierdo(v.getApuntadorIzquierdo());
            }
        } else {//el dato a borrar tiene dos hijos
            //replace v with successor
            //Ubicarse en subárbol derecho y localizar el dato menor.
            NodoBinario menor = obtenerMenor(v.getApuntadorDerecho());
            borrarNodo(menor.getDato());
            v.setDato(menor.getDato());
        }

    }

    private NodoBinario obtenerMenor(NodoBinario raizActual) {
        if (raizActual.getApuntadorIzquierdo() == null) {
            return raizActual;
        } else {
            return obtenerMenor(raizActual.getApuntadorIzquierdo());
        }
    }

    //recorridos
    //Preorden: Raiz – Izq – Der
    public void Preorden() {
        Preorden(raiz);
    }

    private void Preorden(NodoBinario raizActual) {
        if (raizActual != null) {
            System.out.println(raizActual.getDato());
            Preorden(raizActual.getApuntadorIzquierdo());
            Preorden(raizActual.getApuntadorDerecho());

        }
    }

    //Postorden: Izq – Der –  Raiz
    public void Postorden() {
        Postorden(raiz);
    }

    private void Postorden(NodoBinario raizActual) {
        if (raizActual != null) {
            Postorden(raizActual.getApuntadorIzquierdo());
            Postorden(raizActual.getApuntadorDerecho());
            System.out.println(raizActual.getDato());
        }
    }

    //Inorden: Izq – Raiz – Der
    public void Inorden() {
        Inorden(raiz);
    }

    private void Inorden(NodoBinario raizActual) {
        if (raizActual != null) {
            Inorden(raizActual.getApuntadorIzquierdo());
            System.out.println(raizActual.getDato());
            Inorden(raizActual.getApuntadorDerecho());

        }
    }

}
