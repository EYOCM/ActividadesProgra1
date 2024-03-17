/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vectores.seccionb;

import java.util.ArrayList;

/**
 *
 * @author miguelcatalan
 */
public class BusquedaLineal {

    private int[] Libros;
    // realice la búsqueda lineal en los datos
    public  int busquedaLineal(ArrayList<Libros> busquedaLibros, int llaveBusqueda) {
        // itera a través del vector de forma secuencial
        for (int indice = 0; indice < busquedaLibros.size(); indice++) {
            if (busquedaLibros.get(indice).isbn == llaveBusqueda) {
                return indice; // retorna el índice de la llave de búsqueda
            }
        }
        
        return -1; // no se encontró la llave de búsqueda
    }
}
