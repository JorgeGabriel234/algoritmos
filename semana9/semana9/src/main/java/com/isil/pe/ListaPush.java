package com.isil.pe;

public class ListaPush {

    static class Nodo{
        int dato;
        Nodo siguiente;

        Nodo (int dato){
            this.dato = dato;
            this.siguiente = null;
        }
    }

    static class PilaLista{
        private Nodo tope;
        public PilaLista(){
            tope = null;
        }

        public void push(int dato){
            Nodo nuevo = new Nodo(dato);
            nuevo.siguiente = tope;
            tope = nuevo;
        }

        public void mostrar(){
            Nodo actual = tope;
            System.out.println("Tope base: ");
            while (actual != null){
                System.out.println(actual.dato + " ");
                actual=actual.siguiente;
            }
        }

        public int pop(){
            if(tope == null){
                System.out.println("Error: Pila esta vacia ");
                return -1;
            }
            int dato = tope.dato;
            tope = tope.siguiente;
            return dato;
        }
    }
    public static void main (String[] args){
        PilaLista lista = new PilaLista();
        lista.push(10);
        lista.push(30);
        lista.push(40);
        lista.mostrar();
        System.out.println("-----------");
        System.out.println("Nodo retirado " + lista.pop());
        lista.mostrar();
    }

}
