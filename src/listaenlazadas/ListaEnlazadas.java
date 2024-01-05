/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package listaenlazadas;

import java.util.Scanner;

/**
 *
 * @author Dilan Lara
 */
public class ListaEnlazadas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      ListaEnlazada lista = new ListaEnlazada();
        Scanner scanner = new Scanner(System.in);

        int opcion = 0;
        while (opcion != 4) {
            System.out.println("\nOpciones:");
            System.out.println("1. Agregar numero");
            System.out.println("2. Buscar numero");
            System.out.println("3. Eliminar numero");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opcion: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese un número para agregar a la lista: ");
                    int numeroAgregar = scanner.nextInt();
                    lista.insercionAlFinal(numeroAgregar);
                    System.out.println("Número agregado a la lista.");
                    break;
                case 2:
                    System.out.print("Ingrese un número para buscar en la lista: ");
                    int numeroBuscar = scanner.nextInt();
                    boolean encontrado = lista.busqueda(numeroBuscar);
                    if (encontrado) {
                        System.out.println("El número " + numeroBuscar + " está en la lista.");
                    } else {
                        System.out.println("El número " + numeroBuscar + " no está en la lista.");
                    }
                    break;
             case 3:
     boolean Noencontrado = false;
    System.out.print("Ingrese un número para eliminar de la lista: ");
    int numeroEliminar = scanner.nextInt();

    Nodo actual = lista.cabeza;
    int posicion = 0;

    while (actual != null) {
        if (actual.valor == numeroEliminar) {
            lista.eliminacionEnPosicion(posicion);
            encontrado = true;
            System.out.println("Número eliminado de la lista.");
            break;
        }
        actual = actual.siguiente;
        posicion++;
    }

    if (!Noencontrado) {
        System.out.println("No se ha encontrado el número en la lista para eliminar.");
    }
    break;

                case 4:
                    System.out.println("Saliendo del programa.");
                    break;
                default:
                    System.out.println("Opción no válida.");
                    break;
            }

            System.out.println("Lista actual:");
            lista.imprimirLista();
        }

        scanner.close();
    }
    }
    

