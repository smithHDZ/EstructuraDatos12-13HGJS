package aplicacion;

import dominio.Listalibros;
import dominio.NodoLibro;
import javax.swing.*;

public class U4Practica1 {
    public static void main(String[] args) {
        Listalibros misterio = new Listalibros();
        Listalibros comedia = new Listalibros();
        NodoLibro n;
        String autor, titulo, isbn;
        float precio;
        int opcion = 0, totalOpciones;

        String menu = "             MENU DE OPCIONES \n";
        menu += "1.   Insertar un libro\n";
        menu += "2.   Mostrar libros de misterio \n" ;
        menu += "3.   Mostrar libros de comedia\n";
        menu += "4.   Eliminar el PRIMER libro de comedia\n";
        menu += "5.   Eliminar el ULTIMO libro de misterio \n" ;
        menu += "6.   Libros on precio mayor a $400 \n";
        menu += "7.   Buscar libro de misterio \n";
        menu += "8.   Aumentar precio de un libro de comedia";
        menu += "9.   Salir \n";
        totalOpciones = 9;

        while(opcion != totalOpciones)
        {
            opcion = Integer.parseInt(JOptionPane.showInputDialog(menu));
            switch(opcion)
            {
                case 1:
                    titulo = JOptionPane.showInputDialog("Ingresa el titulo del libro:");
                    autor = JOptionPane.showInputDialog("Ingresa el autor del libro:");
                    isbn = JOptionPane.showInputDialog("Ingresa el codigo del libro:");
                    precio = Float.parseFloat(JOptionPane.showInputDialog("Ingresa el precio del libro:"));

                    if(isbn.charAt(0) >= 'a' && isbn.charAt(0) <= 'z')
                    {
                        n = new NodoLibro(isbn, autor, titulo, precio);

                        misterio.instertarFinal(n);
                    } else {
                        n = new NodoLibro(isbn, autor, titulo, precio);

                        comedia.instertarFinal(n);
                    }
                    break;

                case 2:
                    if(misterio.listaVacia()) {
                        JOptionPane.showMessageDialog(null,
                    "Lo sentimos, por el momento no hay libros de misterio");
                    } else {
                        JOptionPane.showMessageDialog(null,
                                "Libros de misterio: \n" + misterio.toString());
                    }
                    break;

                case 3:
                    if(comedia.listaVacia()) {
                        JOptionPane.showMessageDialog(null,
                                "Lo sentimos, por el momento no hay libros de comedia");
                    } else {
                        JOptionPane.showMessageDialog(null,
                                "Libros de comedia: \n" + comedia.toString());
                    }
                    break;

                case 4:
                    if(misterio.listaVacia()) {
                        JOptionPane.showMessageDialog(null,
                                "Lo sentimos, por el momento no hay libros de misterio para eliminar");
                    } else {
                        JOptionPane.showMessageDialog(null,
                                "Libros de misterio eliminado: \n" + misterio.eliminaInicio().toString());
                    }
                    break;

                case 5:
                    if(comedia.listaVacia()) {
                        JOptionPane.showMessageDialog(null,
                                "Lo sentimos, por el momento no hay libros de comedia para eliminar");
                    } else                    {
                        JOptionPane.showMessageDialog(null,
                                "Libros de comedia eliminado: \n" + comedia.eliminaInicio().toString());
                    }
                    break;

                case 6:
                    if(misterio.listaVacia() && comedia.listaVacia()) {
                        JOptionPane.showMessageDialog(null,
                                "Lo sentimos, por el momento no hay libros");
                    } else                    {
                        JOptionPane.showMessageDialog(null,
                                "Libros de precio mayor a $400: \n" );
                        comedia.mayorPrecio();
                    }
                    break;

                case 7:
                    String nombre;
                    if(misterio.listaVacia() ){
                        JOptionPane.showMessageDialog(null,
                                "Lo sentimos, por el momento no hay libros de misterios");

                    }else {
                        nombre = JOptionPane.showInputDialog(null,
                                "Nombre del libro de misterio qquiere encontrar");

                        JOptionPane.showMessageDialog(null,
                                "libro buscado se encunetra en la posicion  \n" +
                                        misterio.buscarLibro(nombre));
                    }
                    break;
                case 9:
                    JOptionPane.showMessageDialog(null, "Adiós!");
                    break;

                default:
                    JOptionPane.showMessageDialog(null,
                            "Opción NO válida", " ¡¡¡Error!!!", JOptionPane.ERROR_MESSAGE);
                    break;
            }
        }
    }
}
