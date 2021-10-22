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
public class NodoBinario {
    private int dato;
    private NodoBinario apuntadorDerecho;
    private NodoBinario apuntadorIzquierdo;
    //Si hijoDerechoIzquierdo es verdadero, el nodo hijo se 
    //encuentra a la derecha. Si es falso, se encuentra a la izquierda
    private boolean hijoDerechoIzquierdo;

    public NodoBinario(int dato) {
        this.dato = dato;
        apuntadorDerecho = apuntadorIzquierdo = null;
    }
    
    public boolean validarHoja(){
        return (apuntadorDerecho==null && apuntadorIzquierdo==null)?true:false;
    }
    
    public boolean validarSoloUnHijo(){
        //validar hijo a la derecha
        if(apuntadorIzquierdo==null && apuntadorDerecho!=null){
            hijoDerechoIzquierdo = true;
            return true;
        }if(apuntadorIzquierdo!=null && apuntadorDerecho==null){
            hijoDerechoIzquierdo = false;
            return true;
        }else{
            return false;
        }
    
    }

    /**
     * @return the dato
     */
    public int getDato() {
        return dato;
    }

    /**
     * @param dato the dato to set
     */
    public void setDato(int dato) {
        this.dato = dato;
    }

    /**
     * @return the apuntadorDerecho
     */
    public NodoBinario getApuntadorDerecho() {
        return apuntadorDerecho;
    }

    /**
     * @param apuntadorDerecho the apuntadorDerecho to set
     */
    public void setApuntadorDerecho(NodoBinario apuntadorDerecho) {
        this.apuntadorDerecho = apuntadorDerecho;
    }

    /**
     * @return the apuntadorIzquierdo
     */
    public NodoBinario getApuntadorIzquierdo() {
        return apuntadorIzquierdo;
    }

    /**
     * @param apuntadorIzquierdo the apuntadorIzquierdo to set
     */
    public void setApuntadorIzquierdo(NodoBinario apuntadorIzquierdo) {
        this.apuntadorIzquierdo = apuntadorIzquierdo;
    }
    
    
}
