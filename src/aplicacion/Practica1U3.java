package aplicacion;

import dominio.ColaString;

import javax.swing.*;

public class Practica1U3 {
    public static void main(String[] args) {
        // DECLARACION DE VARIABLES
        ColaString pcortas = new ColaString(9);
        ColaString plargas = new ColaString(9);
        String palabra;

        int opcion, num, totalOpciones;

        // VARIABLE String  DONDE SE VAN AGREGANDO LAS OPCIONES DEL MENU
        String menu = "             MENU DE OPCIONES \n";
        menu += "1.  leer una palabra \n";
        menu += "2.  Mostrar palabras cortas \n";
        menu += "3.  Mostrar palabras largas \n";
        menu += "4.  Eliminar una palabra corta  \n";
        menu += "5.  Eliminar una palabra larga  \n";
        menu += "6.  Cantidad todal de palabras  \n";
        menu += "7.  Buscar palabras  \n";
        menu += "8.  Salir \n";

        totalOpciones = 8;
        do {
            opcion = Integer.parseInt (JOptionPane.showInputDialog (menu));

            switch (opcion){
                case 1: //leer una palabra
                    palabra=JOptionPane.showInputDialog(null, "Dame unapalabra");
                    if (palabra.length()<5){
                        pcortas.insertar(palabra);
                    }else{
                        plargas.insertar(palabra);
                    }
                    break;
                case 2: //Mostrar palabras cortas
                    if(pcortas.estaVacia()){
                        JOptionPane.showMessageDialog(null,
                                "la cola esta vacia no hay nada que mostrar");
                    }else   {
                        JOptionPane.showMessageDialog(null,
                                "cola de lapabras cortas \n" + pcortas.toString() );
                    }
                    break;
                case 3://Mostrar palabras largas
                    if(plargas.estaVacia()){
                        JOptionPane.showMessageDialog(null,
                                "la cola esta vacia no hay nada que mostrar");
                    }else   {
                        JOptionPane.showMessageDialog(null,
                                "cola de lapabras cortas \n" + plargas.toString() );
                    }
                    break;
                case 4: //Eliminar una palabra corta
                    if(pcortas.estaVacia()){
                        JOptionPane.showMessageDialog(null,
                                "la cola esta vacia no hay nada que mostrar");
                    }else   {
                        JOptionPane.showMessageDialog(null,
                                "elemento eliminado \n" + pcortas.eliminar() );
                    }
                    break;
                case 5: //Eliminar una palabra largas
                    if(plargas.estaVacia()){
                        JOptionPane.showMessageDialog(null,
                                "la cola esta vacia no hay nada que mostrar");
                    }else   {
                        JOptionPane.showMessageDialog(null,
                                "elemento eliminado \n" + plargas.eliminar() );
                    }
                    break;
                case 6:
                    JOptionPane.showMessageDialog(null,
                            "numero de elemenos" + pcortas.numElementos()+plargas.numElementos());

                    break;
                case 7:
                    String buscar;
                    buscar=JOptionPane.showInputDialog(null,
                            "ingresa la palabra que deseas buscar");

                    if(pcortas.estaVacia() && plargas.estaVacia()){
                        JOptionPane.showMessageDialog(null,
                                "las colas estan vacias no hay nada que buscar");
                    }else {
                        if (pcortas.estaVacia()){
                            if (pcortas.buscarpalabra(buscar).equalsIgnoreCase("")) {
                                JOptionPane.showMessageDialog(null,
                                        "no se encontro ninguna palabra");
                            }else{
                                JOptionPane.showMessageDialog(null,
                                        "la palabra \n" + pcortas.buscarpalabra(buscar));
                            }
                        }
                        if (plargas.estaVacia()){
                            if (plargas.buscarpalabra(buscar).equalsIgnoreCase("")) {
                                JOptionPane.showMessageDialog(null,
                                        "no se encontro ninguna palabra");
                            }else{
                                JOptionPane.showMessageDialog(null,
                                        "la palabra \n" + plargas.buscarpalabra(buscar));
                            }
                        }
                    }
                    break;
                case 8:
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
