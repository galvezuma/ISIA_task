/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package matrices;

import java.awt.Dimension;
import java.util.Random;

/**
 *
 * @author galvez
 */
public class Matriz {
    private int[][]datos;
    private Random rnd = new Random();
    
    public Matriz(int filas, int columnas, boolean inicializarAleatorio) {
        datos = new int[filas][columnas];
        if (inicializarAleatorio) {
            for (int i = 0; i < filas; i++) {
                for (int j = 0; j < columnas; j++) {
                    datos[i][j] = rnd.nextInt(100);
                }
            }
        }
    }
    
    public Matriz(Dimension d, boolean inicializarAleatorio){
        this(d.height, d.width, inicializarAleatorio);
    }
    
    public Dimension getDimension(){
        return new Dimension(datos[0].length, datos.length);
    }
    
    public static Matriz sumarDosMatrices(Matriz a, Matriz b) throws DimensionesIncompatibles { 
        if(! a.getDimension().equals(b.getDimension())) throw new DimensionesIncompatibles("La suma de matrices requiere matrices de las mismas dimensiones");        
        int i, j, filasA, columnasA; 
        filasA = a.getDimension().height; 
        columnasA = a.getDimension().width; 
        Matriz matrizResultante = new Matriz(filasA, columnasA, false);
        for (i = 0; i < filasA; i++) {         
            for (j = 0; j < columnasA; j++) { 
                matrizResultante.datos[i][j] += a.datos[i][j] + b.datos[i][j]; 
            } 
        } 
        return matrizResultante; 
<<<<<<< HEAD
    } 
    public static Matriz multiplicarMatrices(Matriz a, Matriz b) throws DimensionesIncompatibles {
        Dimension dimensionesA = a.getDimension();
        Dimension dimensionesB = b.getDimension();

        if (dimensionesA.width != dimensionesB.height) {
            throw new DimensionesIncompatibles("La multiplicacion de matrices requiere que el numero de columnas de la primera matriz sea el mismo que el de filas de la segunda");
        }

        int filasA = a.getDimension().height;
        int columnasB = b.getDimension().width;
        int columnasA = a.getDimension().width;

        Matriz matrizResultante = new Matriz(filasA, columnasB, false);

        for (int i = 0; i < filasA; i++) {
            for (int j = 0; j < columnasB; j++) {
                matrizResultante.datos[i][j] = 0;
                for (int k = 0; k < columnasA; k++) {
                    matrizResultante.datos[i][j] += a.datos[i][k] * b.datos[k][j];
                }
            }
        }

        return matrizResultante;
=======
    }

    
    public static Matriz trasponerMatriz(Matriz a) { 
        int filasA = a.getDimension().height;
        int columnasA = a.getDimension().width;
        
        Matriz matrizTraspuesta = new Matriz(columnasA, filasA, false);
        
        for (int i = 0; i < columnasA; i++) { 
            for (int j = 0; j < filasA; j++) { 
                matrizTraspuesta.datos[i][j] += a.datos[j][i]; 
            } 
        } 
        return matrizTraspuesta; 
>>>>>>> Puertas_Invertir
    }
    
    @Override
    public String toString(){
        String ret = "";
        ret += "[\n";
        for (int i = 0; i < getDimension().height; i++) {
            ret += "(";
            for (int j = 0; j < getDimension().width; j++) {  
                ret += String.format("%3d", datos[i][j]); 
                if (j != getDimension().width - 1) ret += ", ";
            } 
            ret += ")";
            if (i != getDimension().height - 1) ret += ",";
            ret += "\n";
        } 
        ret += "]\n";
        return ret;
    }
}
