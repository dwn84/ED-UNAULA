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
public class EstructurasNoLineales {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArbolBusquedaBinaria bst = new ArbolBusquedaBinaria();
        bst.agregarNodo(55);
        bst.agregarNodo(33);
        bst.agregarNodo(77);
        bst.agregarNodo(22);
        bst.agregarNodo(88);
        String resultadoBusqueda = (bst.buscar(22)==null)?"Dato no encontrado":"Dato encontrado";
        System.out.println(resultadoBusqueda);
        
    }
    
}
