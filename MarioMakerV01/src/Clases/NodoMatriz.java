
package Clases;

/**
 *
 * @author Luis Locon
 */
public class NodoMatriz {
    public NodoMatriz ant=null,sig=null,up=null,down=null;
    public NodoColumna columna = null;
    public NodoFila fila = null;
    public int fil=0,col=0;
    
    public NodoMatriz(int row, int col){
        this.fil=row;
        this.col=col;
    }
    
    
    

    
}
