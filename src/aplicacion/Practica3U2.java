package aplicacion;

import dominio.Factura;
import dominio.PilaChar;

import javax.swing.*;

public class Practica3U2 {
    public static void main(String args[]) {
        // DECLARACION DE VARIABLES
        PilaChar letras = new PilaChar();
        PilaChar signos = new PilaChar();
        PilaChar numeros = new PilaChar();
        int opcion, num, totalOpciones;
        String enunciado;
        // VARIABLE String  DONDE SE VAN AGREGANDO LAS OPCIONES DEL MENU
        String menu = "             MENU DE OPCIONES \n";
        menu += "1.  Leer un  enunciado \n";
        menu += "2.  Mostrar pilas de letras \n";
        menu += "3.  Mostrar pilas de digitos \n";
        menu += "4.  Mostrar pilas de signos  \n";
        menu += "5.  Salir \n";

        totalOpciones = 5; 
        do {
            opcion = Integer.parseInt(JOptionPane.showInputDialog(menu));
            switch (opcion) {
                case 1:
                    //leer un enunciado
                    letras.vaciaPila();
                    numeros.vaciaPila();
                    signos.vaciaPila();

                    enunciado = JOptionPane.showInputDialog(null, "dame la frase");

                    for (int i = 0; i < enunciado.length(); i++) {

                        if (enunciado.charAt(i) != ' ') {
                            if (enunciado.charAt(i) >= 'a' && enunciado.charAt(i) <= 'z') {
                                letras.insertar(enunciado.charAt(i));
                            } else if (enunciado.charAt(i) >= '0' && enunciado.charAt(i) <= '9') {
                                numeros.insertar(enunciado.charAt(i));
                            } else {
                                signos.insertar(enunciado.charAt(i));
                            }
                        }
                    }
                    break;
                case 2:
                    //mostrar pilas de letras
                    JOptionPane.showMessageDialog
                            (null, letras.toString() );
                    break;
                case 3:
                    JOptionPane.showMessageDialog
                            (null, numeros.toString() );
                    break;
                case 4:
                    JOptionPane.showMessageDialog
                            (null, signos.toString() );
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
