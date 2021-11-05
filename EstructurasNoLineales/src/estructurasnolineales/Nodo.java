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
public class Nodo {
    private int identificador;
    private int peso;

    public Nodo(int identificador, int peso) {
        this.identificador = identificador;
        this.peso = peso;
    }

    /**
     * @return the destino
     */
    public int getIdentificador() {
        return identificador;
    }

    /**
     * @return the peso
     */
    public int getPeso() {
        return peso;
    }
    
    
    
}
