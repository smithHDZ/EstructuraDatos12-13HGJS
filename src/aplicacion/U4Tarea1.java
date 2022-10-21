package aplicacion;

import dominio.ListaLinealAlumnos;
import dominio.NodoAlumno;

import javax.swing.*;

public class U4Tarea1 {
    public static void main(String[] args) {
        ListaLinealAlumnos lis = new ListaLinealAlumnos();
        NodoAlumno n;
        int ncontro;
        String nombre;
        float calificacion;
        int opcion, num, totalOpciones;

        // VARIABLE String  DONDE SE VAN AGREGANDO LAS OPCIONES DEL MENU
        String menu = "             MENU DE OPCIONES \n";
        menu += "1.   Insertar un alumno al final de la lista\n";
        menu += "2.   Mostrar datos de alumnos de la lista" ;
        menu += "3.   Eliminar el alumno del inicio de la lista\n";
        menu += "4.   Promedio de calificacion\n";
        menu += "5.   Aumentar 5 puntos a las calificaciones" ;
        menu += "6.   Salir \n";

        totalOpciones = 6;  // ACTUALIZAR SIEMPRE ESTA VARIABLE PARA AJUSTARSE AL TOTAL DE OPCIONES

        // CICLO ITERATIVO QUE PRESENTA EL MENU DE OPCIONES HASTA QUE EL USUARIO SELECCIONE LA OPCION Salir
        do {
            // SE CAPTURA DEL TECLADO UN ENTERO (NUMERO DE LA OPCION) SEGUN EL MENU PRESENTADO
            opcion = Integer.parseInt(JOptionPane.showInputDialog(menu));

            switch (opcion) {
                case 1:
                    //leer los datos que van a conformar el nodo
                    ncontro = Integer.parseInt(JOptionPane.showInputDialog(null,
                            "Numero de control del alumno "));
                    nombre = JOptionPane.showInputDialog(null, "nombre del alumno");
                    calificacion = Float.parseFloat(JOptionPane.showInputDialog(null,
                            "calificacion del alumno"));
                    //se necesita crear el nodo
                    n = new NodoAlumno(ncontro, nombre, calificacion);
                    //ahora insertaremos el nodo en la lista AL INICIO
                    lis.instertarFinal(n);
                    break;
                case 2:
                    if (lis.listaVacia())
                        JOptionPane.showMessageDialog(null,
                                "No hay elementos en la lista");
                    else
                    lis.recorreLista();
                    break;
                case 3:
                    if (lis.listaVacia())
                        JOptionPane.showMessageDialog(null,
                                "lo sentimos, no hay elementos que eliminar");
                    else
                    JOptionPane.showMessageDialog(null, "elemento eliminado " +
                            lis.eliminaInicio().toString());
                    break;
                case 4:
                    if (lis.listaVacia())
                        JOptionPane.showMessageDialog(null, "No hay datos en la lista");
                    else
                    JOptionPane.showMessageDialog
                            (null, "el promedio del grupo es " +
                                    lis.promedio());
                    break;
                case 5:
                    if (lis.listaVacia())
                        JOptionPane.showMessageDialog(null, "No hay datos en la lista");
                    else
                        lis.sumaPuntos();
                        JOptionPane.showMessageDialog(null,
                                "Se han agregado 5 puntos exitosamente");
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
