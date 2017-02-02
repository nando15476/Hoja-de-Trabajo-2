/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Listas;

/**
 *
 * @author OscarIvan
 */
public class NodoCircular extends NodoDoble{
        
    protected NodoCircular Siguiente;
    protected NodoCircular Anterior;
    protected boolean Cabeza;

    public NodoCircular(int valor) {
        super(valor);
    }  
       public void setSiguiente(NodoCircular siguiente)
    {
        this.Siguiente = siguiente;
    }
    
    @Override
    public NodoCircular getSiguiente()
    {
        return this.Siguiente;
    }
    public void setAnterior(NodoCircular siguiente)
    {
        this.Anterior = siguiente;
    }
    
    @Override
    public NodoCircular getAnterior()
    {
        return this.Anterior;
    }
    
    public void setCabeza(boolean cabeza)
    {
        Cabeza = cabeza;
    }
    
    public boolean IsCabeza()
    {
        return Cabeza;
    }
       
}