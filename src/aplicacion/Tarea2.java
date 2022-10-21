package aplicacion;

import javax.swing.*;
import java.util.Arrays;
import java.util.Random;

public class Tarea2 {
    public static void main(String[] args) {
        // DECLARACION DE VARIABLES
        int opcion, num, totalOpciones, i ,j;
        int m [][];
        String cadena="";

            int numeroAleatorio = 0,
                    numero=0;

            Random rd = new Random();
            numeroAleatorio = rd.nextInt(10) + 1;

            cadena ="";
        m = new int[numeroAleatorio][numeroAleatorio];

        // VARIABLE String  DONDE SE VAN AGREGANDO LAS OPCIONES DEL MENU
        String menu = "             MENU DE OPCIONES \n";
        menu += "1.  Generar una matriz cuadrada \n";
        menu += "2.  Desplegar la matriz \n";
        menu += "3.  Suma de datos de la matriz \n";
        menu += "4.  sustituir multiplos de 5 por 0 \n";
        menu += "5.  sumar la diagonal principal \n";
        menu += "6.  intercambiar filas \n";
        menu += "7.  Salir \n";

        totalOpciones = 7;  // ACTUALIZAR SIEMPRE ESTA VARIABLE PARA AJUSTARSE AL TOTAL DE OPCIONES

        // CICLO ITERATIVO QUE PRESENTA EL MENU DE OPCIONES HASTA QUE EL USUARIO SELECCIONE LA OPCION Salir
        do {
            // SE CAPTURA DEL TECLADO UN ENTERO (NUMERO DE LA OPCION) SEGUN EL MENU PRESENTADO
            opcion = Integer.parseInt (JOptionPane.showInputDialog (menu));
            switch (opcion){
                case 1://Generar una matriz
                    //creamos numeros random
                    for ( i = 0; i < m.length; i++) {
                        for ( j = 0; j < m[i].length; j++) {
                            Random r = new Random();
                            numero = r.nextInt(100) + 1;
                            m[i][j]=numero;
                            cadena +=m[i][j] + ",";
                        }
                        cadena += "\n";
                    }
                    break;

                case 2://mostrar la matriz creada
                    JOptionPane.showMessageDialog(null, cadena);
                    break;
                case 3: //sumartodo lo que este en la matriZ
                    int suma =0;
                    for ( i = 0; i < m.length; i++) {
                        for ( j = 0; j < m[i].length; j++) {
                            suma += m[i][j];
                        }
                    }
                    JOptionPane.showMessageDialog
                            (null," la suma de la matriz es \n" + suma);
                    break;
                case 4: //sustuir los multiplso de 5
                    for ( i = 0; i < m.length; i++) {
                        for ( j = 0; j < m[i].length; j++) {
                            if (m[i][j] % 5 == 0) {
                                m[i][j] *= 0;
                            }
                            cadena +=m[i][j] + ",";
                        }
                        cadena += "\n";
                    }
                    JOptionPane.showMessageDialog(null, cadena);

                    break;
                case 5:
                    int sumadiagonal =0;
                    for ( i = 0; i < m.length; i++) {
                        for ( j = 0; j < m[i].length; j++) {
                            if (m[i]==m[j]) {
                                sumadiagonal += m[i][j];
                            }
                        }
                    }
                    JOptionPane.showMessageDialog
                            (null," la suma de la diagonal es \n" + sumadiagonal);
                    break;
                case 6:
                    int f1, f2, aux;

                    f1 = Integer.parseInt
                            (JOptionPane.showInputDialog
                                    ("Ingrese la primer fila que quiera intercambiar:"));
                    f2 = Integer.parseInt
                            (JOptionPane.showInputDialog
                                    ("Ingrese la segunda fila que quiera intercambiar:"));
                    try {
                        for(i = 0; i < m.length; i++) {
                            aux = m[f1 - 1][i];
                            m[f1 - 1][i] = m[f2 - 1][i];
                            m[f2 - 1][i] = aux;
                        }
                    }
                    catch (Exception e)
                    {
                        JOptionPane.showMessageDialog(null,"Por favor, ingresa una fila válida");
                    }
                case 7:
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
