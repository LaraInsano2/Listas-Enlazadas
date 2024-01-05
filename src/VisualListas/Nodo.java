/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package VisualListas;

/**
 *
 * @author Dilan Lara
 */
public class Nodo {
   int valor;
    Nodo siguiente;
    Nodo cabeza;
    
    
    public Nodo(int valor) {
        this.valor = valor;
        this.siguiente = null;
    }
    
    public Nodo(){
        this.cabeza = null;
    }

    public Nodo getCabeza() {
        return cabeza;
    }

    public void setCabeza(Nodo cabeza) {
        this.cabeza = cabeza;
    }

   

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }
 
    
    public void insercionAlFinal(int valor) {
        Nodo nuevoNodo = new Nodo(valor);
        if (cabeza == null) {
            cabeza = nuevoNodo;
            return;
        }
        Nodo actual = cabeza;
        while (actual.siguiente != null) {
            actual = actual.siguiente;
        }
        actual.siguiente = nuevoNodo;
    }

    public boolean busqueda(int valor) {
        Nodo actual = cabeza;
        while (actual != null) {
            if (actual.valor == valor) {
                return true;
            }
            actual = actual.siguiente;
        }
        return false;
    }

    public void eliminacionEnPosicion(int posicion) {
        if (cabeza == null) {
            return;
        }
        if (posicion == 0) {
            cabeza = cabeza.siguiente;
            return;
        }
        Nodo actual = cabeza;
        for (int i = 0; i < posicion - 1; i++) {
            if (actual == null || actual.siguiente == null) {
                throw new IndexOutOfBoundsException("Índice fuera de rango");
            }
            actual = actual.siguiente;
        }
        actual.siguiente = actual.siguiente.siguiente;
    }

    public void imprimirLista() {
        Nodo actual = cabeza;
        while (actual != null) {
            System.out.print(actual.valor + " -> ");
            actual = actual.siguiente;
        }
        System.out.println("null");
    }   
}
