/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package editametodo;

import java.util.ArrayList;

/**
 *
 * @author Luis Carlos Flores
 */
public class EditaMetodo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       // ArrayList<> lista=new ArrayList();
        Pila p=new Pila();
        Editor e= new Editor(p);
        System.out.println("Impresion antes de #");
        e.edita('a');
        e.edita('b'); 
        e.edita('c');
        e.edita('d');
        e.edita('e');
        e.edita('f');
        e.edita('g');
        e.edita('h');//no saldra en impresion
        p.Imprimir();
        System.out.println("Impresion despues de #");
        e.edita('#');
        p.Imprimir();
        e.edita('k');
        e.edita('l');
        System.out.println("Impresion antes de Anular con @");
        p.Imprimir();
        e.edita('@');
        System.out.println("DESPUES de @");
        p.Imprimir();
        
     
    }
    
}
