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
public class NodoFila {
    public int fila;
    public NodoFila sig = null, ant = null;
    public NodoMatriz primero = null, ultimo= null;
        public NodoFila(int fila){
            this.fila = fila;
        }
        
    
        
}
