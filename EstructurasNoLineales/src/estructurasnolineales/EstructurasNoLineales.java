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
        bst.agregarNodo(66);
        bst.agregarNodo(88);
        String resultadoBusqueda = (bst.buscar(88) == null) ? "Dato no encontrado" : "Dato encontrado";
        System.out.println(resultadoBusqueda);
        //System.out.println("Padre del nodo buscado"+bst.getPadre().getDato());
        bst.borrarNodo(77);
        bst.Inorden();
        System.out.println("");

        grafoEstatico g1 = new grafoEstatico(7);
        g1.AgregarArco(0, 1);
        g1.AgregarArco(0, 2);
        g1.AgregarArco(0, 3);
        g1.AgregarArco(2, 4);
        g1.AgregarArco(2, 5);
        g1.AgregarArco(3, 6);
        System.out.println("Matriz de adyacencia");
        System.out.println(g1.MostrarMatrixAdyacencia());
        System.out.println("Lista de adyacencia");
        System.out.println(g1.MostrarListaAdyacencia());
        System.out.println("Recorrido en Anchura");
        g1.recorridoAnchura(0);
        System.out.println("\nRecorrido en Profundidad");
        g1.recorridoProfundidad(0);

    }

}
