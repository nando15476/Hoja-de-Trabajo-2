/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Listas;

import java.io.Console;

/**
 *
 * @author OscarIvan
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Lista L = new Lista();
        L.AgregarNodo(5);
        L.AgregarNodo(6);
        L.AgregarNodo(7);
        
        System.out.println(L.toString());
        System.out.println(L.EliminarNodo().toString());
        System.out.println(L.toString());
        System.out.println(L.EliminarNodo().toString());
        System.out.println(L.toString());
        System.out.println(L.EliminarNodo().toString());
        System.out.println(L.toString());
        
        
        System.out.println("-------------Lista Doble-----------------");
        ListaDoble LD = new ListaDoble();
        LD.AgregarNodo(5);
        LD.AgregarNodo(6);
        LD.AgregarNodo(7);
        System.out.println(LD.toString());
        
        
        System.out.println(LD.EliminarNodo().toString());
        System.out.println(LD.toString());
        System.out.println(LD.EliminarNodo().toString());
        System.out.println(LD.toString());
        System.out.println(LD.EliminarNodo().toString());
        System.out.println(LD.toString());
        System.out.println("-------------Lista Circular-----------------");

        ListaCircular LC = new ListaCircular();
        LC.AgregarNodo(5);
        LC.AgregarNodo(6);
        LC.AgregarNodo(7);
        System.out.println(LC.toString());
        
        System.out.println(LC.EliminarNodo().toString());
        System.out.println(LC.toString());
        System.out.println(LC.EliminarNodo().toString());
        System.out.println(LC.toString());
        System.out.println(LC.EliminarNodo().toString());
        System.out.println(LC.toString());
        // TODO code application logic here
    }
    
}