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
public class Editor {
    private Pila p;

    public Editor() {
    }

    public Editor(Pila p) {
        this.p = p;
        
    }

    public Pila getP() {
        return p;
    }

    public void setP(Pila p) {
        this.p = p;
    }
    public void edita(char c){
        if(c!='#'&&c!='@'){
            p.Insertar(c);
        }else if(c=='#'){
            p.Suprimir(p.getLista().size()-1);
        }else if(c=='@'){
            p.Anula();
        }
        
        
        
       
    }
}
