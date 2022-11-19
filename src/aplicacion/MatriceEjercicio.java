
package aplicacion;

import javax.swing.*;
import java.util.Arrays;
public class MatriceEjercicio {
    public static void main(String[] args) {

            // declara y crea una matriz de enteros de 3x5
            int[][]  m= new int [3][5];
            int i,j, cont = 1;
            System.out.println (m);   // despliega la dir. de memoria del vector ppal
            System.out.println (Arrays.toString (m) ); //contenido de las casillas de m
            System.out.println (Arrays.deepToString (m) ); //accesa contenido de vectores                                               //secundarios
            for ( i = 0; i < m.length; i++)
                for (j = 0; j < m[i].length; j++)
                    m[i][j] = cont++;
            System.out.println ("\n" + Arrays.deepToString (m) );
            // desplegar datos de forma MATRICIAL (TABLA)
            System.out.println ("\n");
            for ( i = 0; i < m.length; i++) {    // recorre vector ppal
                for (j = 0; j < m[i].length; j++)    //recorre vectores secundarios
                    System.out.print (m[i][j] + "   ");
                System.out.println ();   //brinca renglon
            }
            // MANEJO DE UNA MATRIZ IRREGULAR
            int mir[][] = new int [6][];  //solo se crea el vector principal
            System.out.println (Arrays.toString (mir) );
            for ( i = 0; i < mir.length; i++)
                mir[i] = new int [i+1];  //crea cada vector secundario
            System.out.println ("\n" + Arrays.deepToString (mir) );
            // desplegar datos de forma MATRICIAL (TABLA)
            System.out.println ("\n");
            for ( i = 0; i < mir.length; i++) {    // recorre vector ppal
                for (j = 0; j < mir[i].length; j++) {   //recorre vectores secundarios
                    mir[i][j] = i+2;
                    System.out.print (mir[i][j] + "   ");
                }
                System.out.println ();   //brinca renglon
            }
        /*
        //declarar las matrices
        int [][]m;
        //crear una matrizde enteros
        m=new int[3][5];
        JOptionPane.showMessageDialog(null, m);
        System.out.println(m);
        //contenido de las casillas de la matriz
        JOptionPane.showMessageDialog(null, Arrays.toString( m));
        System.out.println(Arrays.toString(m));

        JOptionPane.showMessageDialog(null, Arrays.deepToString( m));
        System.out.println(Arrays.deepToString(m));
        int cont=0;
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                m[i][j] =cont++;
                JOptionPane.showMessageDialog(null, "\n" +Arrays.deepToString(m));
                System.out.println(Arrays.deepToString(m));
                //desplegal datosde forma matricila
            }
        }

        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                JOptionPane.showMessageDialog(null, m[i] [j] + " ");
                System.out.println(m[i][j] + " ");
                System.out.println();
            }

        }
         */


    }
}
