package aplicacion;

import dominio.ColaCircularEscuelas;
import dominio.Escuela;

import javax.swing.*;

public class ExamenReg3 {
    public static void main(String[] args) {
        // DECLARACION DE VARIABLES
        ColaCircularEscuelas escuela = new ColaCircularEscuelas(5);
        String nombre ="";
        int numAlmunos;
        int opcion, num, totalOpciones;

        // VARIABLE String  DONDE SE VAN AGREGANDO LAS OPCIONES DEL MENU
        String menu = "             MENU DE OPCIONES \n";
        menu += "1.  Insertar una escuela  \n";
        menu += "2.  Mostrar todas las escuelas \n";
        menu += "3.  Total de alumnos \n";
        menu += "4.  Eliminar TODAS las escuelas \n";
        menu += "5.  Buscar una escuela \n";
        menu += "6.  Salir \n";

        totalOpciones = 6;  // ACTUALIZAR SIEMPRE ESTA VARIABLE PARA AJUSTARSE AL TOTAL DE OPCIONES

        // CICLO ITERATIVO QUE PRESENTA EL MENU DE OPCIONES HASTA QUE EL USUARIO SELECCIONE LA OPCION Salir

        do {
            // SE CAPTURA DEL TECLADO UN ENTERO (NUMERO DE LA OPCION) SEGUN EL MENU PRESENTADO
            opcion = Integer.parseInt (JOptionPane.showInputDialog (menu));

            switch (opcion){
                case 1:
                    if (escuela.estaLlena())
                        JOptionPane.showMessageDialog(null,
                                "Lo sentimos ya no se pueden agregar mas escuelas");
                    else
                        nombre=JOptionPane.showInputDialog(null,"nombre de la escuela");
                        numAlmunos= Integer.parseInt(JOptionPane.showInputDialog(null,
                                "¿cuantos alumnos tiene?"));
                        escuela.insertar(new Escuela(nombre,numAlmunos));
                    break;
                case 2://mostrartodas las escuelas
                    if (escuela.estaVacia())
                    JOptionPane.showMessageDialog (null, "No hay escuelas agregadas");
                    else
                        JOptionPane.showMessageDialog(null,
                                "Las escuelas son \n" + escuela.toString());
                    break;
                case 3: //Total de alumnos
                    if (escuela.estaVacia())
                    JOptionPane.showMessageDialog (null,
                            "No hay escuela y por ello no hay numero de alumnos");
                    else
                        JOptionPane.showMessageDialog(null,
                                "Total de alumnos en las escuelas \n" + escuela.totalAlumnos());
                    break;
                case 4://eliminar todas las escuelas
                    if (escuela.estaVacia())
                    JOptionPane.showMessageDialog (null, "No hay escuelas para eliminar");
                    else
                        JOptionPane.showMessageDialog(null,
                                "Escuelas eliminadas; \n" + escuela.vaciarCola());
                    break;
                case 5:
                    String palabra="";
                    if (escuela.estaVacia())
                        JOptionPane.showMessageDialog(null,
                                "No hay escuelas para buscar");
                    else
                        palabra=JOptionPane.showInputDialog(null,
                                "Cual escuela buscas");
                    JOptionPane.showMessageDialog(null,
                            "Escuela encontrada \n"+ escuela.buscarEscuela(palabra));
                    break;
                case 6:
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
