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
public interface Ilistas<T> {
    //Designar todas las operaciones que son necesarias para las listas
    
 
    /**
     * validar si la lista esta vacia
     * @return Verdadero si esta vacia y falso en caso contrario
     */
    public boolean validarListaVacia();
    /**
     * Agregar un nuevo dato al inicio de la lista
     * @param a Representa el nuevo dato
     */
    public void agregarDato(T a);
    
    /**
     * Agregar un nuevo dato al final de la lista
     * @param a Representa el nuevo dato
     */
    public void agregarDatoFinal(T a);
    
    
    
}
