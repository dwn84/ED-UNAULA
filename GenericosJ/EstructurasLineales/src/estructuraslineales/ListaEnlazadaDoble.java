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
    
    public void agregarDatosOrdenados(T a) {
        if (validarListaVacia() || cabeza.getDato().compareTo(a) > 0 ) {
            agregarDato(a);
        } else if(cola.getDato().compareTo(a) < 0){
            agregarDatoFinal(a);
        }else{
            
            NodoDoble<T> i = cabeza;//nodo actual
            //Validar con el dato que contiene la siguiente posición 
            while (i.getApuntadorSiguiente() != null && i.getDato().compareTo(a)<0) {
                //proceso de buscar el lugar adecuado
                i = i.getApuntadorSiguiente();
            }
            NodoDoble<T> anterior = i.getApuntadorAnterior();
            NodoDoble<T> nuevoNodo = new NodoDoble<>(anterior,a,i);
            anterior.setApuntadorSiguiente(nuevoNodo);
            i.setApuntadorAnterior(nuevoNodo);           
            
        }
    
    
    }


    @Override
    public void borrarPrimero() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void borrarUltimo() {
        if(validarListaVacia()){
            System.out.println("Lista vacia");
        }else if(cabeza==cola){
            cabeza = cola = null;
        }else{
            //modificar el siguiente del penúltimo
            cola.getApuntadorAnterior().setApuntadorSiguiente(null);
            //actualizar el último elemento de la estructura
            cola = cola.getApuntadorAnterior();
        }
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
