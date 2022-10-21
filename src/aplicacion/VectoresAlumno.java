package aplicacion;
/**
 *   CLASE APLICACION PARA MANEJAR 2 VETORES DE ALUMNOS A REAVEZ DE UN MENU
  **/
import dominio.Alumno;

import javax.swing.*;
public class VectoresAlumno {
    public static void main(String args [ ]) {
        //DECLARACION DE VARIABLES
        String nombre, s;
        int grupo;
        float cal1, cal2;
        int i, cont1 = -1, cont2 = -1;
        //menu
        int opcion, num, totalOpciones;
        //declarar 2 vectores
        Alumno [] gp1, gp2;


        //crear el 1er vector
        gp1 =new Alumno[10];
        //crear el 2do vector
        gp2 =new Alumno[15];

        // VARIABLE String  DONDE SE VAN AGREGANDO LAS OPCIONES DEL MENU
        String menu = "             MENU DE OPCIONES \n";
        menu += "\t1.  Capturar un Alumno \n";
        menu += "\t2.  Mostrar alumnos del grupo 1 \n";
        menu += "\t3.  Mostrar alumnos del grupo 2 \n";
        menu += "\t4.  Mostrar reprobados de los dos grupos \n";
        menu += "\t5.  puntos extras \n";
        menu += "\t6.  Promedio mayor del grupo 2 \n";
        menu += "\t7.   salir \n";

        totalOpciones = 7;  // ACTUALIZAR SIEMPRE ESTA VARIABLE PARA AJUSTARSE AL TOTAL DE OPCIONES

        // CICLO ITERATIVO QUE PRESENTA EL MENU DE OPCIONES HASTA QUE EL USUARIO SELECCIONE LA OPCION Salir
        do {
            // SE CAPTURA DEL TECLADO UN ENTERO (NUMERO DE LA OPCION) SEGUN EL MENU PRESENTADO
            opcion = Integer.parseInt (JOptionPane.showInputDialog (menu));

            switch (opcion){
                case 1:
                    //caprurar datos de alumno
                    nombre=JOptionPane.showInputDialog(null,"Nombre del alumno");
                    grupo= Integer.parseInt(JOptionPane.showInputDialog
                            (null, "Grupo"));
                    cal1= Float.parseFloat(JOptionPane.showInputDialog
                            (null, "calificacion 1"));
                    cal2= Float.parseFloat(JOptionPane.showInputDialog
                            (null, "calificacion 2"));
                    if (grupo == 1 )
                    {
                        cont1 ++;
                        gp1 [cont1] =new Alumno(nombre, grupo, cal1, cal2);
                    }  else if ( grupo == 2) {
                        cont2 ++;
                        gp2 [cont2] =new Alumno(nombre, grupo, cal1, cal2);
                    }
                    break;

                case 2:
                    s="";
                    for (i = 0; i <= cont1; i++) { // recorre el vector hasta donde hay alumnos
                        s += "\nAlumno en casilla [" + i + "]\n" + gp1[i].toString();
                        JOptionPane.showMessageDialog(null, s);
                    }
                    break;
                case 3:
                    s="";
                    for (i = 0; i <= cont2; i++) {  // recorre el vector hasta donde hay alumnos
                        s += "\nAlumno en casilla [" + i + "]\n" + gp2[i].toString();
                        JOptionPane.showMessageDialog(null, s);
                    }
                    break;
                case 4:
                    // ver los reprobados
                    s= "Reprobados del grupo 1: \n";
                    for (i = 0; i <= cont1; i++)
                        if ( gp1[i].promedio() < 70)
                            s+= gp1[i].getNombre() +"\n";
                    s+= "Reprobados del grupo 2: \n";
                    for (i = 0; i <= cont2; i++)
                        if ( gp2[i].promedio() < 70)
                            s+= gp2[i].getNombre() + "\n";
                    JOptionPane.showMessageDialog(null, s);
                    break;

                case 5:
                    float suma=0;
                    for (i = 0; i <= cont1; i++)
                    {
                        suma = gp1[i].getCal2();
                        suma += 7;
                        gp1[i].setCal2(suma);
                        if (gp1[i].getCal2() > 100)
                        {
                            gp1[i].setCal2(100);
                        }
                    }
                    System.out.println(gp1[i].getCal2());
                    break;

                case 6:
                    int ind =1;
                    float promMay = -1;
                    for (i = 0 ;i <= cont2; i++ )
                        if (gp2[i].promedio()> promMay){
                           promMay= gp2[i].promedio();
                           ind = i;
                        }
                    System.out.println("alumno promedio mayor es :" + gp2[ind].getNombre() );

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
