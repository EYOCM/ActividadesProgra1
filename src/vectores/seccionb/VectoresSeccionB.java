/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vectores.seccionb;

import java.util.ArrayList;

/**
 *
 * @author miguelcatalan
 */
public class VectoresSeccionB {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<Libros> busquedaLibros = new ArrayList<Libros>();
        Libros l1 = new Libros(12-2024);
        Libros l2 = new Libros(12-2002);
        Libros l3 = new Libros(12-2013);
        Libros l4 = new Libros(12-2000);
        Libros l5 = new Libros(12-2019);
        busquedaLibros.add(l1);
        busquedaLibros.add(l2);
        busquedaLibros.add(l3);
        busquedaLibros.add(l4);
        busquedaLibros.add(l5);
        
        
        
        int llaveBusqueda = (12-2002);
        int Indice;
        BusquedaLineal l = new BusquedaLineal();
        Indice = l.busquedaLineal(busquedaLibros, llaveBusqueda);
        System.out.println(Indice);
        
        
        
         /*
        int [] g = {34, 56, 2, 10, 77, 51, 93, 30, 5, 52};
        int llave = 93;
        BusquedaLineal l = new BusquedaLineal();
        int idx = l.busquedaLineal(g, llave);
        System.out.println("El elemento " + llave + " se encuentra en el índice: " + idx);
        */
        /*
        int [] datos = {34, 56, 4, 10, 77, 51, 93, 30, 5, 52};
        System.out.printf("Arreglo desordenado:%n%s%n%n", Arrays.toString(datos));
        OrdenamientoSeleccion ordenamientoSeleccionObj = new OrdenamientoSeleccion();
        ordenamientoSeleccionObj.ordenamientoSeleccion(datos);
        System.out.printf("Arreglo ordenado:%n%s%n%n", Arrays.toString(datos));
        */
        
        /*
        int [] datos = {34, 56, 4, 10, 77, 51, 93, 30, 5, 52};
        System.out.printf("Arreglo desordenado:%n%s%n%n", Arrays.toString(datos));
        OrdenamientoInsercion ordenamientoInsercionObj = new OrdenamientoInsercion();
        ordenamientoInsercionObj.ordenamientoInsercion(datos);
        System.out.printf("Arreglo ordenado:%n%s%n%n", Arrays.toString(datos));
        */
        
        /*
        int [] datos = {34, 56, 4, 10, 77, 51, 93, 30, 5, 52};
        System.out.printf("Arreglo desordenado:%n%s%n%n", Arrays.toString(datos));
        OrdenamientoCombinacion ordenamientoCombinacionObj = new OrdenamientoCombinacion();
        ordenamientoCombinacionObj.ordenamientoCombinacion(datos);
        System.out.printf("Arreglo ordenado:%n%s%n%n", Arrays.toString(datos));
        */
        
        /*
        int [] z = {2, 3, 5, 10, 27, 30, 34, 51, 56, 65, 77, 81, 82, 93};
        BusquedaBinaria bb = new BusquedaBinaria();
        int llave = 65;
        int idx = bb.busquedaBinaria(z, llave);
        System.out.println("El elemento " + llave + " se encuentra en el índice: " + idx);
        */
        
        /*
        int [] g = {34, 56, 2, 10, 77, 51, 93, 30, 5, 52};
        int llave = 93;
        BusquedaLineal l = new BusquedaLineal();
        int idx = l.busquedaLineal(g, llave);
        System.out.println("El elemento " + llave + " se encuentra en el índice: " + idx);
        */
    }
    
}
