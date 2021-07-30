/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package introduccionj;

import java.util.Random;

/**
 *
 * @author samaniw
 */
public class Productos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        La empresa UXZ Ltda requiere controlar la 
        existencia de 17 productos, los cuales se 
        almacenan en un arreglo A, mientras que los 
        pedidos de los clientes de estos productos 
        se almacenan en un arreglo B. Se requiere 
        generar un tercer arreglo C con base en los 
        anteriores que represente lo que se requiere 
        comprar para mantener el stock de inventario, }
        para esto se considera lo siguiente: si los 
        valores correspondientes de los arreglos A y B 
        son iguales se almacena este mismo valor, si 
        el valor de B es mayor que el de A se almacena 
        el doble de la diferencia entre B y A, si se da 
        el caso de que A es mayor que B, se almacena B, 
        que indica lo que se requiere comprar para 
        mantener el stock de inventario. Realice el 
        programa en Java que permita almacenar al 
        información pertinente en los arreglos A, B y C. 
         */
        int existencias[], pedidos[], compras[];
        existencias = new int[17];
        pedidos = new int[17];
        compras = new int[17];

        //generar valores para la existencia y pedidos de productos
        Random r = new Random();
        System.out.println("Tabla de productos");
        System.out.println("#\texistencias\tpedidos\t\tcompras");
        for (int i = 0; i < compras.length; i++) {
            existencias[i] = r.nextInt(11) + 30;
            pedidos[i] = r.nextInt(11) + 30;
            if (existencias[i] > pedidos[i]) {
                compras[i] = pedidos[i];
            } else if (existencias[i] < pedidos[i]) {
                compras[i] = 2 * (pedidos[i] - existencias[i]);
            } else {
                compras[i] = existencias[i];
            }
        }
        for (int i = 0; i < compras.length; i++) {
            System.out.println((i + 1) + "\t" + existencias[i] + "\t\t" + pedidos[i] + "\t\t" + compras[i]);

        }

    }

}
