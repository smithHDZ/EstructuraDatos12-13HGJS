package aplicacion;

import javax.swing.*;
import java.util.Arrays;
public class Practica3
{
    public static void main(String[] args) {
        // DECLARACION DE VARIABLES
        int opcion, num, totalOpciones;
        int [][] ma=new int[4][3];
        int n, suma =0 , nmenor=0;
        String cadena = "";


        // VARIABLE String  DONDE SE VAN AGREGANDO LAS OPCIONES DEL MENU
        String menu = "             MENU DE OPCIONES \n";
        menu += "1.  Captura de datos \n";
        menu += "2.  Desplegar matriz \n";
        menu += "3.  suma de elementos \n";
        menu += "4.  elemento menor \n";
        menu += "5.  Salir \n";

        totalOpciones = 5; 
        do {
            opcion = Integer.parseInt (JOptionPane.showInputDialog (menu));
            switch (opcion){
                case 1:
                    for (int i = 0; i < 4; i++) {
                        for (int j = 0; j < 3; j++) {
                            n= Integer.parseInt
                                    (JOptionPane.showInputDialog
                                            (null," Dame numero "));
                        ma[i][j]=n;
                        }
                    }
                    break;
                case 2:
                    for (int i = 0; i < ma.length; i++) {
                        for (int j = 0; j < ma[i].length; j++) {
                        cadena +=ma[i][j] + "";
                        }
                    }
                    JOptionPane.showMessageDialog(null, cadena);
                    break;
                case 3:
                    for (int i = 0; i < ma.length; i++) {
                        for (int j = 0; j < ma[i].length; j++) {
                            suma += ma[i][j];
                        }
                    }
                    JOptionPane.showMessageDialog
                            (null," la suma de la matriz es " + suma);
                    break;
                case 4:
                    int ind1=-1,ind2=-1, menor=1000;
                    for (int i = 0; i < ma.length; i++) {
                        for (int j = 0; j < ma[i].length; j++) {
                            if (ma[i][j] <menor){}
                            menor+=ma[i][j];
                            ind1=i;
                            ind2=j;
                        }
                        }
                    JOptionPane.showMessageDialog
                            (null,"el numero menor de la matriz es "
                                    + menor );
                    break;
                case 5:
                    JOptionPane.showMessageDialog
                            (null, "Fin del Programa");
                    break;
                default:
                    JOptionPane.showMessageDialog
                            (null, "Opción NO válida",
                                    " ¡¡¡Error!!!", JOptionPane.ERROR_MESSAGE);
                    break;
            }  //  FIN DEL SWITCH

        } while (opcion != totalOpciones);   // FIN DEL DO..WHILE

    }
}
