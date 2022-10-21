package aplicacion;
/**
  *   CLASE APLICACION p´racticar lo anterior
  **/
import dominio.Cancion;

import javax.swing.*;
public class Practica2 {
    public static void main(String args [ ]) {
        // DECLARACION DE VARIABLES
        int opcion, num, totalOpciones;
        Cancion playlist [];
        playlist=new Cancion[8];
        String titulo, interprete, s;
        int duracion, i;
        int  cont = -1;

        // VARIABLE String  DONDE SE VAN AGREGANDO LAS OPCIONES DEL MENU
        String menu = "             MENU DE OPCIONES \n";
        menu += "1.  Agregar una cancion a la playlist \n";
        menu += "2.  Mostrarlos dartos \n";
        menu += "3.  Duracion total \n";
        menu += "4.  Canciones de menor duracion \n";
        menu += "5.  Buscar una cancion \n";
        menu += "6.  Canciones de Luis miguel \n";
        menu += "7.  Salir \n";

        totalOpciones = 7;  // ACTUALIZAR SIEMPRE ESTA VARIABLE PARA AJUSTARSE AL TOTAL DE OPCIONES

        // CICLO ITERATIVO QUE PRESENTA EL MENU DE OPCIONES HASTA QUE EL USUARIO SELECCIONE LA OPCION Salir
        do {
            // SE CAPTURA DEL TECLADO UN ENTERO (NUMERO DE LA OPCION) SEGUN EL MENU PRESENTADO
            opcion = Integer.parseInt (JOptionPane.showInputDialog (menu));

            switch (opcion){
                case 1:
                    titulo=JOptionPane.showInputDialog(null, "Titulo de la cancion");
                    interprete=JOptionPane.showInputDialog(null,"Interprete ");
                    duracion= Integer.parseInt((JOptionPane.showInputDialog
                            (null, "duracion de la playlist")));
                    cont++;
                    playlist [cont]=new Cancion(titulo,interprete, duracion);
                    break;

                case 2:
                    s="";
                    for (i = 0; i <= cont; i++) {
                        s += "\nla cancion esta en el indice  ["+ i +"]\n" + playlist[i].toString();
                        JOptionPane.showMessageDialog(null, s);
                    }
                    break;
                case 3:
                    int sumD = 0 ;
                    for (i=0; i <= cont ; i ++){
                        sumD += playlist[i].getDuracion();
                        //playlist[i].setDuracion(sumD);
                    }
                    JOptionPane.showMessageDialog
                            (null,"duracion de playlist \n" + sumD);
                        break;
                case 4://cancion de menor duracion
                    int menorD = 100  ;
                    for (i=0; i<= cont ; i++){
                        if (playlist[i].getDuracion() < menorD){
                            menorD =playlist[i].getDuracion();
                        }
                    }
                    JOptionPane.showMessageDialog(null, "cancion con menor duracion "
                    );

                    break;

                case 5://buscar la cancion
                    String cancion;
                    cancion= JOptionPane.showInputDialog
                            (null,"nombre de la cancion");
                    for (i=0; i<= cont ; i++){

                        if (playlist[i].getTitulo()==cancion){
                         JOptionPane.showMessageDialog
                                 (null,"interprete "+
                                         playlist[i].getInterprete() + "\n" +
                                         "duracion " + playlist[i].getDuracion());
                        }

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


    }  // FIN DEL METODO main

}  // FIN DE LA CLASE
