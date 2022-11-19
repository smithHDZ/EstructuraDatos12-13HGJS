package aplicacion;
/**
 *
 *   CLASE APLICACION PARA EJEMPLIFICAR
 *   EL USO DE UN MENÚ DE OPCIONES
 *   PRESENTADO ITERATIVAMENTE
 *
 **/
import dominio.Listalibros;
import dominio.NodoLibro;

import javax.swing.JOptionPane;
public class UsaMenu{
    public static void main(String args [ ]) {
        // DECLARACION DE VARIABLES
        Listalibros misterio =new Listalibros();
        Listalibros comedia = new Listalibros();
        NodoLibro n;
        String isbn, titulo, autor;
        float precio;
        int opcion, num, totalOpciones;

        // VARIABLE String  DONDE SE VAN AGREGANDO LAS OPCIONES DEL MENU
        String menu = "             MENU DE OPCIONES \n";
        menu += "1.  Insertar un libro \n";
        menu += "2.  Mostar libros de Misterio \n";
        menu += "3.  Mostrar libros de comedia \n";
        menu += "4.  Eliminar el PRIMER libro de misterio \n";
        menu += "5.  Eliminar el ULTIMO libro de comedia";
        menu += "6.  LIbros de precio mayor a $400 pesos";
        menu += "7.  Salir \n";
        totalOpciones = 7;  // ACTUALIZAR SIEMPRE ESTA VARIABLE PARA AJUSTARSE AL TOTAL DE OPCIONES

        // CICLO ITERATIVO QUE PRESENTA EL MENU DE OPCIONES HASTA QUE EL USUARIO SELECCIONE LA OPCION Salir
        do {
            // SE CAPTURA DEL TECLADO UN ENTERO (NUMERO DE LA OPCION) SEGUN EL MENU PRESENTADO
            opcion = Integer.parseInt (JOptionPane.showInputDialog (menu));

            switch (opcion){
                case 1:
                    //insertar un libro
                    isbn=JOptionPane.showInputDialog(null,"ISBN del libro");
                    titulo=JOptionPane.showInputDialog(null,
                            "Titulo del libro");
                    autor=JOptionPane.showInputDialog(null,
                            "Nombre dle autor");
                    precio= Float.parseFloat(JOptionPane.showInputDialog(null,
                            "Precio del libro"));

                    if (isbn.charAt(0)>='a' || isbn.charAt(0)<='z') {
                        n = new NodoLibro(isbn, titulo, autor, precio);
                        misterio.insertaInicio(n);
                    }else
                        n = new NodoLibro(isbn, titulo, autor, precio);
                        comedia.insertaInicio(n);
                        break;
                case 2:
                    if (misterio.listaVacia())
                        JOptionPane.showMessageDialog(null, "No hay libros de misterio");
                    else
                        misterio.recorreLista();
                    break;
                case 3:
                    if (comedia.listaVacia())
                        JOptionPane.showMessageDialog(null, "No hay libros de comedia");
                    else
                        comedia.recorreLista();
                    break;
                case 4:
                    if (misterio.listaVacia())
                        JOptionPane.showMessageDialog(null, "No hay libros de misterio");
                    else
                    JOptionPane.showMessageDialog
                            (null, misterio.eliminaInicio());
                    break;
                case 5:
                    if (comedia.listaVacia())
                        JOptionPane.showMessageDialog(null, "No hay libros de comedia");
                    else
                        JOptionPane.showMessageDialog
                                (null, comedia.eliminaInicio());
                    break;
                case 6:
                    if (misterio.listaVacia() && comedia.listaVacia())
                        JOptionPane.showMessageDialog(null,"no hay libros");
                    else
                        JOptionPane.showMessageDialog(null,
                                "Lista de libros mayor a 400 \n" );
                                misterio.mayorPrecio();
                                comedia.mayorPrecio();
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
