
package Clases;

/**
 *
 * @author Luis Locon
 */
public class Objetos {
    
    //declaramos el tipo de datos que va a recibir el nodo Objeto
    
    Objetos sig, ant;
    String nombre;
    int numero;
    
    
    //Constructor de la clase
    public Objetos(Objetos ant, String name, int num){
        this.sig= null;
        this.nombre= name;
        this.numero= num;
               
    }

    //Getter & Setter de los atributos
    public Objetos getSig() {
        return sig;
    }

    public void setSig(Objetos sig) {
        this.sig = sig;
    }

    public Objetos getAnt() {
        return ant;
    }

    public void setAnt(Objetos ant) {
        this.ant = ant;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
    
    
    
    
    
}
