
package Clases;

/**
 *
 * @author Luis Locon
 */
public class NodoMatriz {
    private Object Dato;
    private NodoMatriz sig, ant, arriba, abajo;
    
    //Constructor
    public NodoMatriz(){  
        this.Dato= null;
        this.abajo=null;
        this.arriba= null;
        this.sig= null;
        this.ant = null;
    }
    
    //Agregar informacion al nodo en la matriz
    public NodoMatriz(Object Dato){
        this.Dato= Dato;
        this.abajo=null;
        this.arriba= null;
        this.sig= null;
        this.ant = null;
    
    }
    
   
    public Object getDato() {
        return Dato;
    }

    public void setDato(Object Dato) {
        this.Dato = Dato;
    }

    public NodoMatriz getSig() {
        return sig;
    }

    public void setSig(NodoMatriz sig) {
        this.sig = sig;
    }

    public NodoMatriz getAnt() {
        return ant;
    }

    public void setAnt(NodoMatriz ant) {
        this.ant = ant;
    }

    public NodoMatriz getArriba() {
        return arriba;
    }

    public void setArriba(NodoMatriz arriba) {
        this.arriba = arriba;
    }

    public NodoMatriz getAbajo() {
        return abajo;
    }

    public void setAbajo(NodoMatriz abajo) {
        this.abajo = abajo;
    }
    
    
    
    }
