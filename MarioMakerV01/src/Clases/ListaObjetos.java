
package Clases;

/**
 *
 * @author Luis Locon
 */
public class ListaObjetos {
    
    
    public static Objetos cabeza, cola;
    //agrear un objeto a la lista
    public void agregarObjeto(String nombre, int numero){
        Objetos nuevo;
        if(cabeza == null)
        {
            nuevo = new Objetos(nombre, numero);
            cabeza = nuevo;
            cola = nuevo;
        }
        else
        {
            if(buscarObjeto(numero,0) == null)
            {
                nuevo = new Objetos(nombre, numero);
                cola.sig = nuevo;
                nuevo.ant = cola;
                cola = nuevo;
//                while(nuevo.sig != null)
//                nuevo = nuevo.sig;
//                nuevo.sig = new Objetos(nuevo, nombre, numero);
//                cola = nuevo.sig;
//                cabeza = nuevo.ant;

            }
        }
    }
    
    //Modificar datos en la lista
    public void modificarObjeto(String nombre, int numero){
        Objetos actual = cabeza;
        if(actual == null){
            javax.swing.JOptionPane.showMessageDialog(null, "No hay datos en la Lista");
        } else{
        
        boolean encontrado = false;
            while(actual != null)
            {
                if(actual.numero== numero)
                {
                    encontrado = true;
                    actual.nombre = nombre;
                    
                    javax.swing.JOptionPane.showMessageDialog(null,"Datos del objeto editados");
                }
                actual = actual.sig;
            }
            if(!encontrado){
                javax.swing.JOptionPane.showMessageDialog(null,"el codigo no corresponde a ningun objeto de la Lista");}
        }
    
    
    
    }      
    
    //Eliminar dato de la lista
    public void deleteCliente(int numero){
    Objetos actual = cabeza;
            
        if(actual == null){
            javax.swing.JOptionPane.showMessageDialog(null, "No hay datos en la Lista");
        } else{
            if(actual.numero == numero)
            {
                cabeza = actual.sig;
                if(actual.sig != null){
                    actual.sig.ant =actual.ant;}
                else{
                    cola = actual.sig;
                    javax.swing.JOptionPane.showMessageDialog(null, "Se elimino Registro");
                }
            }else
            {
                boolean encontrado = false;
                while(actual != null)
                {
                    if(actual.numero == numero)
                    {
                        encontrado = true;
                        actual.ant.sig = actual.sig;
                        if(actual.sig != null){
                            actual.sig.ant = actual.ant;
                        }  else{
                            cola = actual.ant;
                            javax.swing.JOptionPane.showMessageDialog(null,"Registro eliminado");
                            }
                    }
                    actual = actual.sig;
            
                }
                if(!encontrado)
                    javax.swing.JOptionPane.showMessageDialog(null,"El codigo no corresponde a Objeto en esta lista");
            }
            }
    
    }
     
    //Metodo buscar en la lista.
    public Objetos buscarObjeto(int numero, int aux){
    Objetos buscado = null;
    Objetos actual = cabeza;
        if((actual == null)&&(aux==1)){
            javax.swing.JOptionPane.showMessageDialog(null, "No hay datos en la Lista");
        } else
            {
            boolean existe = false;
            while(actual != null)
            {
                if(actual.numero== numero)
                {
                    existe = true;
                    buscado = actual;
                }
                actual = actual.sig;
            }
            if((!existe)&&(aux==1))
                javax.swing.JOptionPane.showMessageDialog(null,"No se encontro el Objeto");
            }
        return buscado;
    }
}
