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
public class Nodo {
    protected int  Valor; 
    protected Nodo Siguiente; 
    
    public Nodo(int valor)
    {
        this.Valor = valor;
    }
    
    public void setValor(int valor)
    {
        this.Valor = valor;
    }
    
    public int getValor()
    {
        return this.Valor;
    } 
    
    public void setSiguiente(Nodo siguiente)
    {
        this.Siguiente = siguiente;
    }
    
    public Nodo getSiguiente()
    {
        return this.Siguiente;
    }
    
    public String toString()
    {
        return Integer.toString(Valor);
    }
            
}