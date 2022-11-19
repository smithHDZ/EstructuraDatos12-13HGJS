package aplicacion;

import dominio.ColaCircularMaterias;
import dominio.ColaLinealMaterias;
import dominio.Materia;

import javax.swing.*;

public class ExamenUnidad3 {
    public static void main(String[] args) {
        // DECLARACION DE VARIABLES
        ColaLinealMaterias ciencias = new ColaLinealMaterias(12);
        ColaCircularMaterias basicas = new ColaCircularMaterias(12);
        String clave;
        int creditos;

        int opcion, num, totalOpciones;

        // VARIABLE String  DONDE SE VAN AGREGANDO LAS OPCIONES DEL MENU
        String menu = "             MENU DE OPCIONES \n";
        menu += "1.  Insertar Materia \n";
        menu += "2.  Mostrar Materias de Ciencias \n";
        menu += "3.  Mostrar Materias Basicas \n";
        menu += "4.  Eliminar una Materia de Ciencias \n";
        menu += "5.  Eliminar una Todas las materias Basicas";
        menu += "6.  Suma TOTAL de creditos";
        menu += "7.  Matera de Basicas con mas creditos";
        menu += "8.  Salir \n";

        totalOpciones = 8;  
        do {
            opcion = Integer.parseInt (JOptionPane.showInputDialog (menu));
            switch (opcion){
                case 1:
                    /*
                    clave=JOptionPane.showInputDialog(null,
                            "clave de la materia");
                    creditos= Integer.parseInt(JOptionPane.showInputDialog(null,
                            "¿Cuantos creditos tiene"));

                    if (creditos<=5){
                        if (basicas.estaLlena()){
                            JOptionPane.showMessageDialog(null,
                                    "NO puedes ingresar mas materias");
                        } else {
                            basicas.insertar(new Materia(clave, creditos));
                        }
                    } else{
                        ciencias.insertar(new Materia(clave, creditos));
                    }
                    // > mayor que //< menor que
                    break;

                     */
                    if(ciencias.estaLlena()){
                        JOptionPane.showMessageDialog(null,
                                "No hay datos capturados");
                    }else {
                        JOptionPane.showMessageDialog
                                (null, "Materias \n" + ciencias.toString());
                    }
                    break;
                case 3: //Mostrar materias Basicas
                    if(basicas.estaLlena()){
                        JOptionPane.showMessageDialog(null,
                                "No hay datos capturados");
                    }else {
                        JOptionPane.showMessageDialog
                                (null, "Materias \n" + basicas.toString());
                    }
                    break;
                    /*
                case 4://eliminar una matera de ciencias
                    if(ciencias.estaLlena()){
                        JOptionPane.showMessageDialog(null,
                                "No hay datos para eliminar");
                    }else{
                        JOptionPane.showMessageDialog(null,"elemento eliminado \n "+
                                ciencias.eliminar());
                    }
                    break;

                     */
                case 5: //eliminar todas las materias
                    if (basicas.estaVacia()) {
                        JOptionPane.showMessageDialog(null,
                                "No hay materias");
                    }else {
                        JOptionPane.showMessageDialog(null,
                                "Materias eliminadas :\n"
                                        + basicas.eliminarTodo());
                    }
                    break;
                case 6: //sumar total de creditos
                    JOptionPane.showMessageDialog(null,
                            "Los creditos son \n " +
                            basicas.sumacreditos()+ciencias.sumacreditos());
                    break;
                case 7:
                    JOptionPane.showMessageDialog(null,"la materia con mayor credito es \n"
                            + basicas.MateriaMC());
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
