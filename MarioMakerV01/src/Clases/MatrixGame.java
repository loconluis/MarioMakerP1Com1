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
    ListaFilas lisFila =new ListaFilas();
    ListaColumnas lisColumna = new ListaColumnas();
    
    public void insertar(int fila , int columna)
    {
        NodoMatriz nuevo =new NodoMatriz(fila, columna);
        lisFila.Insertar(fila);// si no exite insertar la fila ; else {no hacer nada}  
        lisColumna.insertar(columna);// si no exite insertar la columna ; else {no hacer nada}
        //////////////////////////////////////PRIMERO ENLAZAR POR COLUMNAS//////////////////////////////////////////                        
        NodoColumna auxcol=lisColumna.raiz;
        while(auxcol!=null)
        {
        if(auxcol.columna==columna)//encontre la columna en q se tiene q insertar nodo!!
        {
            if(auxcol.primero==null)//1er caso lista vacia
            {
             auxcol.primero=auxcol.ultimo= nuevo;// primero y ultimo de este nodo
             nuevo.columna=auxcol;  //doble enlazado
            }
            else if(nuevo.fil<auxcol.primero.fil)// 2do caso menor al primero
            {
                nuevo.down=auxcol.primero;// enlace  hacia abajo
                auxcol.primero.up=nuevo;// enlace hacia arriba
                auxcol.primero.columna=null;// elimina el puntero del primer nodo hacia la columna 
                auxcol.primero=nuevo; // enlaza columna con el nuevo nodo
                nuevo.columna=auxcol;
            }
            else if(nuevo.fil>auxcol.ultimo.fil)//3er caso mayor al ultimo
            {
                nuevo.up=auxcol.ultimo;
                auxcol.ultimo.down=nuevo;
                auxcol.ultimo=nuevo;
            }
            else // 4to caso. Caso terminal es un nodo medio!!!!!
            {
                NodoMatriz auxM= auxcol.primero;
                while(auxM!=null)
                {
                    if(nuevo.fil==auxM.fil){break;}
                    else if(nuevo.fil<auxM.fil  )
                    {
                        nuevo.down=auxM;
                        nuevo.up=auxM.up;
                        auxM.up.down=nuevo;
                        auxM.up=nuevo;
                        break;
                    }
                    auxM=auxM.down;
                }
                
            }
        }
        auxcol=auxcol.sig;// me estoy moviendo en las columnas  
        }
        ////////////////////////////////// ENLAZAR POR FILAS//////////////////////////////////////////////////
        NodoFila auxfil=lisFila.raiz;
        while(auxfil!=null)
        {
        if(auxfil.fila==fila)//encontre la fila en q se tiene q insertar nodo!!
        {
            if(auxfil.primero==null)//1er caso lista vacia
            {
             auxfil.primero=auxfil.ultimo= nuevo;// primero y ultimo de este nodo
             nuevo.fila=auxfil;  //doble enlazado
            }
            else if(nuevo.col<auxfil.primero.col)// 2do caso menor al primero
            {
                nuevo.sig=auxfil.primero;// enlace  hacia derecha
                auxfil.primero.ant=nuevo;// enlace hacia izquierda
                auxfil.primero.fila=null;// elimina el puntero del primer nodo hacia la fila 
                auxfil.primero=nuevo; // enlaza columna con el nuevo nodo
                nuevo.fila=auxfil;
            }
            else if(nuevo.col>auxfil.ultimo.col)//3er caso mayor al ultimo
            {
                nuevo.ant=auxfil.ultimo;
                auxfil.ultimo.sig=nuevo;
                auxfil.ultimo=nuevo;
            }
            else // 4to caso. Caso terminal es un nodo medio!!!!!
            {
                NodoMatriz auxM= auxfil.primero;
                while(auxM!=null)
                {
                    if(nuevo.col==auxM.col){break;}
                    
                    else if(nuevo.col<auxM.col)
                    {
                        nuevo.sig=auxM;
                        nuevo.ant=auxM.ant;
                        auxM.ant.sig=nuevo;
                        auxM.ant=nuevo;
                        break;
                    }
                    auxM=auxM.sig;
                }
                
            }
        }
        auxfil=auxfil.sig;// me estoy moviendo en las filas  
        }
    }
}
