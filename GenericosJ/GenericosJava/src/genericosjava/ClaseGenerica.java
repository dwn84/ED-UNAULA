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
public class ClaseGenerica<N extends Number> {

    private int x;
    private int y;
    private String z;

    public N sumatoria(N a, N b, N c) {
        if (a.getClass() == Double.class) {
            return (N) new Double(a.doubleValue() + b.doubleValue() + c.doubleValue());
        }else if (a.getClass() == Integer.class) {
            return (N) new Integer(a.intValue() + b.intValue() + c.intValue());
        }else{
            return (N) new Long(a.longValue() + b.longValue() + c.longValue());
        }
    }

}
