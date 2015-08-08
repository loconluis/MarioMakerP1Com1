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
    public void addFilaIndice(Object Dato){
        NodoMatriz nodo = new NodoMatriz("RR"+Dato+"RR");
        
        try{
            if (FilaVacia()==true){
                NodoRaiz.setAbajo(nodo);
                arriba = nodo;
                abajo = nodo;
            }else{
                NodoMatriz temp  = abajo;
                temp.setAbajo(nodo);
                abajo = nodo;
                abajo.setArriba(temp);
            }
        }catch(Exception e){
            System.out.println("Error al agregar fila Indice " + e);
        }
    }
    
    //Agregar columnas
    public void addColumnaIndice(Object Dato){
        NodoMatriz nodo = new NodoMatriz("CC"+Dato+"CC");
        
        try{
            if (FilaVacia()==true){
                NodoRaiz.setSig(nodo);
                primero = nodo;
                ultimo = nodo;
            }else{
                NodoMatriz temp  = ultimo;
                temp.setAbajo(nodo);
                ultimo = nodo;
                ultimo.setAnt(temp);
            }
        }catch(Exception e){
            System.out.println("Error al agregar Columna Indice " + e);
        }
    
    }
    
    //Metodo buscar nodos
    
    //Insertar dato en el nodo
    
    //Eliminar fila
    
    //Eliminar columna
    
    //Obtener cantidad de columnas y filas
    public int getFilas(){
        int ff = 0;
        try{
            NodoMatriz temp;
            temp = NodoRaiz;
            while(temp !=null){
                temp = temp.getAbajo();
                ff++;
            }
            return ff;
        }catch(Exception e){
            System.out.println("Error no se pudo obtener el numero de filas " + e);
            return ff;
        }
    }
    
    public int getColumnas(){
        int cc = 0;
        try{
            NodoMatriz temp;
            temp = NodoRaiz;
            while(temp!=null){
            temp = temp.getSig();
            cc++;
            }
            return cc;
        }catch (Exception e){
            System.out.println("Error no se pudo obtener el numero de columnas " + e);
            return cc;
        }
    }
    
    
    
    
    
    
}
