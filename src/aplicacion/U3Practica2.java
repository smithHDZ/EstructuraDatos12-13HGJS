package aplicacion;

import dominio.ColaCircularString;
import javax.swing.*;

public class U3Practica2 {
    public static void main(String[] args) {
        ColaCircularString cc = new ColaCircularString(8);
        String nombre;

        int opcion, num, totalOpciones;
        String menu = "             MENU DE OPCIONES \n";
        menu += "1.  Capturar de una persona \n";
        menu += "2.  Mostrar lista de personas \n";
        menu += "3.  Eliminar una persona  \n";
        menu += "4.  persona en el frente  \n";
        menu += "5.  persona al final   \n";
        menu += "6.  Nombres que inician con A  \n";
        menu += "7.  Salir \n";

        totalOpciones = 7;
        do {
            opcion = Integer.parseInt (JOptionPane.showInputDialog (menu));

            switch (opcion){
                case 1: //Capturar de una persona
                    if(cc.estaLlena()){
                        JOptionPane.showMessageDialog(null,
                                "No se puede capturar los datos");
                    }else{
                        nombre=JOptionPane.showInputDialog(null, "Dame una numbre");
                        cc.insertar(nombre);
                    }
                    break;
                case 2: //Mostrar lista de personas
                    if(cc.estaLlena()){
                        JOptionPane.showMessageDialog(null,
                                "No se puede capturar los datos");
                    }else{
                        JOptionPane.showMessageDialog(null,"cola de nombres \n "+
                                cc.toString());
                    }
                    break;
                case 3://elimonar una persona
                    if(cc.estaLlena()){
                        JOptionPane.showMessageDialog(null,
                                "No se puede capturar los datos");
                    }else{
                        JOptionPane.showMessageDialog(null,"elemento eliminado \n "+
                                cc.eliminar());
                    }

                    break;
                case 4: //persona en el frente
                    if(cc.estaLlena()){
                        JOptionPane.showMessageDialog(null,
                                "No se puede capturar los datos");
                    }else{
                        JOptionPane.showMessageDialog(null,"elemento de enfrente \n "+
                                cc.elementoEnFrente());
                    }
                    break;
                case 5: //persona final
                    if(cc.estaLlena()){
                        JOptionPane.showMessageDialog(null,
                                "No se puede capturar los datos");
                    }else{
                        JOptionPane.showMessageDialog(null,"elemento de enfrente \n "+
                                cc.elementoEnFin());
                    }
                    break;
                case 6:
                    if(cc.estaLlena()){
                        JOptionPane.showMessageDialog(null,
                                "No se puede capturar los datos");
                    }else{
                        JOptionPane.showMessageDialog(null,"nombres con a \n "+
                                cc.inicial());
                    }
                    break;

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
