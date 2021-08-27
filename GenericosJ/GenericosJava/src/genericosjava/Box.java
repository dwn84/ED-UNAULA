/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package genericosjava;

/**
 *
 * @author samaniw
 */
public class Box<T> {
    // T representa un tipo genérico
    public T dato;


    public void set(T nuevoDato) { dato = nuevoDato; }
    public T get() { return dato; }
}
