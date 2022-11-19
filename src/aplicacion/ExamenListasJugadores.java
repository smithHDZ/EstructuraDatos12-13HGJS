package aplicacion;

import dominio.ListaJugadores;
import dominio.NodoJugador;
import javax.swing.*;

public class ExamenListasJugadores {
    public static void main(String[] args) {
        ListaJugadores jugador =new ListaJugadores();
        NodoJugador j;
        String nombre, jug;
        float goles;
        int opcion, num, totalOpciones;

        // VARIABLE String  DONDE SE VAN AGREGANDO LAS OPCIONES DEL MENU
        String menu = "           MENU DE OPCIONES \n";
        menu += "1.  Insertar un jugador al Inicio \n";
        menu += "2.  Insertar un jugador al Final \n";
        menu += "3.  Mostrar lista de jugadores \n";
        menu += "4.  Eliminar un jugador \n";
        menu += "5.  Total de goles\n";
        menu += "6.  Jugador con mas goles\n";
        menu += "7.  Salir \n";

        totalOpciones = 7;  
        do {
            // SE CAPTURA DEL TECLADO UN ENTERO (NUMERO DE LA OPCION) SEGUN EL MENU PRESENTADO
            opcion = Integer.parseInt (JOptionPane.showInputDialog (menu));
            switch (opcion){
                case 1: //Insertar un jugador al Inicio
                    nombre=JOptionPane.showInputDialog(null,
                            "Nombre del jugador");
                    goles= Float.parseFloat(JOptionPane.showInputDialog(null,
                            "Goles anotados"));
                    j=new NodoJugador(nombre,goles);
                    jugador.insertaInicio(j);
                    break;

                case 2: //Insertar un jugador al Final
                    nombre=JOptionPane.showInputDialog(null,
                            "Nombre del jugador");
                    goles= Float.parseFloat(JOptionPane.showInputDialog(null,
                            "Goles anotados"));
                    j=new NodoJugador(nombre,goles);
                    jugador.instertarFinal(j);
                    break;

                case 3: //Mostrar lista de jugadores
                    if (jugador.listaVacia())
                        JOptionPane.showMessageDialog(null,"No hay jugadores registrados");
                    else
                        jugador.recorreLista();
                    break;

                case 4:
                    //Eliminar un jugador buscandolo en el nodo
                    //caso sin resolver ni solucion :(
                    if (jugador.listaVacia())
                        JOptionPane.showMessageDialog(null,
                                "NO hay jugadores a elimminar");
                    else
                        jug=JOptionPane.showInputDialog(null,
                                "a que jugador deseas eliminar");
                    break;

                case 5: //total de goles
                    if (jugador.listaVacia())
                        JOptionPane.showMessageDialog(null,
                                "NO hay jugadores en la lista \n y por eso tampoco hay goles ");
                    else
                        JOptionPane.showMessageDialog(null,
                                "esta temporada se tubo un total de \n" + jugador.totalGoles() + " goles ");
                    break;
                case 6: //Jugador con mas goles
                    if (jugador.listaVacia())
                        JOptionPane.showMessageDialog(null,
                                "NO hay jugadores en la lista \n y por eso tampoco hay goleador ");
                    else
                        JOptionPane.showMessageDialog(null,
                                "El mejor jugador es " + jugador.mejorjugador() +
                                        "\n siendo el goleador de esta temporada");
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
