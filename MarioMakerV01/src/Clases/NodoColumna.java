/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author Luis Locon
 */
public class NodoColumna {
    public int columna;
    public NodoColumna ant=null,sig=null;
     public NodoMatriz primero=null,ultimo=null;
        public NodoColumna(int columna){
        this.columna=columna;
}
}
