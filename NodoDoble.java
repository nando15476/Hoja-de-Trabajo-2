/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Listas;

import java.util.HashSet;

/**
 *
 * @author OscarIvan
 */
public class NodoDoble extends Nodo{
    protected NodoDoble Siguiente; 
    protected NodoDoble Anterior;

    public NodoDoble(int valor) {
        super(valor);
    }

    public int NodoDoble() 
    {
        return 0;
    }
    
    public void setSiguiente(NodoDoble siguiente)
    {
        this.Siguiente = siguiente;
        siguiente.setAnterior(this);        
    }
    
    @Override
    public NodoDoble getSiguiente()
    {
        return this.Siguiente;
    }
    
    public void setAnterior(NodoDoble anterior)
    {
        this.Anterior = anterior;
    }
    
    public NodoDoble getAnterior()
    {
        return this.Anterior;
    }
    
}