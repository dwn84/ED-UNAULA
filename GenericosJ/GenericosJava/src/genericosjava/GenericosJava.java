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
public class GenericosJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       
        //Clase con atributo genérico
        Box<Integer> cajita = new Box<>();
        cajita.set(11);
        
        Box<String> cajota = new Box<>();
        cajota.set("11");
        
        Box<Double> Supercajota = new Box<>();
        Supercajota.set(1.1);
        
        Box<Long> Minicajita = new Box<>();
        Minicajita.set(11L);
        
        Box2<Integer,String> CajaExperimental = new Box2<>();
        Box2<Double, Boolean> CajaExperimental2 = new Box2<>();
        
        System.out.println("");
        //ejemplos con tipo de dato genérico de la familia Number
        ClaseGenerica<Long> experimento1= new ClaseGenerica<>();
        System.out.println(experimento1.sumatoria(1000000L, 2L, 3L));
        
        ClaseGenerica<Double> experimento2= new ClaseGenerica<>();
        System.out.println(experimento2.sumatoria(1.0, 2.0, 3.0));
        
      
    }
    
}
