/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructurasnolineales;

import java.util.HashMap;
import java.util.LinkedList;

/**
 *
 * @author samaniw
 */
public class grafoDinamico {
    private HashMap<Integer,LinkedList<Nodo>> listaAdyacencia;

    public grafoDinamico() {
        listaAdyacencia = new HashMap<>();
    }
    
    public void agregarNodo(int identificador){
        listaAdyacencia.putIfAbsent(identificador, new LinkedList<Nodo>());
    }
    
    public void agregarArco(int origen, int destino,int peso){
    listaAdyacencia.get(origen).add(new Nodo(destino,peso));
    }

    
}
