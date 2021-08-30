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
public abstract class ListaTDA {
    //private ArrayList<char>Lista=new ArrayList();
    
    public ListaTDA() {
    }
    public abstract void Imprimir();
    public abstract void Insertar(char data);
    public abstract void Anula();
    public abstract char Tope();
    public abstract void Suprimir(int data);
    
    
    
}