/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructurasnolineales;

import java.util.LinkedList;

/**
 *
 * @author samaniw
 */
public class grafoEstatico {

    private boolean matrizAdyacencia[][];
    private LinkedList<Integer> listaAdyacencia[];

    public grafoEstatico(int n) {
        matrizAdyacencia = new boolean[n][n];
        listaAdyacencia = new LinkedList[n];

        for (int i = 0; i < n; i++) {
            listaAdyacencia[i] = new LinkedList<>();
        }
    }

    public void AgregarArco(int origen, int destino) {
        matrizAdyacencia[origen][destino] = true;
        listaAdyacencia[origen].add(destino);
    }

    public void EliminarArco(int origen, int destino) {
        matrizAdyacencia[origen][destino] = false;
        listaAdyacencia[origen].remove(destino);
    }

    public String MostrarMatrixAdyacencia() {
        String matrix = "";
        int n = matrizAdyacencia.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix += matrizAdyacencia[i][j] ? 1 : 0;
            }
            matrix += "\n";
        }
        return matrix;
    }

    public String MostrarListaAdyacencia() {
        String lista = "";
        int n = listaAdyacencia.length;
        for (int i = 0; i < n; i++) {
            lista += i + ": ";
            for (Integer nn : listaAdyacencia[i]) {
                lista += nn + " ";
            }
            lista += "\n";
        }
        return lista;
    }

    public void recorridoAnchura(int origen) {
        boolean nodosVisitados[] = new boolean[listaAdyacencia.length];
        LinkedList<Integer> cola = new LinkedList<>();
        cola.add(origen);
        nodosVisitados[origen] = true;
        while (!cola.isEmpty()) {
            origen = cola.remove();
            System.out.print(origen + " ");

            for (Integer v : listaAdyacencia[origen]) {
                if (!nodosVisitados[v]) {
                    cola.add(v);
                    nodosVisitados[v] = true;
                }
            }
        }
    }

    public void recorridoProfundidad(int origen) {
        boolean nodosVisitados[] = new boolean[listaAdyacencia.length];
        recorridoProfundidad(origen, nodosVisitados);
    }

    private void recorridoProfundidad(int origen, boolean nodosVisitados[]) {
        nodosVisitados[origen] = true;
        System.out.print(origen + " ");
        for (Integer v : listaAdyacencia[origen]) {
            if (!nodosVisitados[v]) {
                recorridoProfundidad(v, nodosVisitados);
            }
        }

    }

}
