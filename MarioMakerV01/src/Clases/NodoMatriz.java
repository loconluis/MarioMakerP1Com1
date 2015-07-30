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
public class NodoMatriz {
    public NodoMatriz ant=null,sig=null,up=null,down=null;
    public int fil=0,col=0;

    public NodoMatriz getAnt() {
        return ant;
    }

    public void setAnt(NodoMatriz ant) {
        this.ant = ant;
    }

    public NodoMatriz getSig() {
        return sig;
    }

    public void setSig(NodoMatriz sig) {
        this.sig = sig;
    }

    public NodoMatriz getUp() {
        return up;
    }

    public void setUp(NodoMatriz up) {
        this.up = up;
    }

    public NodoMatriz getDown() {
        return down;
    }

    public void setDown(NodoMatriz down) {
        this.down = down;
    }

    public int getFil() {
        return fil;
    }

    public void setFil(int fil) {
        this.fil = fil;
    }

    public int getCol() {
        return col;
    }

    public void setCol(int col) {
        this.col = col;
    }

    public NodoMatriz(int fil , int col){
        this.fil=fil;
        this.col=col;
    }
}
