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
public class ListaFilas {
    NodoFila raiz, cola;
    ListaFilas(){raiz=cola=null;}
    //Inserta una nueva fila
    public void Insertar(int fila){
    NodoFila nuevo= new NodoFila(fila);
        if(raiz==null){// primer nodo 
            raiz=cola=nuevo;
        }
        else if(nuevo.fila>cola.fila){ // mayor al ultimo primer caso
            nuevo.ant=cola;
            cola.sig=nuevo;
            cola=nuevo;
              
        }
        else if(nuevo.fila<raiz.fila){//menor q raiz segundo caso
            nuevo.sig=raiz;
            raiz.ant=nuevo;
            raiz=nuevo;
            
        }
        else if(!existe(nuevo)){// caso terminal en algun lugar medio de la lista :D
            NodoFila aux=raiz.sig;
            while(aux!=null){
                if(nuevo.fila<aux.fila){
                    nuevo.sig=aux;
                    nuevo.ant=aux.ant;
                    aux.ant.sig=nuevo;
                    aux.ant=nuevo;
                    break;
                }
                aux=aux.sig;
            }
        }
    }    

   //verifica si existe
    public Boolean existe(NodoFila nuevo){
    NodoFila aux=raiz;
    while(aux!=null){
    if(nuevo.fila==aux.fila){return true;}
    aux=aux.sig;
    }
    
    return false;
    }

    
}
