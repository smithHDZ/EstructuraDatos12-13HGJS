package aplicacion;

import dominio.ColaCircularVuelos;
import dominio.ColaLinealVuelos;
import dominio.Vuelo;

import javax.swing.*;

public class EUnidad3 {
    public static void main(String [] args)
    { 
        //la aplicacion es un examen de todo  lo que se vio en la unidad de la unidad 3 lo
        // cual es hacerca de las colas lineales y circulares 
        ColaCircularVuelos extranjeros = new ColaCircularVuelos(7);
        ColaLinealVuelos nacionales = new ColaLinealVuelos(7);
        String destino;
        float precio;

        int opcion = 0, totalOpciones;

        String menu = "             MENU DE OPCIONES \n";
        menu += "1.  Insertar vuelo \n";
        menu += "2.  Mostrar vuelos Nacionales \n";
        menu += "3.  Mostrar vuelos Extranjeros \n";
        menu += "4.  Eliminar un vuelo Nacional\n";
        menu += "5.  Eliminar TODOS los vuelos Extranjeros \n";
        menu += "6.  Suma TOTAL de precios \n";
        menu += "7.  Vuelo Extranjero más barato \n";
        menu += "8.  Salir \n";
        totalOpciones = 8;
        while(opcion != totalOpciones)
        {
            opcion = Integer.parseInt(JOptionPane.showInputDialog(menu));
            switch(opcion)
            {
                case 1:
                    destino = JOptionPane.showInputDialog("Ingrese el destino del vuelo");
                    precio = Float.parseFloat(JOptionPane.showInputDialog("Ingrese el precio del vuelo"));
                    if(precio <= 10000){
                        if(nacionales.estaLlena())
                        {
                            JOptionPane.showMessageDialog(null,
                                    "Ya no se pueden añadir más vuelos nacionales!");
                        }
                        else
                        {
                            nacionales.insertar(new Vuelo(destino, precio));
                        }
                    }
                    else {
                        if(extranjeros.estaLlena())
                        {
                            JOptionPane.showMessageDialog(null,
                                    "Ya no se pueden añadir más vuelos extranjeros!");
                        }
                        else
                        {
                            extranjeros.insertar(new Vuelo(destino, precio));
                        }
                    }break;

                case 2:
                    if(nacionales.estaVacia()) {
                        JOptionPane.showMessageDialog(null, "No hay vuelos nacionales para mostrar!");
                    } else {
                        JOptionPane.showMessageDialog(null, "Vuelos nacionales: \n" +
                                nacionales.toString());
                    } break;

                case 3:
                    if(extranjeros.estaVacia()) {
                        JOptionPane.showMessageDialog(null, "No hay vuelos extranjeros para mostrar!");
                    } else {
                        JOptionPane.showMessageDialog(null, "Vuelos extranjeros: \n" + extranjeros.toString());
                    } break;

                case 4:
                    if(nacionales.estaVacia())
                    {
                        JOptionPane.showMessageDialog(null, "No hay vuelos nacionales para eliminar!");
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(null, "Vuelos eliminado: \n" + nacionales.eliminar());
                    }
                    break;

                case 5:
                    if(extranjeros.estaVacia())
                    {
                        JOptionPane.showMessageDialog(null, "No hay vuelos extranjeros para eliminar!");
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(null, "Vuelos eliminado: \n" + extranjeros.vaciarCola());
                    }
                    break;

                case 6:
                    JOptionPane.showMessageDialog(null, "Suma de todos los precios: " +
                            (nacionales.sumaPrecios() + extranjeros.sumaPrecios()));
                    break;

                case 7:
                    if(extranjeros.estaVacia())
                    {
                        JOptionPane.showMessageDialog(null, "No hay vuelos extranjeros para mostrar!");
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(null, "Vuelos de precio menor: \n" + extranjeros.vueloMenor());
                    }
                    break;

                case 8:
                    JOptionPane.showMessageDialog(null, "Adiós!");
                    break;

                default:
                    break;
            }
        }
    }
}
