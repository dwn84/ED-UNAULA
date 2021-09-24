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
        //Posibilidad de reaizar operaciones aritméticas con datos de los nodos
        //int suma =cabeza.getDato().intValue()+cabeza.getDato().intValue();
        
        //compareTo retorna 1 si el dato del objeto es mayor al parámetro
        if (validarListaVacia() || cabeza.getDato().compareTo(a) == 1) {
            agregarDato(a);
        } else {
            NodoSimple<T> i = cabeza;//nodo actual
            //Validar con el dato que contiene la siguiente posición 
            while (i.getApuntadorSiguiente() != null && i.getApuntadorSiguiente().getDato().compareTo(a) == (-1)) {
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
        if (validarListaVacia()) {
            agregarDato(a);
        } else {
            /*
            for (int w = 0; w < 10; w++) {
                
            }//Fin del proceso // recolector de basura libera memoria, elimina w
            w=99;// No existe la variable w*/
            //recorrer la estructura y posicionarse en el último elemento
            NodoSimple nodoFinal = null;
            for (NodoSimple<T> i = cabeza; i != null; i = i.getApuntadorSiguiente()) {
                nodoFinal = i;
            }
            //NodoSimple<T> nodoNuevo = new NodoSimple<>(a);
            //nodoFinal.setApuntadorSiguiente(nodoFinal);
            nodoFinal.setApuntadorSiguiente(new NodoSimple<>(a));
        }
    }

    @Override
    public void borrarPrimero() {
        if (validarListaVacia()) {
            System.out.println("Lista vacia");
        } else {
            //Cambiar el apuntador de la estructura: cabeza
            //apuntar al segundo elemento: el siguiente de la cabeza
            cabeza = cabeza.getApuntadorSiguiente();
        }

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
