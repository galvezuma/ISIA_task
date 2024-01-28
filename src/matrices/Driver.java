package matrices;

import java.util.logging.Level;
import java.util.logging.Logger;
import matrices.DimensionesIncompatibles;
import matrices.Matriz;

public class Driver {

    public static void main(String[] args) {
        Matriz m1 = new Matriz(3, 4, true);
        System.out.println(m1);
        Matriz m2 = new Matriz(3, 4, true);
        System.out.println(m2);
        Matriz m3 = new Matriz(4, 3, true);
        System.out.println(m3);
        
        try {
            System.out.println(Matriz.sumarDosMatrices(m1, m2));
<<<<<<< HEAD
            System.out.println(Matriz.multiplicarMatrices(m2, m3));
=======
            System.out.println(Matriz.trasponerMatriz(m2));
>>>>>>> Puertas_Invertir
        } catch (DimensionesIncompatibles ex) {
            Logger.getLogger(Driver.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    
}