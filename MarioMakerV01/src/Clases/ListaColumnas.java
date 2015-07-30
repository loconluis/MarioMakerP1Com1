
package Clases;

/**
 *
 * @author Luis Locon
 */
public class ListaColumnas {
    NodoColumna raiz,ultimo;
    ListaColumnas(){raiz=ultimo=null;}
    
    //Inserta una nueva columna
    public void insertar(int Columna){
        NodoColumna nuevo= new NodoColumna(Columna);
        if(raiz==null){// primer nodo 
            raiz=ultimo=nuevo;
        }
        else if(nuevo.columna>ultimo.columna){ // mayor al ultimo primer caso
            nuevo.ant=ultimo;
            ultimo.sig=nuevo;
            ultimo=nuevo;
              
        }
        else if(nuevo.columna<raiz.columna){//menor q raiz segundo caso
            nuevo.sig=raiz;
            raiz.ant=nuevo;
            raiz=nuevo;
            
        }
        else if(!existe(nuevo)){// caso terminal en algun lugar medio de la lista :D
            NodoColumna aux=raiz.sig;
            while(aux!=null){
                if(nuevo.columna<aux.columna){
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
    
    //Verifica si existe la columna
    public Boolean existe(NodoColumna nuevo){
    NodoColumna aux=raiz;
    while(aux!=null){
    if(nuevo.columna==aux.columna){return true;}
    aux=aux.sig;
    }
    
    return false;
    }
}
