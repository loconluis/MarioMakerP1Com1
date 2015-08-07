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
public class MatrixGame {
    
    public NodoMatriz primero;
    public NodoMatriz ultimo;
    public NodoMatriz arriba;
    public NodoMatriz abajo;
    public NodoMatriz NodoRaiz;
    
    //inicializar la matriz con estos valores estaticos matriz 2x4
    private static int fr = 4, fc=2;
    
    //Constructor
    public MatrixGame(){
        this.NodoRaiz= new NodoMatriz();
        this.primero=null;
        this.arriba=null;
        this.abajo=null;
        
    }
    
    //Verificar si existen filas
    public boolean FilaVacia(){
        if (NodoRaiz.getAbajo()== null){
            return  true;
        
        }else
            return false;
    }
    
    //Verificar si existen columnas
    public boolean ColumnaVacia(){
        if (NodoRaiz.getSig()== null){
            return  true;
        
        }else
            return false;
    }
    
    //Agregar filas
    
    //Agregar columnas
    
    //Metodo buscar nodos
    
    //Insertar dato en el nodo
    
    //Eliminar fila
    
    //Eliminar columna
    
    //Obtener el nodo columna
    
    
    
    
    
    
    
}
